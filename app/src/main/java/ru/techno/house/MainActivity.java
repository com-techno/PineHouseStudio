package ru.techno.house;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.control).setOnClickListener(this);
        findViewById(R.id.settings).setOnClickListener(this);
        findViewById(R.id.about).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.control:{
                setContentView(R.layout.control);
                break;
            }
            case R.id.settings:{
                setContentView(R.layout.settings);
                break;
            }
            case R.id.about:{
                setContentView(R.layout.about);
                break;
            }
        }
    }
}
