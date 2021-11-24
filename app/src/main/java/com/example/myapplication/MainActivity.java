package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.crash).setOnClickListener(view -> crash()
        );
    }

    private void crash() {
        EditText editText = findViewById(R.id.edit_text);
        String content = editText.getText().toString();
        Metric metric;
        if (content.isEmpty()) {
            metric = null;
        } else {
            metric = Metric.TYPE_MISSING;
        }
        ConfigHolder configHolder = new ConfigHolder();
        configHolder.setConfig(Config.create(metric));
        new ConfigUser(configHolder).foo();
    }
}
