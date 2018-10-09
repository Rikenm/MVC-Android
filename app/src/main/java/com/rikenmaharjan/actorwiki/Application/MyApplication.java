package com.rikenmaharjan.actorwiki.Application;

import android.app.Application;

import com.rikenmaharjan.actorwiki.DependencyInjection.CompositionRoot;


public class MyApplication extends Application {

   private CompositionRoot mCompositionRoot;

    @Override
    public void onCreate() {
        super.onCreate();

        mCompositionRoot = new CompositionRoot();
    }

    public CompositionRoot getCompositionRoot(){
        return  mCompositionRoot;

    }
}
