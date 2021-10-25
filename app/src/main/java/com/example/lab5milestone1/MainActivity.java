package com.example.lab5milestone1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {
        EditText myUN = (EditText) findViewById(R.id.username);
        String str = myUN.getText().toString();

        goToWelcome(str);
    }

    public void goToWelcome(String s) {
        Intent intent = new Intent(this, NotesPage.class);
        intent.putExtra("Username", s);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}