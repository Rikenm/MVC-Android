package com.rikenmaharjan.actorwiki.Utils;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import com.rikenmaharjan.actorwiki.BaseStructure.BaseView;
import com.rikenmaharjan.actorwiki.R;

public class Toolbar extends BaseView {

    private TextView txtViewMain;

    public Toolbar(LayoutInflater layoutInflater, ViewGroup parent) {

        setRootView(layoutInflater.inflate(R.layout.util_toolbar,parent,false));
        txtViewMain = findViewById(R.id.txt_toolbar_title);
        txtViewMain.setText("hello");

    }

    public void setTitle(String title){

        Log.i("settitle",title);

        txtViewMain.setText(title);

    }
}
