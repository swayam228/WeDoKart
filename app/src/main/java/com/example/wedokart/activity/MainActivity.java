package com.example.wedokart.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;


import android.os.Bundle;

import com.example.wedokart.R;
import com.example.wedokart.adapters.CatagoryAdapter;
import com.example.wedokart.databinding.ActivityMainBinding;
import com.example.wedokart.model.Catagory;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    CatagoryAdapter catagoryAdapter;
    ArrayList<Catagory> catagories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        catagories = new ArrayList<>();
        catagories.add(new Catagory("Earrings","https://img.freepik.com/free-psd/luxury-diamond-earrings-png-isolated-transparent-background_191095-9809.jpg","#000000","some breif",1));
        catagories.add(new Catagory("Rings","https://freepngimg.com/save/28260-jewellery-ring/2289x1940","#FF0000","some breif",1));
        catagories.add(new Catagory("Necklaces","https://i.pinimg.com/originals/5a/72/8f/5a728f33e572b9c209732dbf8f24f22b.png","#FFF000","some breif",1));
        catagories.add(new Catagory("Bangles","https://admin.pngadgil1832.com/UploadedFiles/ProductImages/KGNSET27_2GPNG_01.png","#46FF00","some breif",1));
        catagories.add(new Catagory("Embrodory hoop","https://images.rawpixel.com/image_png_800/cHJpdmF0ZS9sci9pbWFnZXMvd2Vic2l0ZS8yMDIzLTExL3Jhd3BpeGVsb2ZmaWNlOV9waG90b19vZl9taW5pbWFsX2NocmlzdG1hc19lbWJyb2lkZXJ5X2hvb3BfX3RvcF80OTIyZjdkNS0yODk2LTQ0ZDMtYWIzNS1jMWQ5NWIzNGNhMzRfMS5wbmc.png","#00FFE4","some breif",1));
        catagories.add(new Catagory("Teddy","https://images.rawpixel.com/image_png_800/cHJpdmF0ZS9sci9pbWFnZXMvd2Vic2l0ZS8yMDIzLTA4L3Jhd3BpeGVsX29mZmljZV8xOV93YXRlcmNvbG9yX2lsbHVzdHJhdGlvbl9vZl9hX3RlZGR5X2JlYXJfZmx1Zl84MmU2OGMwMS1jNjFhLTQ0MTktOWMxNS0zZDYzZTI0YWViM2JfMS5wbmc.png","#0042FF","some breif",1));
        catagories.add(new Catagory("Cats","https://png.pngtree.com/png-clipart/20230511/ourmid/pngtree-isolated-cat-on-white-background-png-image_7094927.png","#CD00FF","some breif",1));
        catagories.add(new Catagory("Dogs","https://png.pngtree.com/png-clipart/20230514/original/pngtree-smile-dog-on-white-background-png-image_9160783.png","#FF006C","some breif",1));
        catagoryAdapter = new CatagoryAdapter(this,catagories);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        binding.catagoriesList.setLayoutManager(layoutManager);
        binding.catagoriesList.setAdapter(catagoryAdapter);

    }
}