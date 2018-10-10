package com.rikenmaharjan.actorwiki.DependencyInjection.Dagger;


import android.support.annotation.UiThread;


import com.rikenmaharjan.actorwiki.Networking.ActorService;
import com.rikenmaharjan.actorwiki.Networking.NetworkLayer.NetworkFetchActor;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class ApplicationModule {
    //

    private Retrofit mRetrofit;
    private ActorService mActorService;
    private NetworkFetchActor mNetworkFetchActor;


    @Provides
    Retrofit getRetrofit(){
        mRetrofit = new Retrofit.Builder()
                .baseUrl("https://api.myjson.com/bins/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return  mRetrofit;


    }


    @Provides
     ActorService getActorService(Retrofit retrofit){


        mActorService = retrofit.create(ActorService.class);

        return  mActorService;
    }

//    @ApplicationModuleScope
    @Provides
     NetworkFetchActor getNetworkFetcherActor(ActorService actorService){

            mNetworkFetchActor = new NetworkFetchActor(actorService);


        return  mNetworkFetchActor;


    }





}
