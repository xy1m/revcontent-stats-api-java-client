package com.xy1m.internal.factories;

/**
 * <p>
 * Endpoints factory, creates interface implementations
 * </p>
 * @author xy1m
 * @since 1.0.0
 */
public interface RevContentEndpointsFactory {

    /**
     * Creates authentication endpoint
     * @param endpointClazz interface representing endpoint
     * @param <A> represents endpoint class
     * @return implementation of a supplied endpoint class
     */
    <A> A createAuthEndpoint(Class<A> endpointClazz);

    /**
     * Creates endpoint
     * @param endpointClazz interface representing endpoint
     * @param <E> represents auth endpoint class
     * @return implementation of a supplied endpoint class
     */
    <E> E createEndpoint(Class<E> endpointClazz);
}
