package com.rikenmaharjan.actorwiki;


import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;

import com.rikenmaharjan.actorwiki.Application.MyApplication;
import com.rikenmaharjan.actorwiki.BaseStructure.BaseActivity;
import com.rikenmaharjan.actorwiki.Networking.ActorService;
import com.rikenmaharjan.actorwiki.Networking.NetworkLayer.NetworkFetchActor;

import java.util.List;

import retrofit2.Retrofit;


public class ActorWiki extends BaseActivity implements ActorViewMVC.Listener, NetworkFetchActor.Listener {

    //inject retrofit service;


    // root activity


//    public ActorService mActorService;
    public ActorViewMVCImpl mActorViewMVCImpl;
    public NetworkFetchActor mNetworkFetchActor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



//        mActorService = new Retrofit.Builder()
//                .baseUrl("https://api.myjson.com/bins/")
//                .addConverterFactory(GsonConverterFactory.create())
//                .build()
//                .create(ActorService.class);


//       ActorService actorService = ((MyApplication) getApplication()).getActorService();

//        mNetworkFetchActor = new NetworkFetchActor(actorService);

        mNetworkFetchActor = getCompositionRoot().getNetworkFetcherActor();

        mNetworkFetchActor.registerListener(this);


//        mActorViewMVCImpl = new ActorViewMVCImpl(LayoutInflater.from(this),null);

        mActorViewMVCImpl = getCompositionRoot().getViewMVCFactory().newInstance(ActorViewMVCImpl.class,null);



        mActorViewMVCImpl.registerListener(this);
        setContentView(mActorViewMVCImpl.getRootView());





    }


//    public void getActorListFromNetwork(){
//
//
//        mActorService.getActorsList()
//                .enqueue(new Callback<ListActorResponse>() {
//                    @Override
//                    public void onResponse(Call<ListActorResponse> call, Response<ListActorResponse> response) {
//                        if(response.isSuccessful()){
//
//                            translateData(response.body().getActorResponses());
//
//
//                        }else{
//
//                            //failed
//                            System.out.println("Failed");
//                        }
//
//
//                    }
//
//                    @Override
//                    public void onFailure(Call<ListActorResponse> call, Throwable t) {
//
//                        //failed
//                        System.out.println("Failed");
//
//                    }
//                });
//
//    }

//    public void translateData(List<ActorResponse> actorResponseList){
//
//        List<Actor> actorlist = new ArrayList<>();
//
//        for(ActorResponse a : actorResponseList){
//
//            actorlist.add(new Actor(a.getFirstName(),a.getLastName(),a.getCountry()));
//
//        }
//
//        mActorViewMVCImpl.bindActorToListView(actorlist);
//
//
//
//
//
//
//    }


    @Override
    public void onActorClick(Actor actor) {

//        Toast.makeText(this, "actor"+actor.getFirstName()+actor.getLastName()+" was clicked", Toast.LENGTH_SHORT).show();

        ActorWikiDetail.startActivity(this, actor);



    }


    @Override
    protected void onDestroy() {
        super.onDestroy();

        if(mActorViewMVCImpl != null){
            mActorViewMVCImpl.unRegisterListener(this);

        }

        if(mNetworkFetchActor != null){
            mNetworkFetchActor.unRegisterListener(this);

        }
    }



    @Override
    public void onFetchSuccess(List<Actor> actors) {
        mActorViewMVCImpl.bindActorToListView(actors);
    }

    @Override
    public void onFetchFailed() {
      //failed

//        FragmentManager fragmentManager = getSupportFragmentManager();
//        fragmentManager.beginTransaction()
//                .add(ServerErrorDialogFragment.newInstance())
//                .commit();


    }
}
