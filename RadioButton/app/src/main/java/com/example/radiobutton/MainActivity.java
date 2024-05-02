package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroupGender;
    private RadioButton radioButtonMale, radioButtonFemale;
    private ImageView imageViewMale, imageViewFemale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        radioGroupGender = findViewById(R.id.radioGroupGender);
        radioButtonMale = findViewById(R.id.radioButtonMale);
        radioButtonFemale = findViewById(R.id.radioButtonFemale);
        imageViewMale = findViewById(R.id.imageViewMale);
        imageViewFemale = findViewById(R.id.imageViewFemale);

        // Set image views initially hidden
        imageViewMale.setVisibility(ImageView.GONE);
        imageViewFemale.setVisibility(ImageView.GONE);

        // Set radio button click listeners
        radioButtonMale.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    imageViewMale.setVisibility(ImageView.VISIBLE);
                    imageViewFemale.setVisibility(ImageView.GONE);
                }
            }
        });

        radioButtonFemale.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    imageViewMale.setVisibility(ImageView.GONE);
                    imageViewFemale.setVisibility(ImageView.VISIBLE);
                }
            }
        });

        // Set radio group click listener to handle deselection
        radioGroupGender.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == -1) {
                    // No radio button is selected, hide both image views
                    imageViewMale.setVisibility(ImageView.GONE);
                    imageViewFemale.setVisibility(ImageView.GONE);
                }
            }
        });
    }
}
