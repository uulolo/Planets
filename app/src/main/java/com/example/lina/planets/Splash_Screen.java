package com.example.lina.planets;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        splash() ;

    }

    public void splash() {
        Handler friend = new Handler();
        friend.postDelayed(new Runnable() {

            @Override
            public void run() {
                startActivity(new Intent(Splash_Screen.this,MainActivity.class));
            }
        },3000);

    }


}
