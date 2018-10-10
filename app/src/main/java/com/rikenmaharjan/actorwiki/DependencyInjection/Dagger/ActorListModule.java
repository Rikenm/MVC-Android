package com.rikenmaharjan.actorwiki.DependencyInjection.Dagger;


import android.view.LayoutInflater;

import com.rikenmaharjan.actorwiki.DependencyInjection.ViewFactory;

import com.rikenmaharjan.actorwiki.Networking.NetworkLayer.NetworkFetchActor;

import dagger.Module;
import dagger.Provides;

@Module
public class ActorListModule {

//    private  ApplicationComponent mApplicationComponent;
//    private ViewFactory mViewFactory;

    private LayoutInflater mLayoutInflater;
    // all other dependency


    public ActorListModule( LayoutInflater layoutInflater){

//        mApplicationComponent = applicationComponent;
        mLayoutInflater = layoutInflater;

    }

//    @Provides
//    NetworkFetchActor getNetworkFetcherActor(){
//
//
//
//        return new NetworkFetchActor(mApplicationComponent.getActorService());
//
//
//    }

//    @Provides
//    NetworkFetchActor getNetworkFetcherActor(){
//
//        return mApplicationComponent.getNetworkFetcherActor();
//    }

    @Provides
    ViewFactory getViewMVCFactory(){

        return new ViewFactory(mLayoutInflater);

    }


}
