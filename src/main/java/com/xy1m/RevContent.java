package com.xy1m;

import com.xy1m.internal.AuthenticationEndpoint;
import com.xy1m.internal.BoostEndpoint;
import com.xy1m.internal.BoostPerformanceEndpoint;
import com.xy1m.internal.CommunicationFactory;
import com.xy1m.internal.ContentEndpoint;
import com.xy1m.internal.HelperEndpoint;
import com.xy1m.internal.config.CommunicationConfig;
import com.xy1m.internal.config.SerializationConfig;
import com.xy1m.internal.factories.RevContentEndpointsFactory;
import com.xy1m.internal.factories.RevContentEndpointsRetrofitFactory;
import com.xy1m.services.BoostPerformanceService;
import com.xy1m.services.BoostPerformanceServiceImpl;
import com.xy1m.services.BoostsService;
import com.xy1m.services.BoostsServiceImpl;
import com.xy1m.services.ContentsService;
import com.xy1m.services.ContentsServiceImpl;
import com.xy1m.services.HelpersService;
import com.xy1m.services.HelpersServiceImpl;
import com.xy1m.services.RevContentAuthenticationService;
import com.xy1m.services.RevContentAuthenticationServiceImpl;

public class RevContent {
    private static RevContent instance = RevContent.builder().build();
    private final RevContentAuthenticationService revContentAuthenticationService;
    private final BoostsService boostsService;
    private final BoostPerformanceService boostPerformanceService;
    private final HelpersService helpersService;
    private final ContentsService contentsService;

    private RevContent(RevContentAuthenticationService revContentAuthenticationService,
                       BoostsService boostsService,
                       BoostPerformanceService boostPerformanceService,
                       HelpersService helpersService,
                       ContentsService contentsService
    ) {

        this.revContentAuthenticationService = revContentAuthenticationService;
        this.boostsService = boostsService;
        this.boostPerformanceService = boostPerformanceService;
        this.helpersService = helpersService;
        this.contentsService = contentsService;
    }

    public static RevContent getInstance() {
        return instance;
    }

    public static RevContentBuilder builder() {
        return new RevContentBuilder();
    }

    public BoostsService campaignsService() {
        return boostsService;
    }

    public BoostsService boostsService() {
        return boostsService;
    }

    public BoostPerformanceService boostPerformanceService() {
        return boostPerformanceService;
    }

    public RevContentAuthenticationService authenticationService() {
        return revContentAuthenticationService;
    }

    public HelpersService helpersService() {
        return helpersService;
    }

    public ContentsService contentsService() {
        return contentsService;
    }
    //TODO support async services

    public static class RevContentBuilder {
        private static final String DEFAULT_BACKSTAGE_HOST = "https://api.revcontent.io/";
        private static final String DEFAULT_AUTH_BACKSTAGE_HOST = "https://api.revcontent.io/";
        private static final String DEFAULT_USER_AGENT = "RevContent Stats API Java Client";
        private static final String VERSION = "v1.0";
        private static final int DEFAULT_MAX_IDLE_CONNECTIONS = 5;
        private static final long DEFAULT_KEEP_ALIVE_DURATION_MILLIS = 300_000L;
        private static final SerializationConfig DEFAULT_SERIALIZATION_CONFIG = new SerializationConfig();

        private String baseUrl = DEFAULT_AUTH_BACKSTAGE_HOST;
        private String authBaseUrl = DEFAULT_AUTH_BACKSTAGE_HOST;
        private String userAgent = DEFAULT_USER_AGENT;
        private long writeTimeoutMillis = 0L;
        private long connectionTimeoutMillis = 0L;
        private long readTimeoutMillis = 0L;
        private int maxIdleConnections = DEFAULT_MAX_IDLE_CONNECTIONS;
        private long keepAliveDurationMillis = DEFAULT_KEEP_ALIVE_DURATION_MILLIS;
        private boolean performClientValidations = true;
        private boolean debug = false;
        private boolean organizeDynamicColumns = true;
        private SerializationConfig serializationConfig = DEFAULT_SERIALIZATION_CONFIG;

        public RevContentBuilder setBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        public RevContentBuilder setAuthBaseUrl(String authBaseUrl) {
            this.authBaseUrl = authBaseUrl;
            return this;
        }

        public RevContentBuilder setUserAgent(String userAgent) {
            this.userAgent = userAgent;
            return this;
        }

        public RevContentBuilder setConnectionTimeoutMillis(Long connectionTimeoutMillis) {
            this.connectionTimeoutMillis = connectionTimeoutMillis;
            return this;
        }

        public RevContentBuilder setReadTimeoutMillis(Long readTimeoutMillis) {
            this.readTimeoutMillis = readTimeoutMillis;
            return this;
        }

        public RevContentBuilder setWriteTimeoutMillis(Long writeTimeoutMillis) {
            this.writeTimeoutMillis = writeTimeoutMillis;
            return this;
        }

        public RevContentBuilder setMaxIdleConnections(Integer maxIdleConnections) {
            this.maxIdleConnections = maxIdleConnections;
            return this;
        }

        public RevContentBuilder setKeepAliveDurationMillis(Long keepAliveDurationMillis) {
            this.keepAliveDurationMillis = keepAliveDurationMillis;
            return this;
        }

        public RevContentBuilder setPerformClientValidations(Boolean performClientValidations) {
            this.performClientValidations = performClientValidations;
            return this;
        }

        public RevContentBuilder setDebug(Boolean debug) {
            this.debug = debug;
            return this;
        }

        public RevContentBuilder setOrganizeDynamicColumns(Boolean organizeDynamicColumns) {
            this.organizeDynamicColumns = organizeDynamicColumns;
            return this;
        }

        public RevContentBuilder setSerializationConfig(SerializationConfig serializationConfig) {
            this.serializationConfig = serializationConfig;
            return this;
        }

        public RevContent build() {
            String finalUserAgent = String.format("RevContent/%s (%s)", VERSION, userAgent);
            CommunicationConfig config = new CommunicationConfig(baseUrl, authBaseUrl, connectionTimeoutMillis,
                    readTimeoutMillis, writeTimeoutMillis, maxIdleConnections, keepAliveDurationMillis,
                    finalUserAgent, debug);
            CommunicationFactory communicator = new CommunicationFactory(config, serializationConfig);
            RevContentEndpointsFactory endpointsFactory = new RevContentEndpointsRetrofitFactory(communicator);
            return new RevContent(
                    new RevContentAuthenticationServiceImpl(
                            endpointsFactory.createAuthEndpoint(AuthenticationEndpoint.class)),
                    new BoostsServiceImpl(performClientValidations,
                            endpointsFactory.createEndpoint(BoostEndpoint.class)),
                    new BoostPerformanceServiceImpl(performClientValidations,
                            endpointsFactory.createEndpoint(BoostPerformanceEndpoint.class)),
                    new HelpersServiceImpl(performClientValidations,
                            endpointsFactory.createEndpoint(HelperEndpoint.class)),
                    new ContentsServiceImpl(performClientValidations,
                            endpointsFactory.createEndpoint(ContentEndpoint.class)) {}
            );
        }
    }
}
