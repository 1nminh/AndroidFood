package day13.adler.foodapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class OrderActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        RadioButton rd1 = (RadioButton)findViewById(R.id.rdb1);
        RadioButton rd3 = (RadioButton)findViewById(R.id.rdb3);
        RadioButton rd4 = (RadioButton)findViewById(R.id.rdb4);
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

        Spinner spinner = (Spinner) findViewById(R.id.SpinnerOrder);
        Spinner spinner1 = (Spinner) findViewById(R.id.SpinnerOrder1);
        ArrayAdapter<String> adapter;
        List<String> list;

        list = new ArrayList<>();
        list.add("TP. Hồ Chí Minh");
        list.add("Đà Nẵng");
        list.add("Huế");
        list.add("Hà Nội");
        adapter = new ArrayAdapter<String>(this, R.layout.spinner_item,list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        list = new ArrayList<>();
        list.add("Visa");
        list.add("MasterCard");
        adapter = new ArrayAdapter<String>(this, R.layout.spinner_item,list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter);

        rd3.setChecked(true);
        spinner1.setVisibility(View.GONE);

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.rdbG);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                Spinner spinner1 = (Spinner) findViewById(R.id.SpinnerOrder1);
                RadioButton rd4 = (RadioButton)group.findViewById(checkedId);



                boolean isChecked = rd4.isChecked();
                if (isChecked){
                    spinner1.setVisibility(View.VISIBLE);
                } else {

                    spinner1.setVisibility(View.GONE);
                }


            }
        });




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
