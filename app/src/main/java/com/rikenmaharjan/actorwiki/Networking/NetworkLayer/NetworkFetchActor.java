package com.rikenmaharjan.actorwiki.Networking.NetworkLayer;

import com.rikenmaharjan.actorwiki.Actor;
import com.rikenmaharjan.actorwiki.Networking.ActorResponse;
import com.rikenmaharjan.actorwiki.Networking.ActorService;
import com.rikenmaharjan.actorwiki.Networking.ListActorResponse;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class NetworkFetchActor {


    public ActorService mActorService;
    public NetworkFetchActor.Listener listener;



    public interface Listener{


         void onFetchSuccess(List<Actor> actors);
         void onFetchFailed();

    }


    public NetworkFetchActor(ActorService actorService){


//        mActorService = retrofit.create(ActorService.class);

        mActorService = actorService;

//        mActorService = new Retrofit.Builder()
//                .baseUrl("https://api.myjson.com/bins/")
//                .addConverterFactory(GsonConverterFactory.create())
//                .build()
//                .create(ActorService.class);



        getActorListFromNetwork();


    }



    public void getActorListFromNetwork(){


        mActorService.getActorsList()
                .enqueue(new Callback<ListActorResponse>() {
                    @Override
                    public void onResponse(Call<ListActorResponse> call, Response<ListActorResponse> response) {
                        if(response.isSuccessful()){

                            translateData(response.body().getActorResponses());


                        }else{

                            //failed
                            System.out.println("Failed");
                            listener.onFetchFailed();
                        }


                    }

                    @Override
                    public void onFailure(Call<ListActorResponse> call, Throwable t) {

                        //failed
                        System.out.println("Failed");

                        listener.onFetchFailed();

                    }
                });

    }


    public void translateData(List<ActorResponse> actorResponseList){

        List<Actor> actorlist = new ArrayList<>();

        for(ActorResponse a : actorResponseList){

            actorlist.add(new Actor(a.getFirstName(),a.getLastName(),a.getCountry()));

        }



        listener.onFetchSuccess(actorlist);




    }


    public void registerListener(NetworkFetchActor.Listener listener){

        this.listener = listener;

    }

    public void unRegisterListener(NetworkFetchActor.Listener listener){

        this.listener = null;

    }





}
