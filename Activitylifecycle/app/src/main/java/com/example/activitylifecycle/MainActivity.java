package com.example.activitylifecycle;



import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button onStart,onResume,onPause,onStop,onRestart,onDestroy;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        onStart = (Button) findViewById(R.id.onStart);
        onResume = (Button) findViewById(R.id.onResume);
        onPause = (Button) findViewById(R.id.onPause);
        onStop = (Button) findViewById(R.id.onStop);
        onRestart = (Button) findViewById(R.id.onRestart);
        onDestroy = (Button) findViewById(R.id.onDestroy);

        onStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onStart();
            }
        });

        onResume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onResume();
            }
        });

        onPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onPause();
            }
        });

        onRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRestart();
            }
        });

        onStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onStop();
            }
        });

        onDestroy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onDestroy();
            }
        });

        Toast.makeText(MainActivity.this,"onCreate() method called",Toast.LENGTH_SHORT).show();
        Log.d("Activity Lifecycle","onCreate() method called");
    }

    @Override
    protected void onStart()
    {
        super.onStart();

        Toast.makeText(MainActivity.this,"onStart() method called",Toast.LENGTH_SHORT).show();
        Log.d("Activity Lifecycle","onStart() method called");
    }

    @Override
    protected void onResume()
    {
        super.onResume();

        Toast.makeText(MainActivity.this,"onResume() method called",Toast.LENGTH_SHORT).show();
        Log.d("Activity Lifecycle","onResume() method called");
    }

    @Override
    protected void onPause()
    {
        super.onPause();

        Toast.makeText(MainActivity.this,"onPause() method called",Toast.LENGTH_SHORT).show();
        Log.d("Activity Lifecycle","onPause() method called");
    }

    @Override
    protected void onStop()
    {
        super.onStop();

        Toast.makeText(MainActivity.this,"onStop() method called",Toast.LENGTH_SHORT).show();
        Log.d("Activity Lifecycle","onStop() method called");
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();

        Toast.makeText(MainActivity.this,"onRestart() method called",Toast.LENGTH_SHORT).show();
        Log.d("Activity Lifecycle","onRestart() method called");
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();

        Toast.makeText(MainActivity.this,"onDestroy() method called",Toast.LENGTH_SHORT).show();
        Log.d("Activity Lifecycle","onDestroy() method called");

        System.exit(0);
    }




}