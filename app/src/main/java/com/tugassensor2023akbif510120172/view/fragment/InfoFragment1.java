package com.tugassensor2023akbif510120172.view.fragment;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.os.Bundle;
//
//import com.tugassensor2023akbif510120172.R;
//
//public class InfoFragment1 extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_infofragment1);
//    }
//}

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.tugassensor2023akbif510120172.R;

public class InfoFragment1 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.activity_infofragment1, container, false);
        return rootView;
    }
}

// NIM   : 10120172
// Nama  : Silvyani Nurlaila Husnina Fajrin
// Kelas : IF5
