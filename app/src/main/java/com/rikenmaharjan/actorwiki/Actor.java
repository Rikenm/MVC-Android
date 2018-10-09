package com.rikenmaharjan.actorwiki;

public class Actor {
    //model for the mvc


    private final String mFirstName;
    private final String mLastName;
    private final String mCountry;

    public String getFirstName() {
        return mFirstName;
    }


    public String getLastName() {
        return mLastName;
    }




    public String getCountry() {
        return mCountry;
    }

    public Actor(String firstName, String lastName, String country ){


        mFirstName = firstName;
        mLastName = lastName;
        mCountry = country;


    }

}
