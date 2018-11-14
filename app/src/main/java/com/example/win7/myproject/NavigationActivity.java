
package com.example.win7.myproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

public class NavigationActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);

        drawer.addDrawerListener(toggle);
        toggle.syncState();


        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HomeFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_home);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_home:
                setTitle("Home");
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new HomeFragment()).commit();
                break;

            case R.id.nav_shortlists:
                setTitle("My Shortlists");
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new ShortlistsFragment()).commit();
                break;

            case R.id.nav_searches:
                setTitle("Recent searches");
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new SearchesFragment()).commit();
                break;

            case R.id.nav_preferences:
                setTitle("My preferences");
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new PrefernceFragment()).commit();
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
                Toast.makeText(this, "You have Successfully Logged Out", Toast.LENGTH_LONG).show();
                break;
        }

        drawer.closeDrawer(GravityCompat.START);

        return true;
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}