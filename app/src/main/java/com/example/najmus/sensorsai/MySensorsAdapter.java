package com.example.najmus.sensorsai;
/*====================================
    Author : NAJMUS SEEMAB
======================================*/

import android.content.Context;
import android.hardware.Sensor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by NAJMUS on 3/26/2018.
 */

public class MySensorsAdapter extends ArrayAdapter<Sensor> {

    private  int textViewResourceId;
    private static  class ViewHolder{
        private TextView itemView;
    }


    public MySensorsAdapter(Context context, int textViewResourceId, List<Sensor> items) {
        super ( context, textViewResourceId,items);
        this.textViewResourceId = textViewResourceId;
    }
    public View getView(int position, View convertView, ViewGroup parent){
        ViewHolder viewHolder=null;

        if (convertView == null){
            convertView = LayoutInflater.from(this.getContext ()).inflate(textViewResourceId, (ViewGroup) parent,false);
            viewHolder = new ViewHolder ();
            viewHolder.itemView = (TextView) convertView.findViewById ( R.id.content );
            convertView.setTag ( viewHolder );
        }else {
            viewHolder =(ViewHolder) convertView.getTag ();
        }
        Sensor item =getItem ( position );

        if (item != null){
            viewHolder.itemView.setText ( "Name: "  + item.getName () + " /Int Type :" + item.getType ()
                    +" /String Type :" + Utils.sesorTypeToString(item.getType()) + " /Vendor :" + item.getVendor ()
                    + " /Version:" + item.getVersion () + " /Resolution :"+ item.getResolution ()
                    + " /Power : " + item.getPower() +  "  mAh /Maximum Range :" +item.getMaximumRange ());
        }

        return  convertView;
    }
}
