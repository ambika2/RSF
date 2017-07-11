package org.reachingsky.www.reachingskyfoundation.Activities;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.ViewFlipper;

import org.reachingsky.www.reachingskyfoundation.MainActivity;
import org.reachingsky.www.reachingskyfoundation.R;

public class MomentsActivity extends AppCompatActivity {

ImageView imageview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moments);
        imageview=(ImageView)findViewById(R.id.imageView);
    }
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.rb0:
                if (checked)
                    imageview.setImageResource(R.drawable.m0);
                    break;
            case R.id.rb1:
                if (checked)
                    imageview.setImageResource(R.drawable.m1);
                    break;
            case R.id.rb2:
                if (checked)
                    imageview.setImageResource(R.drawable.m2);
                    break;
            case R.id.rb3:
                if (checked)
                    imageview.setImageResource(R.drawable.m3);
                    break;
        }
    }
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent main = new Intent(getApplicationContext(), MainActivity.class);
        Bundle bmain = ActivityOptions.makeCustomAnimation(getApplicationContext(), R.anim.enter_from_left, R.anim.exit_to_right).toBundle();
        startActivity(main, bmain);
    }
}
