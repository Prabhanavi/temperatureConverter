package com.prabhatmishra.temperaturecovertr;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText inputTemperature;
    private Button celsiusToFahrenheitButton;
    private Button fahrenheitToCelsiusButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputTemperature = findViewById(R.id.inputTemperature);
        celsiusToFahrenheitButton = findViewById(R.id.celsiusToFahrenheitButton);
        fahrenheitToCelsiusButton = findViewById(R.id.fahrenheitToCelsiusButton);
        resultTextView = findViewById(R.id.resultTextView);

        celsiusToFahrenheitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertCelsiusToFahrenheit();
            }
        });

        fahrenheitToCelsiusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertFahrenheitToCelsius();
            }
        });
    }

    private void convertCelsiusToFahrenheit() {
        double celsius = Double.parseDouble(inputTemperature.getText().toString());
        double fahrenheit = (celsius * 9/5) + 32;
        resultTextView.setText(String.format("%.2f°C is %.2f°F", celsius, fahrenheit));
    }

    private void convertFahrenheitToCelsius() {
        double fahrenheit = Double.parseDouble(inputTemperature.getText().toString());
        double celsius = (fahrenheit - 32) * 5/9;
        resultTextView.setText(String.format("%.2f°F is %.2f°C", fahrenheit, celsius));
    }
}
