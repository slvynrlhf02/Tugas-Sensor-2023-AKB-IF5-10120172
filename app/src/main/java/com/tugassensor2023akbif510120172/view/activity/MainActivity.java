package com.tugassensor2023akbif510120172.view.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.tugassensor2023akbif510120172.R;
import com.tugassensor2023akbif510120172.databinding.ActivityMainBinding;
import com.tugassensor2023akbif510120172.view.fragment.InfoFragment;
import com.tugassensor2023akbif510120172.view.fragment.MapsFragment;
import com.tugassensor2023akbif510120172.view.fragment.ProfileFragment;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new InfoFragment());

         binding.bottomNavigationView.setOnItemSelectedListener(item -> {

            switch (item.getItemId()){
                case R.id.about:
                    replaceFragment(new InfoFragment());
                    break;
                case R.id.resto:
                    replaceFragment(new MapsFragment());
                    break;
                case R.id.profile:
                    replaceFragment(new ProfileFragment());
                    break;
            }

            return true;
        });
    }



    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.main_activity, fragment);
        fragmentTransaction.commit();
    }
}

// NIM   : 10120172
// Nama  : Silvyani Nurlaila Husnina Fajrin
// Kelas : IF5