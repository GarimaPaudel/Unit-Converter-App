package com.example.unconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button button;
private TextView textView3;
private EditText editText;
private TextView textView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
button = findViewById(R.id.button2);
textView3 = findViewById(R.id.textView3);
editText = findViewById(R.id.editTextTextPersonName3);
textView5 = findViewById(R.id.textView5);

button.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Toast.makeText(MainActivity.this, "Hi, On click listener worked", Toast.LENGTH_SHORT).show();
String s = editText.getText().toString();
int kg = Integer.parseInt(s);
double pound = kg * 2.20462;
textView5.setText("The corresponding value in pound is " + pound);
       
    }
});
    }
}