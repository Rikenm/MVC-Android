//package com.rikenmaharjan.actorwiki.DependencyInjection;
//
//
//
//
//import android.support.annotation.UiThread;
//
//import com.rikenmaharjan.actorwiki.Networking.ActorService;
//import com.rikenmaharjan.actorwiki.Networking.NetworkLayer.NetworkFetchActor;
//
//import retrofit2.Retrofit;
//import retrofit2.converter.gson.GsonConverterFactory;
//
//public class CompositionRoot {
//
//    private Retrofit mRetrofit;
//    private ActorService mActorService;
//    private NetworkFetchActor mNetworkFetchActor;
//    private ViewFactory mViewFactory;
//
//
//    @UiThread
//    public Retrofit getRetrofit(){
//        if(mRetrofit == null){
//
//            mRetrofit = new Retrofit.Builder()
//                    .baseUrl("https://api.myjson.com/bins/")
//                    .addConverterFactory(GsonConverterFactory.create())
//                    .build();
//        }
//
//
//        return  mRetrofit;
//
//
//    }
//
//    @UiThread
//    public ActorService getActorService(){
//
//        if(mActorService == null){
//            mActorService = getRetrofit().create(ActorService.class);
//
//
//        }
//
//        return  mActorService;
//    }
//
//    @UiThread
//    public NetworkFetchActor getNetworkFetcherActor(){
//        if(mNetworkFetchActor == null){
//
//            mNetworkFetchActor = new NetworkFetchActor(getActorService());
//        }
//
//        return  mNetworkFetchActor;
//
//
//    }
//
//
//}
