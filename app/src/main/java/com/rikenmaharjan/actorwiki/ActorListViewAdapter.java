package com.rikenmaharjan.actorwiki;

import android.content.Context;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ActorListViewAdapter extends ArrayAdapter<Actor>{


    private final OnActorClickListener onActorClickListener;


    public interface OnActorClickListener{

       void OnActorClick(Actor actor);


    }


    public ActorListViewAdapter(Context context, OnActorClickListener onActorClickListener){
        super(context,0);
        this.onActorClickListener = onActorClickListener;


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        if(convertView == null){

        convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_cell,parent,false);


        }



        final Actor actor = getItem(position);

        TextView firstName = (TextView) convertView.findViewById(R.id.txtViewFirstName);
        TextView lastName = (TextView) convertView.findViewById(R.id.txtViewLastName);
        TextView  country = (TextView) convertView.findViewById(R.id.txtViewCountry);



        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onActorClicked(actor);
            }
        });


        firstName.setText(actor.getFirstName());
        lastName.setText(actor.getLastName());
        country.setText(actor.getCountry());


        return convertView;


    }

    @Override
    public int getCount() {
        return super.getCount();
    }


    private void onActorClicked(Actor actor) {
        onActorClickListener.OnActorClick(actor);
    }






}


