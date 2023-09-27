package com.example.lab_1_mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton btn1 = (FloatingActionButton) findViewById(R.id.new_note);
        btn1.setTooltipText("Send an email");
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToNewNote();
            }
        });
    }

    // Go to New Note
    public void goToNewNote(){
        Intent intent = new Intent(this, NewNoteActivity.class);
        startActivity(intent);
    }
}