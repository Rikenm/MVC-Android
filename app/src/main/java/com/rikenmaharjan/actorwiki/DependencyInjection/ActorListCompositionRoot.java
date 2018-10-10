//package com.rikenmaharjan.actorwiki.DependencyInjection;
//
//
//import android.view.LayoutInflater;
//
//import com.rikenmaharjan.actorwiki.DependencyInjection.Dagger.ApplicationComponent;
//import com.rikenmaharjan.actorwiki.Networking.NetworkLayer.NetworkFetchActor;
//
//public class ActorListCompositionRoot {
//
////    private CompositionRoot mCompositionRoot;
//
//    private   ApplicationComponent mApplicationComponent;
////    private ViewFactory mViewFactory;
//
//    private LayoutInflater mLayoutInflater;
//    // all other dependency
//
//    public ActorListCompositionRoot(ApplicationComponent applicationComponent, LayoutInflater layoutInflater){
//
//        mApplicationComponent = applicationComponent;
//        mLayoutInflater= layoutInflater;
//
//    }
//
//
//
//    public NetworkFetchActor getNetworkFetcherActor(){
//
//        return mApplicationComponent.getNetworkFetcherActor();
//    }
//
//    public ViewFactory getViewMVCFactory(){
//
//        return new ViewFactory(mLayoutInflater);
//
//    }
//}
