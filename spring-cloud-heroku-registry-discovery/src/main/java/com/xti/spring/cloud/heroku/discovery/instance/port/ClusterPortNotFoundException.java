package com.xti.spring.cloud.heroku.discovery.instance.port;

public class ClusterPortNotFoundException extends Exception {

    public ClusterPortNotFoundException(String message) {
        super(message);
    }

}
