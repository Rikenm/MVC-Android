package com.rikenmaharjan.actorwiki.Networking;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ListActorResponse {

    @SerializedName("record")
    private final List<ActorResponse>  mActorResponses;




    public ListActorResponse(List<ActorResponse> actorResponses){

        mActorResponses = actorResponses;

    }

    public List<ActorResponse> getActorResponses() {
        return mActorResponses;
    }

}
