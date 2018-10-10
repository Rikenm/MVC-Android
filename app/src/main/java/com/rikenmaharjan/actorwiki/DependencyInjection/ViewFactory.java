package com.rikenmaharjan.actorwiki.DependencyInjection;

import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.rikenmaharjan.actorwiki.ActorDetailMVCImpl;
import com.rikenmaharjan.actorwiki.ActorViewMVCImpl;
import com.rikenmaharjan.actorwiki.BaseStructure.BaseView;
import com.rikenmaharjan.actorwiki.Utils.Toolbar;
import com.rikenmaharjan.actorwiki.ViewMVC;

public class ViewFactory {

    private final LayoutInflater mLayoutInflater;

    public ViewFactory(LayoutInflater layoutInflater){ mLayoutInflater = layoutInflater; }

    public<T extends BaseView> T newInstance(Class<T>  mvcViewClass, @Nullable ViewGroup container){



        BaseView viewMvc;

        if (mvcViewClass == ActorViewMVCImpl.class) {
            viewMvc = new ActorViewMVCImpl(mLayoutInflater, container,this);
        }
        else if (mvcViewClass == ActorDetailMVCImpl.class) {
            viewMvc = new ActorDetailMVCImpl(mLayoutInflater, container,this);
        }
        else if(mvcViewClass == Toolbar.class){
            //
            Log.i("Test","dh");
            viewMvc = new Toolbar(mLayoutInflater, container);
        }


        else {
            throw new IllegalArgumentException("unsupported MVC view class " + mvcViewClass);
        }

        //noinspection unchecked
        return (T) viewMvc;
    }


}
