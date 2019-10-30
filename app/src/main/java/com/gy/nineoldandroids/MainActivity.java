package com.gy.nineoldandroids;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.gy.nineoldandroids.apidemos.AnimationCloning;
import com.gy.nineoldandroids.apidemos.AnimationLoading;
import com.gy.nineoldandroids.apidemos.AnimationSeeking;
import com.gy.nineoldandroids.apidemos.AnimatorEvents;
import com.gy.nineoldandroids.apidemos.BouncingBalls;
import com.gy.nineoldandroids.apidemos.CustomEvaluator;
import com.gy.nineoldandroids.apidemos.MultiPropertyAnimation;
import com.gy.nineoldandroids.apidemos.ReversingAnimation;
import com.gy.nineoldandroids.droidflakes.Droidflakes;
import com.gy.nineoldandroids.pathanimation.PathAnimationActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = findViewById(R.id.btn_1);
        Button btn2 = findViewById(R.id.btn_2);
        Button btn3 = findViewById(R.id.btn_3);
        Button btn4 = findViewById(R.id.btn_4);
        Button btn5 = findViewById(R.id.btn_5);
        Button btn6 = findViewById(R.id.btn_6);
        Button btn7 = findViewById(R.id.btn_7);
        Button btn8 = findViewById(R.id.btn_8);
        Button btn9 = findViewById(R.id.btn_9);
        Button btn10 = findViewById(R.id.btn_10);
        Button btn_11 = findViewById(R.id.btn_11);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn10.setOnClickListener(this);
        btn_11.setOnClickListener(this);

    }

    private void goIntent(Class clazz){
        Intent intent = new Intent(this,clazz);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_1:
                goIntent(AnimationCloning.class);
                break;
            case R.id.btn_2:
                goIntent(AnimationLoading.class);
                break;
            case R.id.btn_3:
                goIntent(AnimationSeeking.class);
                break;
            case R.id.btn_4:
                goIntent(AnimatorEvents.class);
                break;
            case R.id.btn_5:
                goIntent(BouncingBalls.class);
                break;
            case R.id.btn_6:
                goIntent(CustomEvaluator.class);
                break;
            case R.id.btn_7:
                goIntent(MultiPropertyAnimation.class);
                break;
            case R.id.btn_8:
                goIntent(ReversingAnimation.class);
                break;
            case R.id.btn_9:
                goIntent(Droidflakes.class);
                break;
            case R.id.btn_10:
                goIntent(PathAnimationActivity.class);
                break;
            case R.id.btn_11:
                goIntent(VPADemo.class);
                break;
        }
    }
}
