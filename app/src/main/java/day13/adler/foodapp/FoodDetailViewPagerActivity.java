package day13.adler.foodapp;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FoodDetailViewPagerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_detail_view_pager);


        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager12);
        viewPager.setAdapter(new CustomPagerAdapter(this));


    }

    public void goToOrder(View view) {
        Intent intent = new Intent(this,OrderActivity.class);
        startActivity(intent);
    }
}
