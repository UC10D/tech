package com.android.uc10d;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

/**
 * Created by uc10d on 2017/11/23.
 */

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);


        new CountDownTimer(2000, 1000) {

            public void onTick(long millisUntilFinished) {

            }

            public void onFinish() {
                Intent it = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(it);
                finish();
            }
        }.start();


    }
}
