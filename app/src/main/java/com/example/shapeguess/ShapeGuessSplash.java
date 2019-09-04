package com.example.shapeguess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class ShapeGuessSplash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shape_guess_splash);

        MainActivityThread mt = new MainActivityThread();

        mt.start();
    }
    class MainActivityThread extends Thread {
        public void run() {

            try {
                sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Intent mainIntent = new Intent(ShapeGuessSplash.this, MainActivity.class);

            startActivity(mainIntent);

            finish();
        }

    }
}
