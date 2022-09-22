package com.example.gbs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;


import com.example.gbs.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    TextView registerBtn;

//    Spinner spinner;
//    String[] positon = {"Choose your position","Staff","CR","Admin"};

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new HomeFragment());



//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item,positon);
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
////        spinner.setAdapter(adapter);
////
////        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
//                String value = adapterView.getItemAtPosition(i).toString();
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> adapterView) {
//
//            }
//        });
//        registerBtn = findViewById(R.id.registerBtn);
//        registerBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(this, RegisterNow.class);
//                startActivity(intent);
//            }
//        });



        binding.bottomNavigationView.setOnItemSelectedListener(item -> {

                switch (item.getItemId()){

                    case R.id.home:
                        replaceFragment(new HomeFragment());
                        break;
                    case R.id.blog:
                        replaceFragment(new BlogFragment());
                        break;
                    case R.id.ground:
                        replaceFragment(new GroundFragment());
                        break;
                    case R.id.booked:
                        replaceFragment(new BookedFragment());
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
        fragmentTransaction.replace(R.id.frame_layout,fragment);
        fragmentTransaction.commit();

    }

}