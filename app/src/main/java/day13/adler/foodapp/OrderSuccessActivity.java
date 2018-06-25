package day13.adler.foodapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class OrderSuccessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_success);


        Spinner spinner = (Spinner) findViewById(R.id.Spinner01);
        ArrayAdapter<String> adapter;
        List<String> list;

        list = new ArrayList<>();
        list.add("Thịt Kho Ba Rọi");
        list.add("Cá Kho Tộ");
        adapter = new ArrayAdapter<String>(this, R.layout.spinner_item,list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

    }

    public void backToLast(View view) {super.onBackPressed();
    }

    public void toHomePage(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
