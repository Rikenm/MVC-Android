package com.rikenmaharjan.actorwiki.Application;

import android.app.Application;


import com.rikenmaharjan.actorwiki.DependencyInjection.Dagger.ApplicationComponent;
import com.rikenmaharjan.actorwiki.DependencyInjection.Dagger.ApplicationModule;
import com.rikenmaharjan.actorwiki.DependencyInjection.Dagger.DaggerApplicationComponent;


public class MyApplication extends Application {

//   private CompositionRoot mCompositionRoot;



    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

//        mCompositionRoot = new CompositionRoot();
        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule())
                .build();
    }


    public ApplicationComponent getApplicationComponent() {
        return mApplicationComponent;
    }



//    public CompositionRoot getCompositionRoot(){
//        return  mCompositionRoot;
//
//    }
}
