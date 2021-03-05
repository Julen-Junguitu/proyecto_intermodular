package com.julen_junguitu.memorypuzzle;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import io.realm.Realm;


public class MenuFragment extends Fragment {
    Button btnCreditos;
    Button btnPuntuaciones;
    Button btnJugar;


    public MenuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_menu, container, false);




        btnCreditos= view.findViewById(R.id.btnCreditos);
        btnPuntuaciones = view.findViewById(R.id.btnPuntuaciones);
        btnJugar= view.findViewById(R.id.btnJugar);


        btnCreditos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getContext(), CreditActivity.class);
                startActivity(intent);
            }});

        btnJugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getContext(), LevelActivity.class);
                startActivity(intent);
            }});

        btnPuntuaciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getContext(), ScoresActivity.class);
                startActivity(intent);
            }});


        return view;



}
}