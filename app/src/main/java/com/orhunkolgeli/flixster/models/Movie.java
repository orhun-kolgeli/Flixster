package com.orhunkolgeli.flixster.models;

import org.json.JSONObject;

public class Movie {
    String posterPath;
    String title;
    String overview;

    // Constructor
    public Movie(JSONObject jsonObject) {
        posterPath = jsonObject.getString("poster_path");
    }
}
