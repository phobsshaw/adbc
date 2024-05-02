package com.example.bintohex;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.bintohex.R;

public class MainActivity extends AppCompatActivity {

    private EditText numberInput;
    private Spinner conversionTypeSpinner;
    private TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberInput = findViewById(R.id.numberInput);
        conversionTypeSpinner = findViewById(R.id.conversionTypeSpinner);
        resultText = findViewById(R.id.resultText);

        // Populate the spinner with conversion options
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.conversion_types, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        conversionTypeSpinner.setAdapter(adapter);
    }

    public void convertNumber(View view) {
        String input = numberInput.getText().toString().trim();

        if (!input.isEmpty()) {
            try {
                int number = Integer.parseInt(input);

                // Get the selected conversion type from the spinner
                String conversionType = conversionTypeSpinner.getSelectedItem().toString();

                if (conversionType.equals("Binary")) {
                    String binary = Integer.toBinaryString(number);
                    resultText.setText("Binary: " + binary);
                } else if (conversionType.equals("Hexadecimal")) {
                    String hex = Integer.toHexString(number).toUpperCase();
                    resultText.setText("Hexadecimal: " + hex);
                }

            } catch (NumberFormatException e) {
                resultText.setText("Invalid input");
            }
        } else {
            resultText.setText("Enter a number");
        }
    }
}
