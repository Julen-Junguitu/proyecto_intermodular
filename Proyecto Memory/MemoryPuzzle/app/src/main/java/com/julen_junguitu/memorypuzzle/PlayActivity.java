package com.julen_junguitu.memorypuzzle;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class PlayActivity extends AppCompatActivity {

    TextView textUser;
    TextView textUser2;
    TextView textUser3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        Bundle bundle = getIntent().getExtras();
        String user = bundle.getString("usuario");
        String myTxt = bundle.getString("dificultad");


        textUser = (TextView)findViewById(R.id.txtNombre);
        textUser2 = (TextView)findViewById(R.id.txtNombre1);
        textUser3 = (TextView)findViewById(R.id.txtNombre2);

        textUser.setText(user);
        textUser2.setText(user);
        textUser3.setText(user);


        if(myTxt.equals("e")){
            FragmentManager manager = getSupportFragmentManager();
            FragmentTransaction ft = manager.beginTransaction();
            Fragment normal = manager.findFragmentById(R.id.normalFragment);
            Fragment hard = manager.findFragmentById(R.id.hardFragment);
            ft.hide(normal);
            ft.hide(hard);
            ft.commit();

        }

        if(myTxt.equals("n")){
            FragmentManager manager = getSupportFragmentManager();
            FragmentTransaction ft = manager.beginTransaction();
            Fragment easy = manager.findFragmentById(R.id.easyFragment);
            Fragment hard = manager.findFragmentById(R.id.hardFragment);
            ft.hide(easy);
            ft.hide(hard);
            ft.commit();


        }

        if(myTxt.equals("h")){
            FragmentManager manager = getSupportFragmentManager();
            FragmentTransaction ft = manager.beginTransaction();
            Fragment easy = manager.findFragmentById(R.id.easyFragment);
            Fragment normal = manager.findFragmentById(R.id.normalFragment);
            ft.hide(easy);
            ft.hide(normal);
            ft.commit();



        }


    }
}
