package com.minduniversity.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Karla on 10/18/2015.
 */
public class Beer implements Parcelable {
    private String Name;
    private String Type;
    private String Brand;
    private String Image;
    private String Description;

    public Beer() {

    }

    public Beer(Parcel in) {
        readFromParcel(in);
    }

    private void readFromParcel(Parcel in) {
    }

    public static final Parcelable.Creator CREATOR =
            new Parcelable.Creator() {
                public Beer createFromParcel(Parcel in) {
                    return new Beer(in);
                }

                public Beer[] newArray(int size) {
                    return new Beer[size];
                }
            };
    public static Creator<Beer> CREATOR =  new Creator<Beer>{

    public Beer createFromParcel(Parcel source)
    {
        return new Beer(source);
    }
}

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }

    public void setName(String name) {
        Name = name;
    }

    public void setType(String type) {
        Type = type;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public void setImage(String image) {
        Image = image;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getName() {
        return Name;
    }

    public String getType() {
        return Type;
    }

    public String getBrand() {
        return Brand;
    }

    public String getImage() {
        return Image;
    }

    public String getDescription() {
        return Description;
    }
}
