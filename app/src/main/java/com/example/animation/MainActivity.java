package com.example.animation;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;

public class MainActivity extends Activity {

    ImageView malaysia;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        malaysia = findViewById(R.id.imageLogo);
        startAnimation();
    }
    private void startAnimation(){
        Animation alpha = new AlphaAnimation(1f,0f);
        alpha.setDuration(4000);
        alpha.setRepeatCount(5);

        malaysia.startAnimation(alpha);


    }
}
