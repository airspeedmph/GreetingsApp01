package com.example.greetingsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // declaring the widgets
    TextView textView;
    Button btn;
    EditText editText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textview1);
        btn = findViewById(R.id.btn1);
        editText = findViewById(R.id.edittext1);

        // step 3 : Adding the functionality
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = editText.getText().toString();

                // displaying the name
                Toast.makeText(MainActivity.this, "Hello "+ name + " 😊", Toast.LENGTH_LONG).show();
            }
        });

    }
}