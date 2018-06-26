package day13.adler.foodapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class OrderActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        RadioButton rd1 = (RadioButton)findViewById(R.id.rdb1);
        rd1.setChecked(true);

//        Spinner spinner = (Spinner) findViewById(R.id.Spinner01);
//        ArrayAdapter<String> adapter;
//        List<String> list;

//        list = new ArrayList<>();
//        list.add("Cooked (20$ / each)");
//        list.add("Ingredient Only (8$ / each)");
//        adapter = new ArrayAdapter<String>(this, R.layout.spinner_item,list);
//        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        spinner.setAdapter(adapter);





    }

    public void backToLast(View view) {
        super.onBackPressed();
    }


    public void goToTrackingOrder(View view) {

        RadioButton rd1 = (RadioButton)findViewById(R.id.rdb1);
        RadioButton rd2 = (RadioButton)findViewById(R.id.rdb2);

        if (rd1.isChecked()){
            Intent intent = new Intent(this, OrderSuccessActivity.class);
            startActivity(intent);
        }
        if (rd2.isChecked()){
            Intent intent = new Intent(this, OrderSuccess2Activity.class);
            startActivity(intent);
        }

//        Spinner spinner = (Spinner) findViewById(R.id.Spinner01);
//        String text = spinner.getSelectedItem().toString();
//        if (text == "Cooked (20$ / each)"){
//            Intent intent = new Intent(this, OrderSuccessActivity.class);
//            startActivity(intent);
//        }
//        if (text == "Ingredient Only (8$ / each)"){
//            Intent intent = new Intent(this, OrderSuccess2Activity.class);
//            startActivity(intent);
//        }

    }
}
