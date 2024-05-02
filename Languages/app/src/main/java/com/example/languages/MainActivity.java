package com.example.languages;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        EdgeToEdge.enable(this);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        setContentView(R.layout.activity_main);
        Button cppbtn = findViewById(R.id.btncpp);
        Button javabtn = findViewById(R.id.btnjava);
        Button javascriptbtn = findViewById(R.id.btnjavascript);
        Button pythonbtn = findViewById(R.id.btnpython);


        cppbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Button Triggered", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,CppActivity.class);
                startActivity(intent);
            }
        });
        javabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Button Triggered", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,JavaActivity.class);
                startActivity(intent);
            }
        });
        javascriptbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Button Triggered", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,JavascriptActivity.class);
                startActivity(intent);

            }
        });

        pythonbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Button Triggered", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,PythonActivity.class);
                startActivity(intent);
            }
        });

    }
}