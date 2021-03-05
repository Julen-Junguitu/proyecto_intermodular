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

public class EasyFragment extends Fragment {

    public EasyFragment() {
        // Required empty public constructor
    }

    Chronometer chrono;
    boolean ordenCarta = true;


    //Realm realm;

    ImageView iv_1;
    ImageView iv_2;
    ImageView iv_3;
    ImageView iv_4;
    ImageView iv_5;
    ImageView iv_6;

    TextView nombre;
    String name;

    int turno1;
    int turno2;

    int tag1;
    int tag2;

    int cnt = 0;

    Integer cartas[] = {1, 2, 3, 11, 12, 13};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_easy, container, false);

        chrono = view.findViewById(R.id.chrono);



        iv_1 = view.findViewById(R.id.iv_1);
        iv_2 = view.findViewById(R.id.iv_2);
        iv_3 = view.findViewById(R.id.iv_3);
        iv_4 = view.findViewById(R.id.iv_4);
        iv_5 = view.findViewById(R.id.iv_5);
        iv_6 = view.findViewById(R.id.iv_6);
        nombre = view.findViewById(R.id.txtNombre);



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
                else if(cartas[carta] == 11){
                    iv_1.setImageResource(R.drawable.imagen1);
                }
                else if(cartas[carta] == 12){
                    iv_1.setImageResource(R.drawable.imagen2);
                }else if(cartas[carta] == 13){
                    iv_1.setImageResource(R.drawable.imagen3);
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
                else if(cartas[carta] == 11){
                    iv_2.setImageResource(R.drawable.imagen1);
                }
                else if(cartas[carta] == 12){
                    iv_2.setImageResource(R.drawable.imagen2);
                }else if(cartas[carta] == 13){
                    iv_2.setImageResource(R.drawable.imagen3);
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
                else if(cartas[carta] == 11){
                    iv_3.setImageResource(R.drawable.imagen1);
                }
                else if(cartas[carta] == 12){
                    iv_3.setImageResource(R.drawable.imagen2);
                }else if(cartas[carta] == 13){
                    iv_3.setImageResource(R.drawable.imagen3);
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
                else if(cartas[carta] == 11){
                    iv_4.setImageResource(R.drawable.imagen1);
                }
                else if(cartas[carta] == 12){
                    iv_4.setImageResource(R.drawable.imagen2);
                }else if(cartas[carta] == 13){
                    iv_4.setImageResource(R.drawable.imagen3);
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
                else if(cartas[carta] == 11){
                    iv_5.setImageResource(R.drawable.imagen1);
                }
                else if(cartas[carta] == 12){
                    iv_5.setImageResource(R.drawable.imagen2);
                }else if(cartas[carta] == 13){
                    iv_5.setImageResource(R.drawable.imagen3);
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
                else if(cartas[carta] == 11){
                    iv_6.setImageResource(R.drawable.imagen1);
                }
                else if(cartas[carta] == 12){
                    iv_6.setImageResource(R.drawable.imagen2);
                }else if(cartas[carta] == 13){
                    iv_6.setImageResource(R.drawable.imagen3);
                }

                funcion(iv_6, carta);
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
                        }
                        cnt +=1;
                        if(cnt==3){
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

                            int points = 5000 - stoppedMilliseconds * 3;




                            name = nombre.getText().toString();

                            volleyPost(name, Integer.toString(points));
                            //realm = Realm.getDefaultInstance();



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
                    }
                    iv_1.setEnabled(true);
                    iv_2.setEnabled(true);
                    iv_3.setEnabled(true);
                    iv_4.setEnabled(true);
                    iv_5.setEnabled(true);
                    iv_6.setEnabled(true);
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




