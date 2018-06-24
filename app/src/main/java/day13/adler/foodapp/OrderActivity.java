package day13.adler.foodapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        Spinner spinner = (Spinner) findViewById(R.id.Spinner01);
        ArrayAdapter<String> adapter;
        List<String> list;

        list = new ArrayList<>();
        list.add("Đã chế biến (20$ / món)");
        list.add("Chỉ Nguyên liệu (8$ / món)");
        adapter = new ArrayAdapter<String>(this, R.layout.spinner_item,list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);





    }

    public void backToLast(View view) {
        super.onBackPressed();
    }


    public void goToTrackingOrder(View view) {


        Spinner spinner = (Spinner) findViewById(R.id.Spinner01);
        String text = spinner.getSelectedItem().toString();
        if (text == "Đã chế biến (20$ / món)"){
            Intent intent = new Intent(this, OrderSuccessActivity.class);
            startActivity(intent);
        }
        if (text == "Chỉ Nguyên liệu (8$ / món)"){
            Intent intent = new Intent(this, OrderSuccess2Activity.class);
            startActivity(intent);
        }

    }
}
