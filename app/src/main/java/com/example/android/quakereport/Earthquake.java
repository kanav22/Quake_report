/**
 * Created by kanav on 22/08/17.
 */

package com.example.android.quakereport;
public class Earthquake {

    private Double mMagnitude ;

    private String MLocation ;

    private long mTimeInMilliseconds;
    private String mUrl;


    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        MLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    public Double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return MLocation;
    }
    public String getUrl() {
        return mUrl;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}

