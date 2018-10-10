package com.rikenmaharjan.actorwiki.DependencyInjection.Dagger;


import com.rikenmaharjan.actorwiki.ActorWiki;
import com.rikenmaharjan.actorwiki.ActorWikiDetail;


import dagger.Component;


@Component(dependencies = ApplicationComponent.class,modules = ActorListModule.class)

public interface ActorListComponent {

//    NetworkFetchActor getNetworkFetcherActor();
//    ViewFactory getViewMVCFactory();


    void inject(ActorWiki actorWiki);
    void inject(ActorWikiDetail actorWikidetail);






}
