package day13.adler.foodapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FoodDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_detail);
    }

    public void backToLast(View view) {
        Intent intent = new Intent(this,FoodActivity.class);
        startActivity(intent);
    }

    public void toTrackPage(View view) {

        Intent intent = new Intent(this,OderTrackingActivity.class);
        startActivity(intent);

    }
}
