package com.example.freewaresys.rsf;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnMenuTabClickListener;

public class MainActivity extends ActionBarActivity {
TextView text1,text2;
    BottomBar Bottombar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bottombar = BottomBar.attach(this,savedInstanceState);
        Bottombar.setItemsFromMenu(R.menu.menu_main, new OnMenuTabClickListener() {
            @Override
            public void onMenuTabSelected(@IdRes int i) {
                if (i == R.id.BottomBarItemOne) {
                    AboutFragment f = new AboutFragment();
                    getFragmentManager().beginTransaction().replace(R.id.frame,f).commit();
                }
                else if (i == R.id.BottomBarItemTwo) {
                    ProjectFragment f = new ProjectFragment();
                    getFragmentManager().beginTransaction().replace(R.id.frame, f).commit();
                }
                else if (i == R.id.BottomBarItemThree) {
                   MoreFragment f = new MoreFragment();
                    getFragmentManager().beginTransaction().replace(R.id.frame, f).commit();
                }
                else if (i == R.id.BottomBarItemFour) {
                    PledgeFragment f = new PledgeFragment();
                    getFragmentManager().beginTransaction().replace(R.id.frame, f).commit();
                }
            }

            @Override
            public void onMenuTabReSelected(@IdRes int menuItemId) {

            }
        });
        Bottombar.mapColorForTab(0,"#800080");
        Bottombar.mapColorForTab(1,"#FF00FF");
        Bottombar.mapColorForTab(2,"#000080");
        Bottombar.mapColorForTab(3,"#0000FF");
        Bottombar.mapColorForTab(4,"#0805FF");
        Bottombar.mapColorForTab(5,"#0488FF");


    }
}
