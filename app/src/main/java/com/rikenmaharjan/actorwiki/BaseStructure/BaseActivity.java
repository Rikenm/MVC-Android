package com.rikenmaharjan.actorwiki.BaseStructure;

import android.support.annotation.UiThread;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;

import com.rikenmaharjan.actorwiki.Application.MyApplication;
import com.rikenmaharjan.actorwiki.DependencyInjection.ActorListCompositionRoot;
import com.rikenmaharjan.actorwiki.DependencyInjection.CompositionRoot;


public class BaseActivity extends AppCompatActivity {

    private ActorListCompositionRoot actorListCompositionRoot;


    @UiThread
    protected ActorListCompositionRoot getCompositionRoot(){

//        return ((MyApplication) getApplication()).getCompositionRoot();

        if(actorListCompositionRoot == null){
            actorListCompositionRoot = new ActorListCompositionRoot(getAppCompositionRoot(), LayoutInflater.from(this));
        }



       return actorListCompositionRoot;



    }
    @UiThread
     private CompositionRoot getAppCompositionRoot(){

       return  ((MyApplication) getApplication()).getCompositionRoot();


    }


}
