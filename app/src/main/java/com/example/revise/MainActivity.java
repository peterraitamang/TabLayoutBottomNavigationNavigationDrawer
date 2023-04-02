package com.example.revise;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.revise.databinding.ActivityMainBinding;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding bind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(bind.getRoot());

        bind.bottomNavigation.setSelectedItemId(R.id.MenuFragmentIcon);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new MenuFragment()).commit();
        bind.bottomNavigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.MenuFragmentIcon:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new MenuFragment()).commit();
                        return true;
                    case R.id.SpendFragmentIcon:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new SpendFragment()).commit();
                        return true;
                    case R.id.SaveFragmentIcon:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new SaveFragment()).commit();
                        return true;
                    case R.id.ScheduleFragmentIcon:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new ScheduleFragment()).commit();
                        return true;
                    case R.id.AddFragmentIcon:
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new AddFragment()).commit();
                        return true;
                }
                return false;
            }
        });

    }
}