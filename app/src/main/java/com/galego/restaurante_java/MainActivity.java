package com.galego.restaurante_java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.galego.restaurante_java.adapter.FoodAdapter;
import com.galego.restaurante_java.databinding.ActivityMainBinding;
import com.galego.restaurante_java.model.Food;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private FoodAdapter foodAdapter;
    private ArrayList<Food> foodList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        RecyclerView recyclerViewFood = binding.RecyclerViewFood;
        recyclerViewFood.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewFood.setHasFixedSize(true);
        foodAdapter = new FoodAdapter(foodList,this);
        recyclerViewFood.setAdapter(foodAdapter);
        getFood();

    }

    private void getFood(){
           Food food1 = new Food(
                R.drawable.food1,
                  "Food 1",
                   "Arroz, feijão, Filé de Frango, batatas fritas e salada.",
                   "$ 25.00"
           );
           foodList.add(food1);
        Food food2 = new Food(
                R.drawable.food2,
                "Food 2",
                "Macarrão, Bife a Milanesa, Maionese e Salada.",
                "$ 18.00"
        );
        foodList.add(food2);
        Food food3 = new Food(
                R.drawable.food3,
                "Food 3",
                "Sopa de Abóbora, com Camarão e Almondegas.",
                "$ 15.00"
        );
        foodList.add(food3);
        Food food4 = new Food(
                R.drawable.food4,
                "Food 4",
                "Porção de peixe frito, mais batatas fritas.",
                "$ 28.00"
        );
        foodList.add(food4);
        Food food5 = new Food(
                R.drawable.food5,
                "Food 5",
                "Lanche: X-Salada gourmet.",
                "$ 17.00"
        );
        foodList.add(food5);

    }
}