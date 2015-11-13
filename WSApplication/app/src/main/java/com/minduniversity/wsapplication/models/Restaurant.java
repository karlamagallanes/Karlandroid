package com.minduniversity.wsapplication.models;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Karla on 11/12/2015.
 */
public class Restaurant {
    private String id;
    private String name;
    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Restaurant(JSONObject json) throws JSONException{
        id=json.getString("id");
        name=json.getString("name");
        description=json.getString("description");

    }


}
