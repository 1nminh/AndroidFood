package day13.adler.foodapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FoodHotestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_hotest);
    }



    public void backToLast(View view) {
        super.onBackPressed();
    }

    public void goToDetail(View view) {
        Intent intent = new Intent(this,FoodDetailActivity.class);
        startActivity(intent);
    }


    public void goToNewest(View view) {
        Intent intent = new Intent(this,FoodActivity.class);
        startActivity(intent);
    }
}
