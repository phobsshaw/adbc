package com.example.imagerotation;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Bitmap originalBitmap;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.button);
        imageView = findViewById(R.id.image);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotateImage(90);
            }
        });
    }

    public void rotateImage(float degrees){
        Bitmap bitmap = ((BitmapDrawable) imageView.getDrawable()).getBitmap();
        // Create a matrix for the rotation
        Matrix matrix = new Matrix();
        matrix.postRotate(degrees);

        // Rotate the bitmap
        Bitmap rotatedBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);


        // Set the rotated bitmap back to the ImageView
        imageView.setImageBitmap(rotatedBitmap);
    }
}