package com.rikenmaharjan.actorwiki;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;

public class ActorWikiDetail extends AppCompatActivity {


    //do call using retrofit for image if you want

    public ActorDetailMVCImpl mActorDetailMVCImpl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mActorDetailMVCImpl = new ActorDetailMVCImpl(LayoutInflater.from(this),null);

        getDataFromIntent();


        setContentView(mActorDetailMVCImpl.getRootView());

    }


    public static void startActivity(Context context, Actor actorDetail){
        Intent intent = new Intent(context,ActorWikiDetail.class);
        intent.putExtra("firstname",actorDetail.getFirstName());
        intent.putExtra("lastname",actorDetail.getLastName());

        intent.putExtra("country",actorDetail.getCountry());


        context.startActivity(intent);

    }



    public void getDataFromIntent(){


        Intent intent = getIntent();

        String firstname = intent.getStringExtra("firstname");
        String lastname = intent.getStringExtra("lastname");

        String country = intent.getStringExtra("country");
//        String image = intent.getStringExtra("imageUrl");





        Actor actor = new Actor(firstname,lastname,country);


        // do image call here


        mActorDetailMVCImpl.bindActorDetailToView(actor);




    }





}
