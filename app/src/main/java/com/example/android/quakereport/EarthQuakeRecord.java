/*************************
 * Copyright (c) 2016. This creation of Vidit Kothari (c) cannot be reproduced or modified or resell without prior written consent
 ************************/

package com.example.android.quakereport;

/**
 * Created by viditkothari on 11/25/2016.
 */

public class EarthQuakeRecord {
    private float mEQMag=0.0f;
    private String[] mEQLocationDate=new String[2];

    public EarthQuakeRecord(float val_magnitude,String val_location, String val_date){
        mEQMag=val_magnitude;
        mEQLocationDate[0]=val_location;
        mEQLocationDate[1]=val_date;
    }

    public float getEQMagnitude(){
        return mEQMag;
    }

    public String getEQLocation(){
        return mEQLocationDate[0];
    }

    public String getEQDate(){
        return mEQLocationDate[1];
    }
}
