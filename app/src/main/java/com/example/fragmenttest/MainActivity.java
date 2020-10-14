package com.example.fragmenttest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fragmenttest.fragment.BlankFragment;
import com.example.fragmenttest.fragment.FragmentOne;
import com.example.fragmenttest.fragment.FragmentThree;

public class MainActivity extends AppCompatActivity {

    Button fragOne, fragTwo, fragThree;

    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragOne = findViewById(R.id.frag_one);
        fragTwo = findViewById(R.id.frag_two);
        fragThree = findViewById(R.id.frag_three);

        fragmentManager = getSupportFragmentManager();
        fragOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentTransaction = fragmentManager.beginTransaction();
                FragmentOne fragmentOne = new FragmentOne();
                fragmentTransaction.add(R.id.fragment, fragmentOne, "fragmentOne").commit();
            }
        });
        fragTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentTransaction = fragmentManager.beginTransaction();
                BlankFragment fragmentTwo = new BlankFragment();
                fragmentTransaction.replace(R.id.fragment, fragmentTwo, "fragmentTwo").commit();
            }
        });
        fragThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentTransaction = fragmentManager.beginTransaction();
                FragmentThree fragmentThree = new FragmentThree();
                fragmentTransaction.replace(R.id.fragment, fragmentThree, "fragmentThree").commit();
            }
        });
    }
}