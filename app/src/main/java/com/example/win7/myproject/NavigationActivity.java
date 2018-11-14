package com.example.win7.myproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.support.annotation.NonNull;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.FrameLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;


public class NavigationActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

        @Override
        public void onBackPressed () {
            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
            if (drawer.isDrawerOpen(GravityCompat.START)) {
                drawer.closeDrawer(GravityCompat.START);
            } else {
                super.onBackPressed();
            }
        }

        @Override
        public boolean onNavigationItemSelected (MenuItem item){
            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

            switch (item.getItemId()) {
                case R.id.nav_home:

                    //getSupportFragmentManager().beginTransaction().replace(R.id.fragment, new HomeFragment()).commit();
                    break;
                case R.id.nav_preferences:

                    //getSupportFragmentManager().beginTransaction().replace(R.id.frame, new SettingFragment()).commit();
                    break;
                case R.id.nav_shortlists:

                    //getSupportFragmentManager().beginTransaction().replace(R.id.frame, new SettingFragment()).commit();
                    break;
                case R.id.nav_searches:

                    Toast.makeText(NavigationActivity.this, "share", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.nav_residential:
                    Toast.makeText(NavigationActivity.this, "residential", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.nav_landmark:
                    Toast.makeText(NavigationActivity.this, "landmark", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.nav_profile:

                    Toast.makeText(NavigationActivity.this, "Profile", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.nav_customer:
                    Toast.makeText(NavigationActivity.this, "customer service ", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.nav_settings:
                    Toast.makeText(NavigationActivity.this, "Settingsl", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.nav_about:
                    Toast.makeText(NavigationActivity.this, "About", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.nav_feedback:
                    Toast.makeText(NavigationActivity.this, "feedback", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.nav_logout:
                    Intent i = new Intent(NavigationActivity.this, MainActivity.class);
                    startActivity(i);
            }

            drawer.closeDrawer(GravityCompat.START);
            return true;
        }

    }



