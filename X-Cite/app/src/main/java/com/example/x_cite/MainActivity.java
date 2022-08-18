package com.example.x_cite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Phons>PhonesList=new ArrayList<>();
    private Object PHonAdabter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Phons Iphone14 = new Phons("Iphone14","Apple",R.drawable.iphonee);
        Phons ipad = new Phons("Ipad 11 Pro","Apple",R.drawable.ipad);
        Phons MetBooks = new Phons("MetBook D15","Huawei",R.drawable.metbook);
        Phons Nokia = new Phons("Nokia N73","Nokia",R.drawable.nokia);
        Phons Nova = new Phons("Nova 7 S","Huawei",R.drawable.nova);
        Phons S22 = new Phons("S22 Ultra ", "Samsung",R.drawable.s22);
        Phons watch = new Phons("Watch 7","Apple",R.drawable.watch);


        PhonesList.add(Iphone14);
        PhonesList.add(ipad);
        PhonesList.add(MetBooks);
        PhonesList.add(Nokia);
        PhonesList.add(Nova);
        PhonesList.add(S22);
        PhonesList.add(watch);


        ListView listView = findViewById(R.id.list);

        PHonAdabter Adabtar = new PHonAdabter(this,0,PhonesList);

        listView.setAdapter(Adabtar);

    }
}