package com.jackchen.view_day28;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final SplashView splashView = (SplashView) findViewById(R.id.thirdScreenView);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                splashView.disappear();
            }
        } , 2000) ;

    }
}
