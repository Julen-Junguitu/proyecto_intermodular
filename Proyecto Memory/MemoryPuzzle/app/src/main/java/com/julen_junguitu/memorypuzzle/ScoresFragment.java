package com.julen_junguitu.memorypuzzle;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import io.realm.Realm;
import io.realm.RealmChangeListener;
import io.realm.RealmResults;

public class ScoresFragment extends Fragment {

    RealmResults<Score> scoreList ;
    RecyclerView recyclerView;
    RecyclerDataAdapter recyclerDataAdapter;
    Realm realm;
    List<Score> scores = new ArrayList<>();
    private String url = "https://memorypuzzle.herokuapp.com/scores";


    public ScoresFragment() {
        // Required empty public constructor
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
     public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_scores, container, false);


        recyclerView = (RecyclerView)view.findViewById(R.id.recycler);

        /*realm = Realm.getDefaultInstance();

        //realm.beginTransaction();
        //realm.deleteAll();
        //realm.commitTransaction();

        scoreList = realm.where(Score.class).findAll();

        recyclerDataAdapter = new RecyclerDataAdapter(scoreList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL,false));
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(), LinearLayout.VERTICAL));
        recyclerView.setAdapter(recyclerDataAdapter);

*/





        getData();

        /*scores.sort(new Comparator<Score>() {
            @Override
            public int compare(Score o1, Score o2) {
                if(Integer.valueOf(o1.getPoints())  == Integer.valueOf(o2.getPoints()) ){
                    return 0;
                }
                if(Integer.valueOf(o1.getPoints())  < Integer.valueOf(o2.getPoints()) ){
                    return -1;
                }
                return  1;
            }
        });*/

        recyclerDataAdapter = new RecyclerDataAdapter(scores);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL,false));
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(), LinearLayout.VERTICAL));
        recyclerView.setAdapter(recyclerDataAdapter);



        return view;

    }
    private void getData() {

        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET,url, null,new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                for (int i = 0; i < response.length(); i++) {
                    try {
                        JSONObject jsonObject = response.getJSONObject(i);

                        Score score = new Score();
                        score.setName(jsonObject.getString("name"));
                        score.setPoints(jsonObject.getString("points"));

                        scores.add(score);
                    } catch (JSONException e) {
                        e.printStackTrace();

                    }
                }
                recyclerDataAdapter.notifyDataSetChanged();

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("Volley", error.toString());

            }
        });

        RequestQueue requestQueue = Volley.newRequestQueue(getContext());
        requestQueue.add(jsonArrayRequest);
    }

}