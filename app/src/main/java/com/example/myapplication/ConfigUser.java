package com.example.myapplication;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

@Keep
public class ConfigUser {

    private final ConfigHolder config;

    public ConfigUser(@NonNull ConfigHolder configHolder) {
        this.config = configHolder;
    }

    public void foo() {
        System.out.println("foo()");
        if (config.getMetric() != null) {
            System.out.println(config.getMetric().toString());
        }
    }
}
