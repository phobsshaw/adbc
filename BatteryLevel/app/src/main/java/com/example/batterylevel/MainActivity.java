package com.example.batterylevel;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textBatteryLevel;
    private ProgressBar progressBarBattery;
    private BatteryReceiver batteryReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textBatteryLevel = findViewById(R.id.textBatteryLevel);
        progressBarBattery = findViewById(R.id.progressBarBattery);

        // Initialize the broadcast receiver
        batteryReceiver = new BatteryReceiver(textBatteryLevel, progressBarBattery);

        // Register the broadcast receiver to listen for battery level changes
        IntentFilter intentFilter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
        registerReceiver(batteryReceiver, intentFilter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Unregister the broadcast receiver when the activity is destroyed
        unregisterReceiver(batteryReceiver);
    }
}
