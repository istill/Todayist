package kr.lab1.todayist.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import kr.lab1.todayist.MainActivity;

/**
 * Created by istil on 2018-03-07.
 */

public class SplashActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        try {
            Thread.sleep(4000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
