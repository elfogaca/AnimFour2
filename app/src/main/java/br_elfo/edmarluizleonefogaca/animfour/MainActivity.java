package br_elfo.edmarluizleonefogaca.animfour;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements AnimationListener {
    Animation slideLeft, slideRight, slideTop;
    Button btnlogin, btnsignup, btnskip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);


        setContentView(R.layout.activity_main);
        btnlogin = (Button) findViewById(R.id.btnlogin);
        btnsignup = (Button) findViewById(R.id.btnsignup);
        btnskip = (Button) findViewById(R.id.btnskip);
        slideLeft = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.slide_in_left);
        slideLeft.setAnimationListener(this);
        slideRight = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.slide_in_right);
        slideRight.setAnimationListener(this);
        slideTop = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.slide_up_in);
        slideTop.setAnimationListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        btnlogin.setVisibility(View.VISIBLE);
        btnlogin.startAnimation(slideLeft);
        btnsignup.setVisibility(View.VISIBLE);
        btnsignup.startAnimation(slideRight);
        btnskip.setVisibility(View.VISIBLE);
        btnskip.startAnimation(slideTop);
    }

    @Override
    public void onAnimationStart(Animation animation) {
    }

    @Override
    public void onAnimationEnd(Animation animation) {
    }

    @Override
    public void onAnimationRepeat(Animation animation) {
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}