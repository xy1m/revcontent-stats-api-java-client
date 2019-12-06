package com.xy1m.internal.config;

public class CommunicationConfig {

    private final String baseUrl;
    private final String authenticationBaseUrl;
    private final long connectionTimeoutMillis;
    private final long readTimeoutMillis;
    private final long writeTimeoutMillis;
    private final int maxIdleConnections;
    private final long keepAliveDurationMillis;
    private final String userAgent;
    private final boolean debug;

    public CommunicationConfig(String baseUrl, String authenticationBaseUrl, Long connectionTimeoutMillis, Long readTimeoutMillis,
                               Long writeTimeoutMillis, Integer maxIdleConnections, Long keepAliveDurationMillis, String userAgent, boolean debug) {
        this.baseUrl = baseUrl;
        this.authenticationBaseUrl = authenticationBaseUrl;
        this.connectionTimeoutMillis = connectionTimeoutMillis;
        this.readTimeoutMillis = readTimeoutMillis;
        this.writeTimeoutMillis = writeTimeoutMillis;
        this.maxIdleConnections = maxIdleConnections;
        this.keepAliveDurationMillis = keepAliveDurationMillis;
        this.userAgent = userAgent;
        this.debug = debug;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public String getAuthenticationBaseUrl() {
        return authenticationBaseUrl;
    }

    public long getConnectionTimeoutMillis() {
        return connectionTimeoutMillis;
    }

    public long getReadTimeoutMillis() {
        return readTimeoutMillis;
    }

    public long getWriteTimeoutMillis() {
        return writeTimeoutMillis;
    }

    public int getMaxIdleConnections() {
        return maxIdleConnections;
    }

    public long getKeepAliveDurationMillis() {
        return keepAliveDurationMillis;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public boolean isDebug() {
        return debug;
    }

    @Override
    public String toString() {
        return "CommunicationConfig{" +
                "baseUrl='" + baseUrl + '\'' +
                ", authenticationBaseUrl='" + authenticationBaseUrl + '\'' +
                ", connectionTimeoutMillis=" + connectionTimeoutMillis +
                ", readTimeoutMillis=" + readTimeoutMillis +
                ", writeTimeoutMillis=" + writeTimeoutMillis +
                ", maxIdleConnections=" + maxIdleConnections +
                ", keepAliveDurationMillis=" + keepAliveDurationMillis +
                ", userAgent='" + userAgent + '\'' +
                ", debug=" + debug +
                '}';
    }
}
