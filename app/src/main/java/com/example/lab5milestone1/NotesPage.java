package com.example.lab5milestone1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NotesPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_page);

        TextView welcomeText = (TextView) findViewById(R.id.welcome);
        Intent intent = getIntent();
        String s = intent.getStringExtra("Username");
        welcomeText.setText("Welcome " + s + "!");
    }
}