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
        ViewPager viewPager = (ViewPager)view.findViewById(R.id.viewpager12);
        viewPager.setAdapter(new CustomPagerAdapter(this));

        View view2 = findViewById(R.id.detail2);
        ViewPager viewPager2 = (ViewPager)view2.findViewById(R.id.viewpager12);
        viewPager2.setAdapter(new CustomPagerAdapter2(this));

        View view3 = findViewById(R.id.detail3);
        ViewPager viewPager3 = (ViewPager)view3.findViewById(R.id.viewpager12);
        viewPager3.setAdapter(new CustomPagerAdapter3(this));

        View view4 = findViewById(R.id.detail4);
        ViewPager viewPager4 = (ViewPager)view4.findViewById(R.id.viewpager12);
        viewPager4.setAdapter(new CustomPagerAdapter4(this));

        View view5 = findViewById(R.id.detail5);
        ViewPager viewPager5 = (ViewPager)view5.findViewById(R.id.viewpager12);
        viewPager5.setAdapter(new CustomPagerAdapter5(this));

        View view6 = findViewById(R.id.detail6);
        ViewPager viewPager6 = (ViewPager)view6.findViewById(R.id.viewpager12);
        viewPager6.setAdapter(new CustomPagerAdapter6(this));









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

    public void goToMap(View view) {
        Intent intent = new Intent(this,MapsActivity.class);
        startActivity(intent);
    }


    public void goToVieos(View view) {
        Intent intent = new Intent(this,VideoActivity.class);
        startActivity(intent);
    }

    public void goToMap2(View view) {
        Intent intent = new Intent(this,Map2Activity.class);
        startActivity(intent);
    }

    public void goToIngredient(View view) {
        Intent intent = new Intent(this,IngredientActivity.class);
        startActivity(intent);
    }
}
