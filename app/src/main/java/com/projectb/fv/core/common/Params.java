package com.projectb.fv.core.common;

import android.os.Parcel;
import android.os.Parcelable;

import org.jetbrains.annotations.NotNull;

/**
 * Created by Sibin E A on 08,September,2020 sibinea1@gmail.com
 **/
public class Params implements Parcelable {

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public Params createFromParcel(Parcel in) {
            return new Params(in);
        }

        public Params[] newArray(int size) {
            return new Params[size];
        }
    };

    private String key;
    private String value;

    // Constructor
    public Params(String key, String value) {
        this.key = key;
        this.value = value;
    }


    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    // Parcelling part
    public Params(Parcel in) {
        this.key = in.readString();
        this.value = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.key);
        dest.writeString(this.value);
    }

    @NotNull
    @Override
    public String toString() {
        return "Params{" +
                ", key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}