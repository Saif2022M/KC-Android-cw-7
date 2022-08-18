package com.example.x_cite;

import android.content.Context;
import android.icu.text.CaseMap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;
import java.util.jar.Attributes;

public class PHonAdabter extends ArrayAdapter {
    List<Phons>B;

    public PHonAdabter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        B=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.item,parent,false);

        Phons currentPhone = B.get(position);

        TextView PhoneName = view.findViewById(R.id.Titel);
        TextView PhonePrand = view.findViewById(R.id.Apple);
        ImageView PhoneImgee = view.findViewById(R.id.imageView);

        PhoneName.setText(currentPhone.getPhonName());
        PhonePrand.setText(currentPhone.getPhoneBrand());
        PhoneImgee.setImageResource(currentPhone.getPhoneIMge());

        return view;
    }

}
