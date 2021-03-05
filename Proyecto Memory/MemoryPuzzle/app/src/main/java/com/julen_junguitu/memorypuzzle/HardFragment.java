package com.julen_junguitu.memorypuzzle;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Arrays;
import java.util.Collections;

import io.realm.Realm;

public class HardFragment extends Fragment {

    public HardFragment() {
        // Required empty public constructor
    }

    Chronometer chrono;
    boolean ordenCarta = true;

    ImageView iv_1;
    ImageView iv_2;
    ImageView iv_3;
    ImageView iv_4;
    ImageView iv_5;
    ImageView iv_6;
    ImageView iv_7;
    ImageView iv_8;
    ImageView iv_9;
    ImageView iv_10;
    ImageView iv_11;
    ImageView iv_12;
    ImageView iv_13;
    ImageView iv_14;
    ImageView iv_15;
    ImageView iv_16;

    TextView nombre;
    String name;

    //Realm realm;

    int turno1;
    int turno2;

    int tag1;
    int tag2;

    int cnt = 0;

    Integer cartas[] = {1, 2, 3, 4, 5, 6, 7, 8, 11, 12, 13, 14, 15, 16, 17, 18};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hard, container, false);

        chrono = view.findViewById(R.id.chrono);

        iv_1 = view.findViewById(R.id.iv_1);
        iv_2 = view.findViewById(R.id.iv_2);
        iv_3 = view.findViewById(R.id.iv_3);
        iv_4 = view.findViewById(R.id.iv_4);
        iv_5 = view.findViewById(R.id.iv_5);
        iv_6 = view.findViewById(R.id.iv_6);
        iv_7 = view.findViewById(R.id.iv_7);
        iv_8 = view.findViewById(R.id.iv_8);
        iv_9 = view.findViewById(R.id.iv_9);
        iv_10 = view.findViewById(R.id.iv_10);
        iv_11 = view.findViewById(R.id.iv_11);
        iv_12 = view.findViewById(R.id.iv_12);
        iv_13 = view.findViewById(R.id.iv_13);
        iv_14 = view.findViewById(R.id.iv_14);
        iv_15 = view.findViewById(R.id.iv_15);
        iv_16 = view.findViewById(R.id.iv_16);
        nombre = view.findViewById(R.id.txtNombre2);

        Collections.shuffle(Arrays.asList(cartas));

        //Asignando fotos a las cartas

        iv_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int carta = Integer.parseInt((String) iv_1.getTag());

                if(cartas[carta] == 1){
                    iv_1.setImageResource(R.drawable.imagen1);
                }
                else if(cartas[carta] == 2){
                    iv_1.setImageResource(R.drawable.imagen2);
                }
                else if(cartas[carta] == 3){
                    iv_1.setImageResource(R.drawable.imagen3);
                }
                else if(cartas[carta] == 4){
                    iv_1.setImageResource(R.drawable.imagen4);
                }
                else if(cartas[carta] == 5){
                    iv_1.setImageResource(R.drawable.imagen5);
                }
                else if(cartas[carta] == 6){
                    iv_1.setImageResource(R.drawable.imagen6);
                }
                else if(cartas[carta] == 7){
                    iv_1.setImageResource(R.drawable.imagen7);
                }
                else if(cartas[carta] == 8){
                    iv_1.setImageResource(R.drawable.imagen8);
                }
                else if(cartas[carta] == 11){
                    iv_1.setImageResource(R.drawable.imagen1);
                }
                else if(cartas[carta] == 12){
                    iv_1.setImageResource(R.drawable.imagen2);
                }
                else if(cartas[carta] == 13){
                    iv_1.setImageResource(R.drawable.imagen3);
                }
                else if(cartas[carta] == 14){
                    iv_1.setImageResource(R.drawable.imagen4);
                }
                else if(cartas[carta] == 15){
                    iv_1.setImageResource(R.drawable.imagen5);
                }
                else if(cartas[carta] == 16){
                    iv_1.setImageResource(R.drawable.imagen6);
                }
                else if(cartas[carta] == 17){
                    iv_1.setImageResource(R.drawable.imagen7);
                }
                else if(cartas[carta] == 18){
                    iv_1.setImageResource(R.drawable.imagen8);
                }

                funcion(iv_1, carta);
            }
        });

        iv_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int carta = Integer.parseInt((String) iv_2.getTag());

                if(cartas[carta] == 1){
                    iv_2.setImageResource(R.drawable.imagen1);
                }
                else if(cartas[carta] == 2){
                    iv_2.setImageResource(R.drawable.imagen2);
                }
                else if(cartas[carta] == 3){
                    iv_2.setImageResource(R.drawable.imagen3);
                }
                else if(cartas[carta] == 4){
                    iv_2.setImageResource(R.drawable.imagen4);
                }
                else if(cartas[carta] == 5){
                    iv_2.setImageResource(R.drawable.imagen5);
                }
                else if(cartas[carta] == 6){
                    iv_2.setImageResource(R.drawable.imagen6);
                }
                else if(cartas[carta] == 7){
                    iv_2.setImageResource(R.drawable.imagen7);
                }
                else if(cartas[carta] == 8){
                    iv_2.setImageResource(R.drawable.imagen8);
                }
                else if(cartas[carta] == 11){
                    iv_2.setImageResource(R.drawable.imagen1);
                }
                else if(cartas[carta] == 12){
                    iv_2.setImageResource(R.drawable.imagen2);
                }else if(cartas[carta] == 13){
                    iv_2.setImageResource(R.drawable.imagen3);
                }
                else if(cartas[carta] == 14){
                    iv_2.setImageResource(R.drawable.imagen4);
                }
                else if(cartas[carta] == 15){
                    iv_2.setImageResource(R.drawable.imagen5);
                }
                else if(cartas[carta] == 16){
                    iv_2.setImageResource(R.drawable.imagen6);
                }
                else if(cartas[carta] == 17){
                    iv_2.setImageResource(R.drawable.imagen7);
                }
                else if(cartas[carta] == 18){
                    iv_2.setImageResource(R.drawable.imagen8);
                }

                funcion(iv_2, carta);
            }
        });

        iv_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int carta = Integer.parseInt((String) iv_3.getTag());

                if(cartas[carta] == 1){
                    iv_3.setImageResource(R.drawable.imagen1);
                }
                else if(cartas[carta] == 2){
                    iv_3.setImageResource(R.drawable.imagen2);
                }
                else if(cartas[carta] == 3){
                    iv_3.setImageResource(R.drawable.imagen3);
                }
                else if(cartas[carta] == 4){
                    iv_3.setImageResource(R.drawable.imagen4);
                }
                else if(cartas[carta] == 5){
                    iv_3.setImageResource(R.drawable.imagen5);
                }
                else if(cartas[carta] == 6){
                    iv_3.setImageResource(R.drawable.imagen6);
                }
                else if(cartas[carta] == 7){
                    iv_3.setImageResource(R.drawable.imagen7);
                }
                else if(cartas[carta] == 8){
                    iv_3.setImageResource(R.drawable.imagen8);
                }
                else if(cartas[carta] == 11){
                    iv_3.setImageResource(R.drawable.imagen1);
                }
                else if(cartas[carta] == 12){
                    iv_3.setImageResource(R.drawable.imagen2);
                }else if(cartas[carta] == 13){
                    iv_3.setImageResource(R.drawable.imagen3);
                }
                else if(cartas[carta] == 14){
                    iv_3.setImageResource(R.drawable.imagen4);
                }
                else if(cartas[carta] == 15){
                    iv_3.setImageResource(R.drawable.imagen5);
                }
                else if(cartas[carta] == 16){
                    iv_3.setImageResource(R.drawable.imagen6);
                }
                else if(cartas[carta] == 17){
                    iv_3.setImageResource(R.drawable.imagen7);
                }
                else if(cartas[carta] == 18){
                    iv_3.setImageResource(R.drawable.imagen8);
                }

                funcion(iv_3, carta);
            }
        });

        iv_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int carta = Integer.parseInt((String) iv_4.getTag());

                if(cartas[carta] == 1){
                    iv_4.setImageResource(R.drawable.imagen1);
                }
                else if(cartas[carta] == 2){
                    iv_4.setImageResource(R.drawable.imagen2);
                }
                else if(cartas[carta] == 3){
                    iv_4.setImageResource(R.drawable.imagen3);
                }
                else if(cartas[carta] == 4){
                    iv_4.setImageResource(R.drawable.imagen4);
                }
                else if(cartas[carta] == 5){
                    iv_4.setImageResource(R.drawable.imagen5);
                }
                else if(cartas[carta] == 6){
                    iv_4.setImageResource(R.drawable.imagen6);
                }
                else if(cartas[carta] == 7){
                    iv_4.setImageResource(R.drawable.imagen7);
                }
                else if(cartas[carta] == 8){
                    iv_4.setImageResource(R.drawable.imagen8);
                }
                else if(cartas[carta] == 11){
                    iv_4.setImageResource(R.drawable.imagen1);
                }
                else if(cartas[carta] == 12){
                    iv_4.setImageResource(R.drawable.imagen2);
                }else if(cartas[carta] == 13){
                    iv_4.setImageResource(R.drawable.imagen3);
                }
                else if(cartas[carta] == 14){
                    iv_4.setImageResource(R.drawable.imagen4);
                }
                else if(cartas[carta] == 15){
                    iv_4.setImageResource(R.drawable.imagen5);
                }
                else if(cartas[carta] == 16){
                    iv_4.setImageResource(R.drawable.imagen6);
                }
                else if(cartas[carta] == 17){
                    iv_4.setImageResource(R.drawable.imagen7);
                }
                else if(cartas[carta] == 18){
                    iv_4.setImageResource(R.drawable.imagen8);
                }

                funcion(iv_4, carta);
            }
        });

        iv_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int carta = Integer.parseInt((String) iv_5.getTag());

                if(cartas[carta] == 1){
                    iv_5.setImageResource(R.drawable.imagen1);
                }
                else if(cartas[carta] == 2){
                    iv_5.setImageResource(R.drawable.imagen2);
                }
                else if(cartas[carta] == 3){
                    iv_5.setImageResource(R.drawable.imagen3);
                }
                else if(cartas[carta] == 4){
                    iv_5.setImageResource(R.drawable.imagen4);
                }
                else if(cartas[carta] == 5){
                    iv_5.setImageResource(R.drawable.imagen5);
                }
                else if(cartas[carta] == 6){
                    iv_5.setImageResource(R.drawable.imagen6);
                }
                else if(cartas[carta] == 7){
                    iv_5.setImageResource(R.drawable.imagen7);
                }
                else if(cartas[carta] == 8){
                    iv_5.setImageResource(R.drawable.imagen8);
                }
                else if(cartas[carta] == 11){
                    iv_5.setImageResource(R.drawable.imagen1);
                }
                else if(cartas[carta] == 12){
                    iv_5.setImageResource(R.drawable.imagen2);
                }else if(cartas[carta] == 13){
                    iv_5.setImageResource(R.drawable.imagen3);
                }
                else if(cartas[carta] == 14){
                    iv_5.setImageResource(R.drawable.imagen4);
                }
                else if(cartas[carta] == 15){
                    iv_5.setImageResource(R.drawable.imagen5);
                }
                else if(cartas[carta] == 16){
                    iv_5.setImageResource(R.drawable.imagen6);
                }
                else if(cartas[carta] == 17){
                    iv_5.setImageResource(R.drawable.imagen7);
                }
                else if(cartas[carta] == 18){
                    iv_5.setImageResource(R.drawable.imagen8);
                }

                funcion(iv_5, carta);
            }
        });

        iv_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int carta = Integer.parseInt((String) iv_6.getTag());

                if(cartas[carta] == 1){
                    iv_6.setImageResource(R.drawable.imagen1);
                }
                else if(cartas[carta] == 2){
                    iv_6.setImageResource(R.drawable.imagen2);
                }
                else if(cartas[carta] == 3){
                    iv_6.setImageResource(R.drawable.imagen3);
                }
                else if(cartas[carta] == 4){
                    iv_6.setImageResource(R.drawable.imagen4);
                }
                else if(cartas[carta] == 5){
                    iv_6.setImageResource(R.drawable.imagen5);
                }
                else if(cartas[carta] == 6){
                    iv_6.setImageResource(R.drawable.imagen6);
                }
                else if(cartas[carta] == 7){
                    iv_6.setImageResource(R.drawable.imagen7);
                }
                else if(cartas[carta] == 8){
                    iv_6.setImageResource(R.drawable.imagen8);
                }
                else if(cartas[carta] == 11){
                    iv_6.setImageResource(R.drawable.imagen1);
                }
                else if(cartas[carta] == 12){
                    iv_6.setImageResource(R.drawable.imagen2);
                }else if(cartas[carta] == 13){
                    iv_6.setImageResource(R.drawable.imagen3);
                }
                else if(cartas[carta] == 14){
                    iv_6.setImageResource(R.drawable.imagen4);
                }
                else if(cartas[carta] == 15){
                    iv_6.setImageResource(R.drawable.imagen5);
                }
                else if(cartas[carta] == 16){
                    iv_6.setImageResource(R.drawable.imagen6);
                }
                else if(cartas[carta] == 17){
                    iv_6.setImageResource(R.drawable.imagen7);
                }
                else if(cartas[carta] == 18){
                    iv_6.setImageResource(R.drawable.imagen8);
                }

                funcion(iv_6, carta);
            }
        });

        iv_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int carta = Integer.parseInt((String) iv_7.getTag());

                if(cartas[carta] == 1){
                    iv_7.setImageResource(R.drawable.imagen1);
                }
                else if(cartas[carta] == 2){
                    iv_7.setImageResource(R.drawable.imagen2);
                }
                else if(cartas[carta] == 3){
                    iv_7.setImageResource(R.drawable.imagen3);
                }
                else if(cartas[carta] == 4){
                    iv_7.setImageResource(R.drawable.imagen4);
                }
                else if(cartas[carta] == 5){
                    iv_7.setImageResource(R.drawable.imagen5);
                }
                else if(cartas[carta] == 6){
                    iv_7.setImageResource(R.drawable.imagen6);
                }
                else if(cartas[carta] == 7){
                    iv_7.setImageResource(R.drawable.imagen7);
                }
                else if(cartas[carta] == 8){
                    iv_7.setImageResource(R.drawable.imagen8);
                }
                else if(cartas[carta] == 11){
                    iv_7.setImageResource(R.drawable.imagen1);
                }
                else if(cartas[carta] == 12){
                    iv_7.setImageResource(R.drawable.imagen2);
                }else if(cartas[carta] == 13){
                    iv_7.setImageResource(R.drawable.imagen3);
                }
                else if(cartas[carta] == 14){
                    iv_7.setImageResource(R.drawable.imagen4);
                }
                else if(cartas[carta] == 15){
                    iv_7.setImageResource(R.drawable.imagen5);
                }
                else if(cartas[carta] == 16){
                    iv_7.setImageResource(R.drawable.imagen6);
                }
                else if(cartas[carta] == 17){
                    iv_7.setImageResource(R.drawable.imagen7);
                }
                else if(cartas[carta] == 18){
                    iv_7.setImageResource(R.drawable.imagen8);
                }

                funcion(iv_7, carta);
            }
        });

        iv_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int carta = Integer.parseInt((String) iv_8.getTag());

                if(cartas[carta] == 1){
                    iv_8.setImageResource(R.drawable.imagen1);
                }
                else if(cartas[carta] == 2){
                    iv_8.setImageResource(R.drawable.imagen2);
                }
                else if(cartas[carta] == 3){
                    iv_8.setImageResource(R.drawable.imagen3);
                }
                else if(cartas[carta] == 4){
                    iv_8.setImageResource(R.drawable.imagen4);
                }
                else if(cartas[carta] == 5){
                    iv_8.setImageResource(R.drawable.imagen5);
                }
                else if(cartas[carta] == 6){
                    iv_8.setImageResource(R.drawable.imagen6);
                }
                else if(cartas[carta] == 7){
                    iv_8.setImageResource(R.drawable.imagen7);
                }
                else if(cartas[carta] == 8){
                    iv_8.setImageResource(R.drawable.imagen8);
                }
                else if(cartas[carta] == 11){
                    iv_8.setImageResource(R.drawable.imagen1);
                }
                else if(cartas[carta] == 12){
                    iv_8.setImageResource(R.drawable.imagen2);
                }else if(cartas[carta] == 13){
                    iv_8.setImageResource(R.drawable.imagen3);
                }
                else if(cartas[carta] == 14){
                    iv_8.setImageResource(R.drawable.imagen4);
                }
                else if(cartas[carta] == 15){
                    iv_8.setImageResource(R.drawable.imagen5);
                }
                else if(cartas[carta] == 16){
                    iv_8.setImageResource(R.drawable.imagen6);
                }
                else if(cartas[carta] == 17){
                    iv_8.setImageResource(R.drawable.imagen7);
                }
                else if(cartas[carta] == 18){
                    iv_8.setImageResource(R.drawable.imagen8);
                }

                funcion(iv_8, carta);
            }
        });

        iv_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int carta = Integer.parseInt((String) iv_9.getTag());

                if(cartas[carta] == 1){
                    iv_9.setImageResource(R.drawable.imagen1);
                }
                else if(cartas[carta] == 2){
                    iv_9.setImageResource(R.drawable.imagen2);
                }
                else if(cartas[carta] == 3){
                    iv_9.setImageResource(R.drawable.imagen3);
                }
                else if(cartas[carta] == 4){
                    iv_9.setImageResource(R.drawable.imagen4);
                }
                else if(cartas[carta] == 5){
                    iv_9.setImageResource(R.drawable.imagen5);
                }
                else if(cartas[carta] == 6){
                    iv_9.setImageResource(R.drawable.imagen6);
                }
                else if(cartas[carta] == 7){
                    iv_9.setImageResource(R.drawable.imagen7);
                }
                else if(cartas[carta] == 8){
                    iv_9.setImageResource(R.drawable.imagen8);
                }
                else if(cartas[carta] == 11){
                    iv_9.setImageResource(R.drawable.imagen1);
                }
                else if(cartas[carta] == 12){
                    iv_9.setImageResource(R.drawable.imagen2);
                }else if(cartas[carta] == 13){
                    iv_9.setImageResource(R.drawable.imagen3);
                }
                else if(cartas[carta] == 14){
                    iv_9.setImageResource(R.drawable.imagen4);
                }
                else if(cartas[carta] == 15){
                    iv_9.setImageResource(R.drawable.imagen5);
                }
                else if(cartas[carta] == 16){
                    iv_9.setImageResource(R.drawable.imagen6);
                }
                else if(cartas[carta] == 17){
                    iv_9.setImageResource(R.drawable.imagen7);
                }
                else if(cartas[carta] == 18){
                    iv_9.setImageResource(R.drawable.imagen8);
                }

                funcion(iv_9, carta);
            }
        });

        iv_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int carta = Integer.parseInt((String) iv_10.getTag());

                if(cartas[carta] == 1){
                    iv_10.setImageResource(R.drawable.imagen1);
                }
                else if(cartas[carta] == 2){
                    iv_10.setImageResource(R.drawable.imagen2);
                }
                else if(cartas[carta] == 3){
                    iv_10.setImageResource(R.drawable.imagen3);
                }
                else if(cartas[carta] == 4){
                    iv_10.setImageResource(R.drawable.imagen4);
                }
                else if(cartas[carta] == 5){
                    iv_10.setImageResource(R.drawable.imagen5);
                }
                else if(cartas[carta] == 6){
                    iv_10.setImageResource(R.drawable.imagen6);
                }
                else if(cartas[carta] == 7){
                    iv_10.setImageResource(R.drawable.imagen7);
                }
                else if(cartas[carta] == 8){
                    iv_10.setImageResource(R.drawable.imagen8);
                }
                else if(cartas[carta] == 11){
                    iv_10.setImageResource(R.drawable.imagen1);
                }
                else if(cartas[carta] == 12){
                    iv_10.setImageResource(R.drawable.imagen2);
                }else if(cartas[carta] == 13){
                    iv_10.setImageResource(R.drawable.imagen3);
                }
                else if(cartas[carta] == 14){
                    iv_10.setImageResource(R.drawable.imagen4);
                }
                else if(cartas[carta] == 15){
                    iv_10.setImageResource(R.drawable.imagen5);
                }
                else if(cartas[carta] == 16){
                    iv_10.setImageResource(R.drawable.imagen6);
                }
                else if(cartas[carta] == 17){
                    iv_10.setImageResource(R.drawable.imagen7);
                }
                else if(cartas[carta] == 18){
                    iv_10.setImageResource(R.drawable.imagen8);
                }

                funcion(iv_10, carta);
            }
        });

        iv_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int carta = Integer.parseInt((String) iv_11.getTag());

                if(cartas[carta] == 1){
                    iv_11.setImageResource(R.drawable.imagen1);
                }
                else if(cartas[carta] == 2){
                    iv_11.setImageResource(R.drawable.imagen2);
                }
                else if(cartas[carta] == 3){
                    iv_11.setImageResource(R.drawable.imagen3);
                }
                else if(cartas[carta] == 4){
                    iv_11.setImageResource(R.drawable.imagen4);
                }
                else if(cartas[carta] == 5){
                    iv_11.setImageResource(R.drawable.imagen5);
                }
                else if(cartas[carta] == 6){
                    iv_11.setImageResource(R.drawable.imagen6);
                }
                else if(cartas[carta] == 7){
                    iv_11.setImageResource(R.drawable.imagen7);
                }
                else if(cartas[carta] == 8){
                    iv_11.setImageResource(R.drawable.imagen8);
                }
                else if(cartas[carta] == 11){
                    iv_11.setImageResource(R.drawable.imagen1);
                }
                else if(cartas[carta] == 12){
                    iv_11.setImageResource(R.drawable.imagen2);
                }else if(cartas[carta] == 13){
                    iv_11.setImageResource(R.drawable.imagen3);
                }
                else if(cartas[carta] == 14){
                    iv_11.setImageResource(R.drawable.imagen4);
                }
                else if(cartas[carta] == 15){
                    iv_11.setImageResource(R.drawable.imagen5);
                }
                else if(cartas[carta] == 16){
                    iv_11.setImageResource(R.drawable.imagen6);
                }
                else if(cartas[carta] == 17){
                    iv_11.setImageResource(R.drawable.imagen7);
                }
                else if(cartas[carta] == 18){
                    iv_11.setImageResource(R.drawable.imagen8);
                }

                funcion(iv_11, carta);
            }
        });

        iv_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int carta = Integer.parseInt((String) iv_12.getTag());

                if(cartas[carta] == 1){
                    iv_12.setImageResource(R.drawable.imagen1);
                }
                else if(cartas[carta] == 2){
                    iv_12.setImageResource(R.drawable.imagen2);
                }
                else if(cartas[carta] == 3){
                    iv_12.setImageResource(R.drawable.imagen3);
                }
                else if(cartas[carta] == 4){
                    iv_12.setImageResource(R.drawable.imagen4);
                }
                else if(cartas[carta] == 5){
                    iv_12.setImageResource(R.drawable.imagen5);
                }
                else if(cartas[carta] == 6){
                    iv_12.setImageResource(R.drawable.imagen6);
                }
                else if(cartas[carta] == 7){
                    iv_12.setImageResource(R.drawable.imagen7);
                }
                else if(cartas[carta] == 8){
                    iv_12.setImageResource(R.drawable.imagen8);
                }
                else if(cartas[carta] == 11){
                    iv_12.setImageResource(R.drawable.imagen1);
                }
                else if(cartas[carta] == 12){
                    iv_12.setImageResource(R.drawable.imagen2);
                }else if(cartas[carta] == 13){
                    iv_12.setImageResource(R.drawable.imagen3);
                }
                else if(cartas[carta] == 14){
                    iv_12.setImageResource(R.drawable.imagen4);
                }
                else if(cartas[carta] == 15){
                    iv_12.setImageResource(R.drawable.imagen5);
                }
                else if(cartas[carta] == 16){
                    iv_12.setImageResource(R.drawable.imagen6);
                }
                else if(cartas[carta] == 17){
                    iv_12.setImageResource(R.drawable.imagen7);
                }
                else if(cartas[carta] == 18){
                    iv_12.setImageResource(R.drawable.imagen8);
                }

                funcion(iv_12, carta);
            }
        });

        iv_13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int carta = Integer.parseInt((String) iv_13.getTag());

                if(cartas[carta] == 1){
                    iv_13.setImageResource(R.drawable.imagen1);
                }
                else if(cartas[carta] == 2){
                    iv_13.setImageResource(R.drawable.imagen2);
                }
                else if(cartas[carta] == 3){
                    iv_13.setImageResource(R.drawable.imagen3);
                }
                else if(cartas[carta] == 4){
                    iv_13.setImageResource(R.drawable.imagen4);
                }
                else if(cartas[carta] == 5){
                    iv_13.setImageResource(R.drawable.imagen5);
                }
                else if(cartas[carta] == 6){
                    iv_13.setImageResource(R.drawable.imagen6);
                }
                else if(cartas[carta] == 7){
                    iv_13.setImageResource(R.drawable.imagen7);
                }
                else if(cartas[carta] == 8){
                    iv_13.setImageResource(R.drawable.imagen8);
                }
                else if(cartas[carta] == 11){
                    iv_13.setImageResource(R.drawable.imagen1);
                }
                else if(cartas[carta] == 12){
                    iv_13.setImageResource(R.drawable.imagen2);
                }else if(cartas[carta] == 13) {
                    iv_13.setImageResource(R.drawable.imagen3);
                }
                else if(cartas[carta] == 14){
                    iv_13.setImageResource(R.drawable.imagen4);
                }
                else if(cartas[carta] == 15){
                    iv_13.setImageResource(R.drawable.imagen5);
                }
                else if(cartas[carta] == 16){
                    iv_13.setImageResource(R.drawable.imagen6);
                }
                else if(cartas[carta] == 17){
                    iv_13.setImageResource(R.drawable.imagen7);
                }
                else if(cartas[carta] == 18){
                    iv_13.setImageResource(R.drawable.imagen8);
                }

                funcion(iv_13, carta);
            }
        });

        iv_14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int carta = Integer.parseInt((String) iv_14.getTag());

                if(cartas[carta] == 1){
                    iv_14.setImageResource(R.drawable.imagen1);
                }
                else if(cartas[carta] == 2){
                    iv_14.setImageResource(R.drawable.imagen2);
                }
                else if(cartas[carta] == 3){
                    iv_14.setImageResource(R.drawable.imagen3);
                }
                else if(cartas[carta] == 4){
                    iv_14.setImageResource(R.drawable.imagen4);
                }
                else if(cartas[carta] == 5){
                    iv_14.setImageResource(R.drawable.imagen5);
                }
                else if(cartas[carta] == 6){
                    iv_14.setImageResource(R.drawable.imagen6);
                }
                else if(cartas[carta] == 7){
                    iv_14.setImageResource(R.drawable.imagen7);
                }
                else if(cartas[carta] == 8){
                    iv_14.setImageResource(R.drawable.imagen8);
                }
                else if(cartas[carta] == 11){
                    iv_14.setImageResource(R.drawable.imagen1);
                }
                else if(cartas[carta] == 12){
                    iv_14.setImageResource(R.drawable.imagen2);
                }else if(cartas[carta] == 13){
                    iv_14.setImageResource(R.drawable.imagen3);
                }
                else if(cartas[carta] == 14){
                    iv_14.setImageResource(R.drawable.imagen4);
                }
                else if(cartas[carta] == 15){
                    iv_14.setImageResource(R.drawable.imagen5);
                }
                else if(cartas[carta] == 16){
                    iv_14.setImageResource(R.drawable.imagen6);
                }
                else if(cartas[carta] == 17){
                    iv_14.setImageResource(R.drawable.imagen7);
                }
                else if(cartas[carta] == 18){
                    iv_14.setImageResource(R.drawable.imagen8);
                }

                funcion(iv_14, carta);
            }
        });

        iv_15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int carta = Integer.parseInt((String) iv_15.getTag());

                if(cartas[carta] == 1){
                    iv_15.setImageResource(R.drawable.imagen1);
                }
                else if(cartas[carta] == 2){
                    iv_15.setImageResource(R.drawable.imagen2);
                }
                else if(cartas[carta] == 3){
                    iv_15.setImageResource(R.drawable.imagen3);
                }
                else if(cartas[carta] == 4){
                    iv_15.setImageResource(R.drawable.imagen4);
                }
                else if(cartas[carta] == 5){
                    iv_15.setImageResource(R.drawable.imagen5);
                }
                else if(cartas[carta] == 6){
                    iv_15.setImageResource(R.drawable.imagen6);
                }
                else if(cartas[carta] == 7){
                    iv_15.setImageResource(R.drawable.imagen7);
                }
                else if(cartas[carta] == 8){
                    iv_15.setImageResource(R.drawable.imagen8);
                }
                else if(cartas[carta] == 11){
                    iv_15.setImageResource(R.drawable.imagen1);
                }
                else if(cartas[carta] == 12){
                    iv_15.setImageResource(R.drawable.imagen2);
                }else if(cartas[carta] == 13){
                    iv_15.setImageResource(R.drawable.imagen3);
                }
                else if(cartas[carta] == 14){
                    iv_15.setImageResource(R.drawable.imagen4);
                }
                else if(cartas[carta] == 15){
                    iv_15.setImageResource(R.drawable.imagen5);
                }
                else if(cartas[carta] == 16){
                    iv_15.setImageResource(R.drawable.imagen6);
                }
                else if(cartas[carta] == 17){
                    iv_15.setImageResource(R.drawable.imagen7);
                }
                else if(cartas[carta] == 18){
                    iv_15.setImageResource(R.drawable.imagen8);
                }

                funcion(iv_15, carta);
            }
        });

        iv_16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int carta = Integer.parseInt((String) iv_16.getTag());

                if(cartas[carta] == 1){
                    iv_16.setImageResource(R.drawable.imagen1);
                }
                else if(cartas[carta] == 2){
                    iv_16.setImageResource(R.drawable.imagen2);
                }
                else if(cartas[carta] == 3){
                    iv_16.setImageResource(R.drawable.imagen3);
                }
                else if(cartas[carta] == 4){
                    iv_16.setImageResource(R.drawable.imagen4);
                }
                else if(cartas[carta] == 5){
                    iv_16.setImageResource(R.drawable.imagen5);
                }
                else if(cartas[carta] == 6){
                    iv_16.setImageResource(R.drawable.imagen6);
                }
                else if(cartas[carta] == 7){
                    iv_16.setImageResource(R.drawable.imagen7);
                }
                else if(cartas[carta] == 8){
                    iv_16.setImageResource(R.drawable.imagen8);
                }
                else if(cartas[carta] == 11){
                    iv_16.setImageResource(R.drawable.imagen1);
                }
                else if(cartas[carta] == 12){
                    iv_16.setImageResource(R.drawable.imagen2);
                }else if(cartas[carta] == 13){
                    iv_16.setImageResource(R.drawable.imagen3);
                }
                else if(cartas[carta] == 14){
                    iv_16.setImageResource(R.drawable.imagen4);
                }
                else if(cartas[carta] == 15){
                    iv_16.setImageResource(R.drawable.imagen5);
                }
                else if(cartas[carta] == 16){
                    iv_16.setImageResource(R.drawable.imagen6);
                }
                else if(cartas[carta] == 17){
                    iv_16.setImageResource(R.drawable.imagen7);
                }
                else if(cartas[carta] == 18){
                    iv_16.setImageResource(R.drawable.imagen8);
                }

                funcion(iv_16, carta);
            }
        });

        chrono.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
            @Override
            public void onChronometerTick(Chronometer chronometer) {
                chrono = chronometer;
            }
        });
        chrono.start();


        return view;
    }

    private void funcion(ImageView iv, int  carta){

        if(ordenCarta == true){
            turno1 = cartas[carta];
            if(turno1 > 10){
                turno1 = turno1 -10;
            }
            tag1 = carta;
            ordenCarta = false;
            iv.setEnabled(false);
        } else if(ordenCarta == false){
            turno2 = cartas[carta];
            if(turno2 > 10){
                turno2 = turno2 -10;
            }
            tag2 = carta;
            ordenCarta = true;
            iv_1.setEnabled(false);
            iv_2.setEnabled(false);
            iv_3.setEnabled(false);
            iv_4.setEnabled(false);
            iv_5.setEnabled(false);
            iv_6.setEnabled(false);
            iv_7.setEnabled(false);
            iv_8.setEnabled(false);
            iv_9.setEnabled(false);
            iv_10.setEnabled(false);
            iv_11.setEnabled(false);
            iv_12.setEnabled(false);
            iv_13.setEnabled(false);
            iv_14.setEnabled(false);
            iv_15.setEnabled(false);
            iv_16.setEnabled(false);

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                public void run(){
                    if (turno1 == turno2) {
                        if (tag1 == 0) {
                            iv_1.setVisibility(View.INVISIBLE);
                        } else if (tag1 == 1) {
                            iv_2.setVisibility(View.INVISIBLE);
                        } else if (tag1 == 2) {
                            iv_3.setVisibility(View.INVISIBLE);
                        } else if (tag1 == 3) {
                            iv_4.setVisibility(View.INVISIBLE);
                        } else if (tag1 == 4) {
                            iv_5.setVisibility(View.INVISIBLE);
                        } else if (tag1 == 5) {
                            iv_6.setVisibility(View.INVISIBLE);
                        } else if (tag1 == 6) {
                            iv_7.setVisibility(View.INVISIBLE);
                        }else if (tag1 == 7) {
                            iv_8.setVisibility(View.INVISIBLE);
                        }else if (tag1 == 8) {
                            iv_9.setVisibility(View.INVISIBLE);
                        }else if (tag1 == 9) {
                            iv_10.setVisibility(View.INVISIBLE);
                        }else if (tag1 == 10) {
                            iv_11.setVisibility(View.INVISIBLE);
                        }else if (tag1 == 11) {
                            iv_12.setVisibility(View.INVISIBLE);
                        }else if (tag1 == 12) {
                            iv_13.setVisibility(View.INVISIBLE);
                        }else if (tag1 == 13) {
                            iv_14.setVisibility(View.INVISIBLE);
                        }else if (tag1 == 14) {
                            iv_15.setVisibility(View.INVISIBLE);
                        }else if (tag1 == 15) {
                            iv_16.setVisibility(View.INVISIBLE);
                        }



                        if (tag2 == 0) {
                            iv_1.setVisibility(View.INVISIBLE);
                        } else if (tag2 == 1) {
                            iv_2.setVisibility(View.INVISIBLE);
                        } else if (tag2 == 2){
                            iv_3.setVisibility(View.INVISIBLE);
                        } else if (tag2 == 3) {
                            iv_4.setVisibility(View.INVISIBLE);
                        } else if (tag2 == 4) {
                            iv_5.setVisibility(View.INVISIBLE);
                        } else if (tag2 == 5) {
                            iv_6.setVisibility(View.INVISIBLE);
                        } else if (tag2 == 6) {
                            iv_7.setVisibility(View.INVISIBLE);
                        } else if (tag2 == 7) {
                            iv_8.setVisibility(View.INVISIBLE);
                        } else if (tag2 == 8) {
                            iv_9.setVisibility(View.INVISIBLE);
                        } else if (tag2 == 9) {
                            iv_10.setVisibility(View.INVISIBLE);
                        } else if (tag2 == 10) {
                            iv_11.setVisibility(View.INVISIBLE);
                        } else if (tag2 == 11) {
                            iv_12.setVisibility(View.INVISIBLE);
                        } else if (tag2 == 12) {
                            iv_13.setVisibility(View.INVISIBLE);
                        } else if (tag2 == 13) {
                            iv_14.setVisibility(View.INVISIBLE);
                        } else if (tag2 == 14) {
                            iv_15.setVisibility(View.INVISIBLE);
                        } else if (tag2 == 15) {
                            iv_16.setVisibility(View.INVISIBLE);
                        }


                        cnt +=1;
                        if(cnt==8){
                            chrono.stop();
                            int stoppedMilliseconds = 0;
                            String chronoText = chrono.getText().toString();
                            String array[] = chronoText.split(":");
                            if (array.length == 2) {
                                stoppedMilliseconds = Integer.parseInt(array[0]) * 60 * 1000
                                        + Integer.parseInt(array[1]) * 1000;

                                stoppedMilliseconds = stoppedMilliseconds /1000;
                            } else if (array.length == 3) {
                                stoppedMilliseconds = Integer.parseInt(array[0]) * 60 * 60 * 1000
                                        + Integer.parseInt(array[1]) * 60 * 1000
                                        + Integer.parseInt(array[2]) * 1000;

                                stoppedMilliseconds = stoppedMilliseconds /1000;
                            }

                            int points = 5000 - stoppedMilliseconds * 1;
                            name = nombre.getText().toString();


                            //realm = Realm.getDefaultInstance();


                            volleyPost(name, Integer.toString(points));
                            //realm.beginTransaction();
                            //Score score = new Score(name, Integer.toString(points));
                            //realm.copyToRealm(score);
                            //realm.commitTransaction();





                            //realm.beginTransaction();
                            AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                            builder.setTitle(R.string.alert_title);
                            builder.setMessage(getResources().getString(R.string.alert_1) + " "+ stoppedMilliseconds+ " " + getResources().getString(R.string.alert_2) + " "  + name + " " + getResources().getString(R.string.alert_3) + " " + points + " " + getResources().getString(R.string.alert_4));
                            builder.setPositiveButton(R.string.volver, new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    Intent intent = new Intent(getContext(), MainActivity.class);
                                    startActivity(intent);
                                }
                            });
                            builder.show();


                        }
                    } else{
                        iv_1.setImageResource(R.drawable.back);
                        iv_2.setImageResource(R.drawable.back);
                        iv_3.setImageResource(R.drawable.back);
                        iv_4.setImageResource(R.drawable.back);
                        iv_5.setImageResource(R.drawable.back);
                        iv_6.setImageResource(R.drawable.back);
                        iv_7.setImageResource(R.drawable.back);
                        iv_8.setImageResource(R.drawable.back);
                        iv_9.setImageResource(R.drawable.back);
                        iv_10.setImageResource(R.drawable.back);
                        iv_11.setImageResource(R.drawable.back);
                        iv_12.setImageResource(R.drawable.back);
                        iv_13.setImageResource(R.drawable.back);
                        iv_14.setImageResource(R.drawable.back);
                        iv_15.setImageResource(R.drawable.back);
                        iv_16.setImageResource(R.drawable.back);
                    }
                    iv_1.setEnabled(true);
                    iv_2.setEnabled(true);
                    iv_3.setEnabled(true);
                    iv_4.setEnabled(true);
                    iv_5.setEnabled(true);
                    iv_6.setEnabled(true);
                    iv_7.setEnabled(true);
                    iv_8.setEnabled(true);
                    iv_9.setEnabled(true);
                    iv_10.setEnabled(true);
                    iv_11.setEnabled(true);
                    iv_12.setEnabled(true);
                    iv_13.setEnabled(true);
                    iv_14.setEnabled(true);
                    iv_15.setEnabled(true);
                    iv_16.setEnabled(true);
                }

            }, 500);
        }
    }
    public void volleyPost(String name, String points){
        String postUrl = "https://memorypuzzle.herokuapp.com/scores";
        RequestQueue requestQueue = Volley.newRequestQueue(this.getContext());

        JSONObject postData = new JSONObject();
        try {
            postData.put("name", name);
            postData.put("points", points);

        } catch (JSONException e) {
            e.printStackTrace();
        }

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST, postUrl, postData, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                System.out.println(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        });

        requestQueue.add(jsonObjectRequest);

    }
}