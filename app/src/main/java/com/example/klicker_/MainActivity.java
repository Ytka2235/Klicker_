package com.example.klicker_;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Integer counter = 0;
    private static final String KEY_COUNT = "COUNT";
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null)
        {
            counter = savedInstanceState.getInt(KEY_COUNT, 0);
            TextView counterView =  findViewById(R.id.txt_counter);
            counterView.setText(counter.toString());
        }
    }
    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_COUNT, counter);
    }
    @SuppressLint("SetTextI18n")
    public void onClickBtnAddStudents(View view) {
        counter++;
        TextView counterView = findViewById(R.id.txt_counter);
        counterView.setText(counter.toString());
    }
}