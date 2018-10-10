package com.rikenmaharjan.actorwiki;

import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.support.v7.widget.Toolbar;

import com.rikenmaharjan.actorwiki.BaseStructure.BaseView;
import com.rikenmaharjan.actorwiki.DependencyInjection.ViewFactory;

import java.util.ArrayList;
import java.util.List;


public class ActorViewMVCImpl extends BaseView implements ActorViewMVC, ActorListViewAdapter.OnActorClickListener {

    //View


    private ActorListViewAdapter mActorListViewAdapter;
    private ListView mActorListview;
    private Toolbar mToolbar;
    private com.rikenmaharjan.actorwiki.Utils.Toolbar mToolbarView;


    private List<Listener> mListeners = new ArrayList<>(1);


    public ActorViewMVCImpl(LayoutInflater inflater, @Nullable ViewGroup parent, ViewFactory viewFactory){

        View mRootView = inflater.inflate(R.layout.activity_actor_wiki,parent,false);
        setRootView(mRootView);

        mActorListview = findViewById(R.id.listViewActor);
        mActorListViewAdapter = new ActorListViewAdapter(getContext(),this);
        mActorListview.setAdapter(mActorListViewAdapter);

        mToolbar = findViewById(R.id.toolbar);
        mToolbarView = viewFactory.newInstance(com.rikenmaharjan.actorwiki.Utils.Toolbar.class,mToolbar);
        mToolbarView.setTitle("Friends");
        mToolbar.addView(mToolbarView.getRootView());



    }




//    private <T extends  BaseView> T findViewById(int id){
//
//        return mRootView.findViewById(id);
//
//    }


//    public View getRootView() {
//        return mRootView;
//    }

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
