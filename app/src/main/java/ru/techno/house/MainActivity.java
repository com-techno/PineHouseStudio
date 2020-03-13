package ru.techno.house;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private boolean isMainOpened = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.control).setOnClickListener(this);
        findViewById(R.id.settings).setOnClickListener(this);
        findViewById(R.id.about).setOnClickListener(this);
//        findViewById(R.id.back).setOnClickListener(this);
    }

    @Override
    public void onBackPressed() {
        if (isMainOpened){
            openQuitDialog();
        } else {
            isMainOpened = true;
            setContentView(R.layout.activity_main);
            findViewById(R.id.control).setOnClickListener(this);
            findViewById(R.id.settings).setOnClickListener(this);
            findViewById(R.id.about).setOnClickListener(this);
        }
    }

    @SuppressLint("InflateParams")
    private void openQuitDialog() {
        final AlertDialog.Builder quitDialog = new AlertDialog.Builder(MainActivity.this);
        quitDialog.setView(R.layout.quit_dialog);
        quitDialog.show();
        final AlertDialog alert = quitDialog.create();
        /*alert.show();
        alert.setButton(R.id.no_quit, "Lol", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });*/
        if (findViewById(R.id.no_quit) != null && findViewById(R.id.quit) != null) {
            findViewById(R.id.no_quit).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    alert.dismiss();
                }
            });
            findViewById(R.id.quit).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.control: {
                isMainOpened = false;
                setContentView(R.layout.control);
                break;
            }
            case R.id.settings: {
                isMainOpened = false;
                setContentView(R.layout.settings);
                break;
            }
            case R.id.about: {
                isMainOpened = false;
                setContentView(R.layout.about);
                break;
            }
        }
    }
}
