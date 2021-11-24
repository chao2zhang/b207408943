package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ConfigHolder {

    @Nullable
    private Config config;

    ConfigHolder() {
    }

    public void setConfig(@NonNull Config config) {
        this.config = config;
    }

    @Nullable
    public Metric getMetric() {
        return config != null && config.getMetric() != null
                ? config.getMetric()
                : Metric.FALLBACK;
    }
}
