package com.xy1m.internal.functional;

@FunctionalInterface
public interface BiFunction<A,B,R,T extends Throwable> {
    R apply(A a, B b) throws T;
}
