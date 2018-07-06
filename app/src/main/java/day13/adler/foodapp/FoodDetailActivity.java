package day13.adler.foodapp;

import android.content.Intent;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ViewFlipper;

import me.kaelaela.verticalviewpager.VerticalViewPager;
import me.kaelaela.verticalviewpager.transforms.DefaultTransformer;

public class FoodDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_detail);

//        ViewPager viewPager2 = (ViewPager) findViewById(R.id.viewpager2);
//        viewPager2.setAdapter(new CustomPagerAdapter(this));

//
//        startActivity(new Intent(this, FoodDetailViewPagerActivity.class));

//        LinearLayout myLinear = (LinearLayout) findViewById(R.id.foodDetailViewPager);
//        ViewPager viewPager = (ViewPager) myLinear.findViewById(R.id.viewpager12);
//        viewPager.setAdapter(new CustomPagerAdapter(this));

//        final ViewFlipper vf = (ViewFlipper)findViewById(R.id.vf);


//        button.setOnClickListener(new View.OnClickListener() {
//
//            @Override
//            public void onClick(View v) {
//                // TODO Auto-generated method stub
//
//
//                switch (vf.getDisplayedChild()) {
//                    case 0:
//                        vf.setDisplayedChild(1);
//                        button.setText("Go To Detail");
//
//                        break;
//                    case 1:
//                        vf.setDisplayedChild(0);
//                        button.setText("Go To Videos");
//
//
//                        break;
//                }
//
//            }
//        });

        View view = findViewById(R.id.detail1);
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager12);
        viewPager.setAdapter(new CustomPagerAdapter(this));


//        VerticalViewPager viewPager2 = (VerticalViewPager)findViewById(R.id.viewpager2);
//        viewPager2.setAdapter(new CustomPagerAdapter2(this));
//        viewPager2.setPageTransformer(false, new DefaultTransformer());
    }




    public void backToLast(View view) {
        Intent intent = new Intent(this,FoodActivity.class);
        startActivity(intent);
    }

    public void toTrackPage(View view) {

        Intent intent = new Intent(this,OderTrackingActivity.class);
        startActivity(intent);

    }

    public void toHomePage(View view) {

        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);

    }

    public void goToOrder(View view) {

        Intent intent = new Intent(this,OrderActivity.class);
        startActivity(intent);
    }

    public void SwtichPage(View view) {

    }


    public void goToVieos(View view) {
        Intent intent = new Intent(this,VideoActivity.class);
        startActivity(intent);
    }
}
