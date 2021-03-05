package com.julen_junguitu.memorypuzzle;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

public class LevelFragment extends Fragment {

    Button btnFacil;
    Button btnMedio;
    Button btnDificil;

    public LevelFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_level, container, false);


        btnFacil= view.findViewById(R.id.btnFacil);
        btnMedio= view.findViewById(R.id.btnMedio);
        btnDificil= view.findViewById(R.id.btnDificil);

        btnFacil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setMessage(R.string.nombre_usuario);
                EditText input = new EditText(getContext());
                input.setInputType(InputType.TYPE_CLASS_TEXT);
                builder.setView(input);
                builder.setTitle(R.string.facil);

                builder.setPositiveButton("START!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if(input.getText().toString().trim().length() < 1 ){
                            Toast myToast = Toast.makeText(getContext(), R.string.usuario_no_valido, Toast.LENGTH_LONG);
                            myToast.show();
                        }
                        else
                        {
                            Intent intent = new Intent(getContext(), PlayActivity.class);
                            intent.putExtra("usuario", input.getText().toString());
                            intent.putExtra("dificultad", "e");
                            startActivity(intent);}
                    }
                });

                builder.setNegativeButton("Cancel", null);
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                builder.show();
            }});

        btnMedio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setMessage(R.string.nombre_usuario);
                EditText input = new EditText(getContext());
                input.setInputType(InputType.TYPE_CLASS_TEXT);
                builder.setView(input);
                builder.setTitle(R.string.medio);

                builder.setPositiveButton("START!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if(input.getText().toString().trim().length() < 1 ){
                            Toast myToast = Toast.makeText(getContext(), R.string.usuario_no_valido, Toast.LENGTH_LONG);
                            myToast.show();
                        }
                        else
                        {
                            Intent intent = new Intent(getContext(), PlayActivity.class);
                            intent.putExtra("usuario", input.getText().toString());
                            intent.putExtra("dificultad","n");
                            startActivity(intent);}
                    }
                });

                builder.setNegativeButton("Cancel", null);
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                builder.show();
            }});

        btnDificil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setMessage(R.string.nombre_usuario);
                EditText input = new EditText(getContext());
                input.setInputType(InputType.TYPE_CLASS_TEXT);
                builder.setView(input);
                builder.setTitle(R.string.dificil);

                builder.setPositiveButton("START!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if(input.getText().toString().trim().length() < 1 ){
                            Toast myToast = Toast.makeText(getContext(), R.string.usuario_no_valido, Toast.LENGTH_LONG);
                            myToast.show();
                        }
                        else
                        {
                            Intent intent = new Intent(getContext(), PlayActivity.class);
                            intent.putExtra("usuario", input.getText().toString());
                            intent.putExtra("dificultad","h");
                            startActivity(intent);}
                    }
                });

                builder.setNegativeButton("Cancel", null);
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                builder.show();
            }});

        return view;



    }
}