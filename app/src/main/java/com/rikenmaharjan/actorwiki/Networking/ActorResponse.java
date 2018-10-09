package com.rikenmaharjan.actorwiki.Networking;

import com.google.gson.annotations.SerializedName;

public class ActorResponse {


    @SerializedName("first_name")
    private final String mFirstName;

    @SerializedName("last_name")
    private final String mLastName;


    @SerializedName("age")
    private final int mAge;


    @SerializedName("image")
    private final String mImageUrl;




    @SerializedName("country")
    private final String mCountry;

    public String getFirstName() {
        return mFirstName;
    }


    public String getLastName() {
        return mLastName;
    }

    public int getAge() {
        return mAge;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public String getCountry() {
        return mCountry;
    }

    private ActorResponse(String firstName, String lastName, int age, String imageUrl, String country ){


        mFirstName = firstName;
        mLastName = lastName;
        mAge = age;
        mImageUrl = imageUrl;
        mCountry = country;


    }







}
