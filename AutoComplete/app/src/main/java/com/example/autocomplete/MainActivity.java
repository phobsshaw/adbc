package com.example.autocomplete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.example.autocomplete.R;

public class MainActivity extends AppCompatActivity {
    private AutoCompleteTextView autoCompleteTextView;
    private String[] country = {"Australia","Africa","Bangladesh","Japan","India","Indonesia","Iran","Azkaban",

            "Apple", "Australia", "Africa",
            "Bnana", "Brazil", "Belgium"
            ,"Cat", "Canada", "China"
            ,"Dog", "Denmark", "Dubai"
            ,"Elephant", "England", "Egypt"
            ,"Fish", "France", "Fiji"
            ,"Grape", "Germany", "Ghana"
            ,"Horse", "Hungary", "Hawaii"
            ,"India", "Indonesia", "Iran"
            ,"J","Jaguar", "Japan", "Jamaica"
            ,"K","Kangaroo", "Kenya", "Korea"
            ,"L","Lion", "Laos", "Lebanon"
            ,"M","Monkey", "Mexico", "Malaysia"
            ,"N","Nut", "Norway", "Nepal"
            ,"O","Orange", "Oman", "Ontario"
            ,"P","Pineapple", "Peru", "Portugal"
            ,"Q","Queen", "Qatar", "Quebec"
            ,"R","Rabbit", "Russia", "Rwanda"
            ,"S","Snake", "Spain", "Sweden"
            ,"T","Tiger", "Thailand", "Turkey"
            ,"U","Umbrella", "Uganda", "Uruguay"
            ,"V","Vanilla", "Vietnam", "Venezuela"
            ,"W","Whale", "Wales", "Washington"
            ,"X","Xylophone", "Xiamen", "Xerox"
            ,"Y","Yak", "Yemen", "Yorkshire"
            ,"Z","Zebra", "Zambia", "Zimbabwe"


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        autoCompleteTextView = findViewById(R.id.autoComplete);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line,country);
        autoCompleteTextView.setThreshold(1);
        autoCompleteTextView.setAdapter(arrayAdapter);
    }
}