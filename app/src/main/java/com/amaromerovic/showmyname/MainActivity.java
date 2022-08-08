package com.amaromerovic.showmyname;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {
    private Button myButton;
    private TextView displayNameText;
    private EditText inputName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton = findViewById(R.id.button);
        displayNameText = findViewById(R.id.textView);
        inputName = findViewById(R.id.textPersonName);

        myButton.setOnClickListener(view -> {
            String name = inputName.getText().toString();
            if (name.isEmpty()){
                name = "User";
            }
            displayNameText.setText("Hello, " + name + "!");
        });

    }
}