package com.example.wedokart.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;


import android.os.Bundle;

import com.example.wedokart.R;
import com.example.wedokart.adapters.CatagoryAdapter;
import com.example.wedokart.adapters.ProductAdapter;
import com.example.wedokart.databinding.ActivityMainBinding;
import com.example.wedokart.model.Catagory;
import com.example.wedokart.model.Product;

import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    CatagoryAdapter catagoryAdapter;
    ArrayList<Catagory> catagories;

    ProductAdapter productAdapter;
    ArrayList<Product> products;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initCatagories();
        initProducts();
        initslider();

    }

    private void initslider() {
        binding.carousel.addData(new CarouselItem("https://img.freepik.com/free-psd/black-friday-super-sale-web-banner-template_106176-1672.jpg","Watch sale"));
        binding.carousel.addData(new CarouselItem("https://www.shutterstock.com/image-vector/summer-sale-banner-vector-poster-260nw-1744966235.jpg","Summer sale"));
        binding.carousel.addData(new CarouselItem("https://img.freepik.com/free-vector/super-sale-flat-design-banner_23-2149137716.jpg?size=626&ext=jpg&ga=GA1.1.1880011253.1699488000&semt=ais","sale sale sale"));
        binding.carousel.addData(new CarouselItem("https://img.freepik.com/free-psd/black-friday-super-sale-web-banner-template_106176-1672.jpg","Watch sale"));
    }

    void initCatagories(){
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

    void initProducts(){

        products=new ArrayList<>();
        products.add(new Product("Earrings","https://www.helium10.com/app/uploads/2020/04/vit-c.jpg","", 1200.0, 15.0,10,1));
        products.add(new Product("Earrings","https://plus.unsplash.com/premium_photo-1675896084254-dcb626387e1e?q=80&w=1870&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D","", 1200.0, 15.0,10,1));
        products.add(new Product("Earrings","https://images.unsplash.com/photo-1523275335684-37898b6baf30?q=80&w=1999&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D","", 1200.0, 15.0,10,1));
        products.add(new Product("Earrings","https://plus.unsplash.com/premium_photo-1675896084254-dcb626387e1e?q=80&w=1870&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D","", 1200.0, 15.0,10,1));
        products.add(new Product("Earrings","https://images.unsplash.com/photo-1523275335684-37898b6baf30?q=80&w=1999&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D","", 1200.0, 15.0,10,1));
        products.add(new Product("Earrings","https://www.helium10.com/app/uploads/2020/04/vit-c.jpg","", 1200.0, 15.0,10,1));
        products.add(new Product("Earrings","https://images.unsplash.com/photo-1523275335684-37898b6baf30?q=80&w=1999&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D","", 1200.0, 15.0,10,1));
        products.add(new Product("Earrings","https://plus.unsplash.com/premium_photo-1675896084254-dcb626387e1e?q=80&w=1870&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D","", 1200.0, 15.0,10,1));
        productAdapter = new ProductAdapter(this,products);

        GridLayoutManager layoutManager = new GridLayoutManager(this,2);
        binding.productList.setLayoutManager(layoutManager);
        binding.productList.setAdapter(productAdapter);
    }
}