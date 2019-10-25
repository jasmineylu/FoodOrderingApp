package com.example.foodorderingapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static androidx.recyclerview.widget.RecyclerView.*;

public class MainActivity extends AppCompatActivity {

    Button burgerButton, friesButton, pizzaButton, chickenButton, hot_dogButton, sandwichButton, tacoButton, burritoButton, saladButton, sushiButton, pancakesButton, cakeButton, donutButton, ice_creamButton, sodaButton;

    String choices = "";
    Double price = 0.00;


    private static final String TAG = "MainActivity";

    private ArrayList<String> mMenu = new ArrayList<>();
    private ArrayList<String> mBurgerText = new ArrayList<>();
    private ArrayList<String> mFriesText = new ArrayList<>();
    private ArrayList<String> mPizzaText = new ArrayList<>();
    private ArrayList<String> mChickenText = new ArrayList<>();
    private ArrayList<String> mHotDogText = new ArrayList<>();
    private ArrayList<String> mSandwichText = new ArrayList<>();
    private ArrayList<String> mTacoText = new ArrayList<>();
    private ArrayList<String> mBurritoText = new ArrayList<>();
    private ArrayList<String> mSaladText = new ArrayList<>();
    private ArrayList<String> mSushiText = new ArrayList<>();
    private ArrayList<String> mPancakesText = new ArrayList<>();
    private ArrayList<String> mCakeText = new ArrayList<>();
    private ArrayList<String> mDonutText = new ArrayList<>();
    private ArrayList<String> mIceCreamText = new ArrayList<>();
    private ArrayList<String> mSodaText = new ArrayList<>();

    private RecyclerView recyclerView;
    private LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.burgerText);
        String text = "Burger" + "Fries" + "Pizza" + "Chicken" + "Hot Dog" + "Sandwich" + "Taco" + "Burrito" + "Salad" + "Sushi" + "Pancakes" + "Cake" + "Donut" + "Ice Cream" + "Soda";
        SpannableString ss = new SpannableString(text);
        ClickableSpan clickableSpan1 = new ClickableSpan() {
            @Override
            public void onClick (View widget) {
                Toast.makeText(MainActivity.this, "$5", Toast.LENGTH_SHORT).show();            }

        };

        ClickableSpan clickableSpan2 = new ClickableSpan() {
            @Override
            public void onClick (View widget) {
                Toast.makeText(MainActivity.this, "$5", Toast.LENGTH_SHORT).show();            }

        };

        ClickableSpan clickableSpan3 = new ClickableSpan() {
            @Override
            public void onClick (View widget) {
                Toast.makeText(MainActivity.this, "$5", Toast.LENGTH_SHORT).show();            }

        };

        ClickableSpan clickableSpan4 = new ClickableSpan() {
            @Override
            public void onClick (View widget) {
                Toast.makeText(MainActivity.this, "$5", Toast.LENGTH_SHORT).show();            }

        };

        ClickableSpan clickableSpan5 = new ClickableSpan() {
            @Override
            public void onClick (View widget) {
                Toast.makeText(MainActivity.this, "$5", Toast.LENGTH_SHORT).show();            }

        };

        ClickableSpan clickableSpan6 = new ClickableSpan() {
            @Override
            public void onClick (View widget) {
                Toast.makeText(MainActivity.this, "$5", Toast.LENGTH_SHORT).show();            }

        };

        ClickableSpan clickableSpan7 = new ClickableSpan() {
            @Override
            public void onClick (View widget) {
                Toast.makeText(MainActivity.this, "$5", Toast.LENGTH_SHORT).show();            }

        };

        ClickableSpan clickableSpan8 = new ClickableSpan() {
            @Override
            public void onClick (View widget) {
                Toast.makeText(MainActivity.this, "$5", Toast.LENGTH_SHORT).show();            }

        };

        ClickableSpan clickableSpan9 = new ClickableSpan() {
            @Override
            public void onClick (View widget) {
                Toast.makeText(MainActivity.this, "$5", Toast.LENGTH_SHORT).show();            }

        };

        ClickableSpan clickableSpan10 = new ClickableSpan() {
            @Override
            public void onClick (View widget) {
                Toast.makeText(MainActivity.this, "$5", Toast.LENGTH_SHORT).show();            }

        };

        ClickableSpan clickableSpan11 = new ClickableSpan() {
            @Override
            public void onClick (View widget) {
                Toast.makeText(MainActivity.this, "$5", Toast.LENGTH_SHORT).show();            }

        };

        ClickableSpan clickableSpan12 = new ClickableSpan() {
            @Override
            public void onClick (View widget) {
                Toast.makeText(MainActivity.this, "$5", Toast.LENGTH_SHORT).show();            }

        };

        ClickableSpan clickableSpan13 = new ClickableSpan() {
            @Override
            public void onClick (View widget) {
                Toast.makeText(MainActivity.this, "$5", Toast.LENGTH_SHORT).show();            }

        };

        ClickableSpan clickableSpan14 = new ClickableSpan() {
            @Override
            public void onClick (View widget) {
                Toast.makeText(MainActivity.this, "$5", Toast.LENGTH_SHORT).show();            }

        };

        ClickableSpan clickableSpan15 = new ClickableSpan() {
            @Override
            public void onClick (View widget) {
                Toast.makeText(MainActivity.this, "$5", Toast.LENGTH_SHORT).show();            }

        };

        ss.setSpan(clickableSpan1, 1, 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(clickableSpan1, 1, 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(clickableSpan1, 1, 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(clickableSpan1, 1, 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(clickableSpan1, 1, 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(clickableSpan1, 1, 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(clickableSpan1, 1, 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(clickableSpan1, 1, 7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(clickableSpan1, 1, 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(clickableSpan1, 1, 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(clickableSpan1, 1, 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(clickableSpan1, 1, 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(clickableSpan1, 1, 5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(clickableSpan1, 1, 8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(clickableSpan1, 1, 4, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        textView.setText(ss);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        burgerButton = (Button) findViewById(R.id.burgerButton);
        friesButton = (Button) findViewById(R.id.friesButton);
        pizzaButton = (Button) findViewById(R.id.pizzaButton);
        chickenButton = (Button) findViewById(R.id.chickenButton);
        hot_dogButton = (Button) findViewById(R.id.hot_dogButton);
        sandwichButton = (Button) findViewById(R.id.sandwichButton);
        tacoButton = (Button) findViewById(R.id.tacoButton);
        burritoButton = (Button) findViewById(R.id.burritoButton);
        saladButton = (Button) findViewById(R.id.saladButton);
        sushiButton = (Button) findViewById(R.id.sushiButton);
        pancakesButton = (Button) findViewById(R.id.pancakesButton);
        cakeButton = (Button) findViewById(R.id.cakeButton);
        donutButton = (Button) findViewById(R.id.donutButton);
        ice_creamButton = (Button) findViewById(R.id.ice_creamButton);
        sodaButton = (Button) findViewById(R.id.sodaButton);


        Log.d(TAG, "onCreate: started. ");

    }

    private void initRecyclerView(){
        Log.d(TAG,"initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerView.Adapter adapter = new Adapter() {
            @NonNull
            @Override
            public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                return null;
            }

            @Override
            public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

            }

            @Override
            public int getItemCount() {
                return 0;
            }
        };
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        {

        }
    }

    public void add_to_list(View view)
    {
        if (view == findViewById(R.id.burgerButton) )
        {
            choices = choices+"Burger"+"\n";
            price = price+5;
        }

        else if (view == findViewById(R.id.friesButton) )
        {
            choices = choices+"Fries"+"\n";
            price = price+5;
        }

        else if (view == findViewById(R.id.pizzaButton) )
        {
            choices = choices+"Pizza"+"\n";
            price = price+5;
        }

        else if (view == findViewById(R.id.hot_dogButton) )
        {
            choices = choices+"Hot Dog"+"\n";
            price = price+5;
        }

        else if (view == findViewById(R.id.chickenButton) )
        {
            choices = choices+"Chicken"+"\n";
            price = price+5;
        }

        else if (view == findViewById(R.id.sandwichButton) )
        {
            choices = choices+"Sandwich"+"\n";
            price = price+5;
        }

        else if (view == findViewById(R.id.tacoButton) )
        {
            choices = choices+"Taco"+"\n";
            price = price+5;
        }

        else if (view == findViewById(R.id.burritoButton) )
        {
            choices = choices+"Burrito"+"\n";
            price = price+5;
        }

        else if (view == findViewById(R.id.saladButton) )
        {
            choices = choices+"Salad"+"\n";
            price = price+5;
        }

        else if (view == findViewById(R.id.sushiButton) )
        {
            choices = choices+"Sushi"+"\n";
            price = price+5;
        }

        else if (view == findViewById(R.id.pancakesButton) )
        {
            choices = choices+"Pancakes"+"\n";
            price = price+5;
        }

        else if (view == findViewById(R.id.cakeButton) )
        {
            choices = choices+"Cake"+"\n";
            price = price+5;
        }

        else if (view == findViewById(R.id.donutButton) )
        {
            choices = choices+"Donut"+"\n";
            price = price+5;
        }

        else if (view == findViewById(R.id.ice_creamButton) )
        {
            choices = choices+"Ice Cream"+"\n";
            price = price+5;
        }

        else if (view == findViewById(R.id.sodaButton) )
        {
            choices = choices+"Soda"+"\n";
            price = price+5;
        }

    }

    public void placeOrder(View view){

        Intent i = new Intent(MainActivity.this, OrderDetails.class);
        Bundle bundle = new Bundle();
        bundle.putString("choices", choices);
        bundle.putDouble("price", price);
        i.putExtras(bundle);
        startActivity(i);

    }

}
