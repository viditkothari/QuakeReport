/*************************
 * Copyright (c) 2016. This creation of Vidit Kothari (c) cannot be reproduced or modified or resell without prior written consent
 ************************/

package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by viditkothari on 11/25/2016.
 */

public class EQRecordAdapter extends ArrayAdapter<EarthQuakeRecord> {

    public EQRecordAdapter(Context context, List objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // return super.getView(position, convertView, parent);
        if (convertView==null)
            convertView=LayoutInflater.from(getContext()).inflate(R.layout.quake_record_layout,parent,false);

        EarthQuakeRecord eqrs=getItem(position);
        ((TextView)convertView.findViewById(R.id.quake_attrib_mag)).setText(String.valueOf(eqrs.getEQMagnitude()));
        ((TextView)convertView.findViewById(R.id.quake_attrib_location)).setText(eqrs.getEQLocation());
        ((TextView)convertView.findViewById(R.id.quake_attrib_date)).setText(eqrs.getEQDate());
        return convertView;
    }
}
