package com.rikenmaharjan.actorwiki;

public class ActorDetail {



    private final String mFirstName;
    private final String mLastName;
    private final String mCountry;
    private final String mImageUrl;

    public String getmImageUrl() {
        return mImageUrl;
    }

    public String getmAge() {
        return mAge;
    }

    private final String mAge;

    public String getFirstName() {
        return mFirstName;
    }


    public String getLastName() {
        return mLastName;
    }




    public String getCountry() {
        return mCountry;
    }

    public ActorDetail(String firstName, String lastName, String country, String imgUrl, String age ){


        mFirstName = firstName;
        mLastName = lastName;
        mCountry = country;
        mAge = age;
        mImageUrl = imgUrl;


    }
}
