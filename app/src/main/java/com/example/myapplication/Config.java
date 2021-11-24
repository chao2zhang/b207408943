package com.example.myapplication;

import androidx.annotation.Nullable;

public class Config {

    @Nullable private final Metric metric;

    private Config(@Nullable Metric metric) {
        this.metric = metric;
    }

    @Nullable
    public Metric getMetric() {
        return metric;
    }

    public static Config create(@Nullable Metric metric) {
        return new Config(metric);
    }
}
