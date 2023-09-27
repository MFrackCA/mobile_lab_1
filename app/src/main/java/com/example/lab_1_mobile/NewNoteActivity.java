package com.example.lab_1_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class NewNoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_note);

        ImageButton btn1 = findViewById(R.id.back_arrow);
        Button btn2 = findViewById(R.id.button_save);

        // Back Arrow
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToMain();
            }
        });

        // Save Note
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToMain();
            }
        });
    }
    public void goToMain(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}