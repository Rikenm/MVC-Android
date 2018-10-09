package com.rikenmaharjan.actorwiki;

import java.util.List;

public interface ActorViewMVC {

    public interface Listener{

        void onActorClick(Actor actor);

    }

    void registerListener(Listener listener);

    void unRegisterListener(Listener listener);



    void bindActorToListView(List<Actor> actor);


}
