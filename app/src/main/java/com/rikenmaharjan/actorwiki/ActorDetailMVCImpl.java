package com.rikenmaharjan.actorwiki;

import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.rikenmaharjan.actorwiki.BaseStructure.BaseView;
import com.rikenmaharjan.actorwiki.DependencyInjection.ViewFactory;

import java.util.List;

public class ActorDetailMVCImpl extends BaseView implements ActorDetailMVC {


    private TextView txtViewFirstName;
    private TextView txtViewLastName;
    private TextView txtViewCountryName;
    private TextView txtViewAge;
    private ImageView imgView;
    private Toolbar mToolbar;
    private com.rikenmaharjan.actorwiki.Utils.Toolbar mToolbarView;



    public ActorDetailMVCImpl(LayoutInflater inflater, ViewGroup parent,ViewFactory viewFactory){

        View mRootView = inflater.inflate(R.layout.activity_actor_detail,parent,false);

        setRootView(mRootView);

        txtViewFirstName =  findViewById(R.id.txtFirstName);
        txtViewLastName = findViewById(R.id.txtLastName);
        txtViewAge = findViewById(R.id.txtAge);
        txtViewCountryName = findViewById(R.id.txtCountry);
        imgView = findViewById(R.id.imgView);


        //toolbar
        mToolbar = findViewById(R.id.toolbar);
        mToolbarView = viewFactory.newInstance(com.rikenmaharjan.actorwiki.Utils.Toolbar.class,mToolbar);
        mToolbarView.setTitle("Actor");
        mToolbar.addView(mToolbarView.getRootView());



    }


//    private <T extends View> T findViewById(int id){
//
//        return mRootView.findViewById(id);
//
//    }


    @Override
    public void bindActorDetailToView(Actor actor) {
        //

        Log.i("test2",actor.getCountry());

        txtViewFirstName.setText(actor.getFirstName());
        txtViewLastName.setText(actor.getLastName());

        txtViewCountryName.setText(actor.getCountry());



    }

//    public View getRootView() {
//        return mRootView;
//    }
}
