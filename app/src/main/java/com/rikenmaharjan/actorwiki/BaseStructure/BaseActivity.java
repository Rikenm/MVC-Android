package com.rikenmaharjan.actorwiki.BaseStructure;

import android.support.annotation.UiThread;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;

import com.rikenmaharjan.actorwiki.Application.MyApplication;
//import com.rikenmaharjan.actorwiki.DependencyInjection.ActorListCompositionRoot;

import com.rikenmaharjan.actorwiki.DependencyInjection.Dagger.ActorListComponent;
import com.rikenmaharjan.actorwiki.DependencyInjection.Dagger.ActorListModule;
import com.rikenmaharjan.actorwiki.DependencyInjection.Dagger.ApplicationComponent;
import com.rikenmaharjan.actorwiki.DependencyInjection.Dagger.DaggerActorListComponent;



public class BaseActivity extends AppCompatActivity {

//    private ActorListCompositionRoot actorListCompositionRoot;
//    private ActorListModule actorListModule;

    private boolean isInjected;



    protected ActorListComponent getCompositionRoot(){

//        return ((MyApplication) getApplication()).getCompositionRoot();

//        if(actorListCompositionRoot == null){
//            actorListCompositionRoot = new ActorListCompositionRoot(getApplicationComponent(), LayoutInflater.from(this));
//        }
//

        if(isInjected){
            throw new RuntimeException("Already injected");
        }

        isInjected = true;


       return DaggerActorListComponent.builder()
                .actorListModule(new ActorListModule(LayoutInflater.from(this)))
                .applicationComponent(getApplicationComponent())
                .build();



    }




    public ApplicationComponent getApplicationComponent() {
        return  ((MyApplication) getApplication()).getApplicationComponent();
    }


//    @UiThread
//     private CompositionRoot getAppCompositionRoot(){
//
//       return  ((MyApplication) getApplication()).getCompositionRoot();
//
//
//    }


}
