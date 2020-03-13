package ru.techno.house;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class SplashActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello);/*
        Toast.makeText(this, "lol", Toast.LENGTH_SHORT).show();
        for (int i = 0; i< 10000; i++) Log.i("lol", i + "");
        Toast.makeText(this, "lol10000", Toast.LENGTH_SHORT).show();*/
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //TODO put here code to exec before launching MainActivity


                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                SplashActivity.this.startActivity(intent);
                SplashActivity.this.finish();
            }
        }, 1000);
        /*new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                SplashActivity.this.startActivity(intent);
                SplashActivity.this.finish();
            }
        }, 1000);*/
    }
}
