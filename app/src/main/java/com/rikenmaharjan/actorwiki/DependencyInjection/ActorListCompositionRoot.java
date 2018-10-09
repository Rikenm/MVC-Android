package com.rikenmaharjan.actorwiki.DependencyInjection;


import android.view.LayoutInflater;

import com.rikenmaharjan.actorwiki.Networking.NetworkLayer.NetworkFetchActor;

public class ActorListCompositionRoot {

    private CompositionRoot mCompositionRoot;
//    private ViewFactory mViewFactory;

    private LayoutInflater mLayoutInflater;
    // all other dependency

    public ActorListCompositionRoot(CompositionRoot compositionRoot, LayoutInflater layoutInflater){

        mCompositionRoot = compositionRoot;
        mLayoutInflater= layoutInflater;

    }






    public NetworkFetchActor getNetworkFetcherActor(){

        return mCompositionRoot.getNetworkFetcherActor();
    }

    public ViewFactory getViewMVCFactory(){

        return new ViewFactory(mLayoutInflater);

    }
}
