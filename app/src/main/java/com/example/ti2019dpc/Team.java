package com.example.ti2019dpc;

import android.os.Parcel;
import android.os.Parcelable;

public class Team implements Parcelable{
    private String name;
    private String description;
    private String logo;

    public Team() {

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

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int i) {
        dest.writeString(this.name);
        dest.writeString(this.description);
        dest.writeString(this.logo);
    }
    protected Team(Parcel in) {
        this.name = in.readString();
        this.description = in.readString();
        this.logo = in.readString();
    }
    public static final Creator<Team> CREATOR = new Creator<Team>() {
        @Override
        public Team createFromParcel(Parcel source) {
            return new Team(source);
        }

        @Override
        public Team[] newArray(int size) {
            return new Team[size];
        }
    };
}


