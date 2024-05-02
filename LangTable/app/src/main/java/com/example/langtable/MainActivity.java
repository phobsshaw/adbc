package com.example.langtable;

import static com.example.langtable.R.*;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TableRow;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the TableLayout
        TableRow javaRow = findViewById(R.id.javaRow);
        TableRow pythonRow = findViewById(R.id.pythonRow);
        TableRow cppRow = findViewById(R.id.cppRow);

        // Set onClick listeners for each TableRow to open URL
        javaRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl("http://java.com");
            }
        });

        pythonRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl("http://python.com");
            }
        });

        cppRow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openUrl("http://cplusplus.com");
            }
        });
    }

    private void openUrl(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}
