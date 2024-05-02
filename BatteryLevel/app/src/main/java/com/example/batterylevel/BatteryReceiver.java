package com.example.batterylevel;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BatteryManager;
import android.widget.ProgressBar;
import android.widget.TextView;

public class BatteryReceiver extends BroadcastReceiver {

    private TextView textBatteryLevel;
    private ProgressBar progressBarBattery;

    public BatteryReceiver(TextView textBatteryLevel, ProgressBar progressBarBattery) {
        this.textBatteryLevel = textBatteryLevel;
        this.progressBarBattery = progressBarBattery;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction() != null && intent.getAction().equals(Intent.ACTION_BATTERY_CHANGED)) {
            int level = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, 0);
            int scale = intent.getIntExtra(BatteryManager.EXTRA_SCALE, 100);
            int batteryLevel = (level * 100) / scale;

            textBatteryLevel.setText("Battery Level: " + batteryLevel + "%");
            progressBarBattery.setProgress(batteryLevel);
        }
    }
}
