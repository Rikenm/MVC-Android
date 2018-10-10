package com.rikenmaharjan.actorwiki.DependencyInjection.Dagger;


import com.rikenmaharjan.actorwiki.Networking.ActorService;
import com.rikenmaharjan.actorwiki.Networking.NetworkLayer.NetworkFetchActor;

import dagger.Component;
import retrofit2.Retrofit;



@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {




//  NetworkFetchActor getNetworkFetcherActor();


//    ActorService getActorService();
    NetworkFetchActor getNetworkFetcherActor();





}
