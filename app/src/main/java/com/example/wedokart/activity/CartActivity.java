package com.example.wedokart.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.wedokart.R;
import com.example.wedokart.adapters.CartAdapter;
import com.example.wedokart.databinding.ActivityCartBinding;
import com.example.wedokart.model.Product;
import com.hishd.tinycart.model.Cart;
import com.hishd.tinycart.util.TinyCartHelper;

import java.util.ArrayList;

public class CartActivity extends AppCompatActivity {

    ActivityCartBinding binding;
    CartAdapter adapter;
    ArrayList<Product> products;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityCartBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        products = new ArrayList<>();

        Cart cart = TinyCartHelper.getCart();

        products.add(new Product("Product1", "https://thebrandhopper.com/wp-content/uploads/2021/10/Product-Innovation.jpg", "321", 50.0, 50.0, 12, 1));
        products.add(new Product("Product1", "https://thebrandhopper.com/wp-content/uploads/2021/10/Product-Innovation.jpg", "321", 50.0, 50.0, 12, 1));
        products.add(new Product("Product1", "https://thebrandhopper.com/wp-content/uploads/2021/10/Product-Innovation.jpg", "321", 50.0, 5.0, 12, 1));


        adapter = new CartAdapter(this, products);

        LinearLayoutManager layoutManager= new LinearLayoutManager(this);
        DividerItemDecoration itemDecoration = new DividerItemDecoration(this, layoutManager.getOrientation());
        binding.cartList.setLayoutManager(layoutManager);
        binding.cartList.addItemDecoration(itemDecoration);
        binding.cartList.setAdapter(adapter);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}