package com.example.wedokart.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;


import android.os.Bundle;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.wedokart.adapters.CatagoryAdapter;
import com.example.wedokart.adapters.ProductAdapter;
import com.example.wedokart.databinding.ActivityMainBinding;
import com.example.wedokart.model.Catagory;
import com.example.wedokart.model.Product;
import com.example.wedokart.utils.Constants;

import org.imaginativeworld.whynotimagecarousel.model.CarouselItem;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    CatagoryAdapter catagoryAdapter;
    ArrayList<Catagory> categories;

    ProductAdapter productAdapter;
    ArrayList<Product> products;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initCategories();
        initProducts();
        initslider();


    }

    private void initslider() {
        binding.carousel.addData(new CarouselItem("https://img.freepik.com/free-psd/black-friday-super-sale-web-banner-template_106176-1672.jpg","Watch sale"));
        binding.carousel.addData(new CarouselItem("https://www.shutterstock.com/image-vector/summer-sale-banner-vector-poster-260nw-1744966235.jpg","Summer sale"));
        binding.carousel.addData(new CarouselItem("https://img.freepik.com/free-vector/super-sale-flat-design-banner_23-2149137716.jpg?size=626&ext=jpg&ga=GA1.1.1880011253.1699488000&semt=ais","sale sale sale"));
        binding.carousel.addData(new CarouselItem("https://img.freepik.com/free-psd/black-friday-super-sale-web-banner-template_106176-1672.jpg","Watch sale"));
    }

    void initCategories(){
        categories = new ArrayList<>();

        catagoryAdapter = new CatagoryAdapter(this, categories);

        getCategories();

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        binding.catagoriesList.setLayoutManager(layoutManager);
        binding.catagoriesList.setAdapter(catagoryAdapter);
    }


    void getCategories() {
        RequestQueue queue = Volley.newRequestQueue(this);

        StringRequest request = new StringRequest(Request.Method.GET, Constants.GET_CATEGORIES_URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                try {
                    //use for checking data incomming
                    Log.e("err", response);

                    JSONObject mainObj= new JSONObject(response);
                    if (mainObj.getString("status").equals("success")) {

                        JSONArray categoriesArray = mainObj.getJSONArray("categories");
                        for (int i=0;i<categoriesArray.length();i++){
                            JSONObject object = categoriesArray.getJSONObject(i);
                            Catagory catagory= new Catagory(
                                    object.getString("name"),
                                    Constants.CATEGORIES_IMAGE_URL + object.getString("icon"),
                                    object.getString("color"),
                                    object.getString("brief"),
                                    object.getInt("id")
                            );
                            categories.add(catagory);
                        }
                        catagoryAdapter.notifyDataSetChanged();
                    }  else {
                        //DO NOTHING
                    }
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        queue.add(request);
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