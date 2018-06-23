package day13.adler.foodapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OderTrackingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oder_tracking);
    }

    public void backToLast(View view) {
        super.onBackPressed();
    }

    public void toHomePage(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);

    }
}
