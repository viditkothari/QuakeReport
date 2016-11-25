/*************************
 * Copyright (c) 2016. This creation of Vidit Kothari (c) cannot be reproduced or modified or resell without prior written consent
 ************************/

package com.example.android.quakereport;

/**
 * Created by viditkothari on 11/25/2016.
 */

public class EarthQuakeRecord {
    private float mEQMag=0.0f;
    private StringBuilder[] mEQLocationDate=new StringBuilder[2];

    public EarthQuakeRecord(float val_magnitude,StringBuilder val_location, StringBuilder val_date){
        mEQMag=val_magnitude;
        mEQLocationDate[0]=val_location;
        mEQLocationDate[1]=val_date;
    }

    public float getEQMagnitude(){
        return mEQMag;
    }

    public StringBuilder getEQLocation(){
        return mEQLocationDate[0];
    }

    public StringBuilder getEQDate(){
        return mEQLocationDate[1];
    }
}
