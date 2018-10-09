package com.rikenmaharjan.actorwiki;


import android.net.sip.SipSession;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.zip.Inflater;

public class ActorViewMVCImpl extends ViewMVC implements ActorViewMVC, ActorListViewAdapter.OnActorClickListener {

    //View




    private ActorListViewAdapter mActorListViewAdapter;
    private ListView mActorListview;

    private View mRootView;

    private List<Listener> mListeners = new ArrayList<>(1);


    public ActorViewMVCImpl(LayoutInflater inflater, ViewGroup parent){

        mRootView = inflater.inflate(R.layout.activity_actor_wiki,parent,false);


        mActorListview = findViewById(R.id.listViewActor);
        mActorListViewAdapter = new ActorListViewAdapter(mRootView.getContext(),this);
        mActorListview.setAdapter(mActorListViewAdapter);





    }




    private <T extends View> T findViewById(int id){

        return mRootView.findViewById(id);

    }


    public View getRootView() {
        return mRootView;
    }

    public void  registerListener(Listener listener){

        mListeners.add(listener);

    }


    public void  unRegisterListener(Listener listener){

        mListeners.remove(listener);

    }




    @Override
    public void OnActorClick(Actor actor) {

        for(Listener l: mListeners){
            l.onActorClick(actor);

        }


    }


    public void bindActorToListView(List<Actor> actors){


        mActorListViewAdapter.clear();
        mActorListViewAdapter.addAll(actors);
        mActorListViewAdapter.notifyDataSetChanged();



    }
}
