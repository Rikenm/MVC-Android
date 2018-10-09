package com.rikenmaharjan.actorwiki.Networking;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ActorService {

    @GET("10qb18")
    Call<ListActorResponse> getActorsList();

}
