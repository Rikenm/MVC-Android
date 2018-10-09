package com.rikenmaharjan.actorwiki;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ActorDetailMVCImpl extends ViewMVC implements ActorDetailMVC {


    private TextView txtViewFirstName;
    private TextView txtViewLastName;
    private TextView txtViewCountryName;
    private TextView txtViewAge;
    private ImageView imgView;
    private View mRootView;


    public ActorDetailMVCImpl(LayoutInflater inflater, ViewGroup parent){

        mRootView = inflater.inflate(R.layout.activity_actor_detail,parent,false);

        txtViewFirstName =  findViewById(R.id.txtFirstName);
        txtViewLastName = findViewById(R.id.txtLastName);
        txtViewAge = findViewById(R.id.txtAge);
        txtViewCountryName = findViewById(R.id.txtCountry);
        imgView = findViewById(R.id.imgView);

        txtViewFirstName.setText("riken");


    }


    private <T extends View> T findViewById(int id){

        return mRootView.findViewById(id);

    }


    @Override
    public void bindActorDetailToView(Actor actor) {
        //

        Log.i("test2",actor.getCountry());

        txtViewFirstName.setText(actor.getFirstName());
        txtViewLastName.setText(actor.getLastName());

        txtViewCountryName.setText(actor.getCountry());



    }

    public View getRootView() {
        return mRootView;
    }
}
