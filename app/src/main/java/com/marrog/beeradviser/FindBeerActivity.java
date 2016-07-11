package com.marrog.beeradviser;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class FindBeerActivity extends AppCompatActivity {

    Spinner spinner;
    String[] beerTypes = new String[3];
    TextView brands;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);

        spinner = (Spinner)findViewById(R.id.color);
        brands = (TextView)findViewById(R.id.brands);

    }


    public void onClickFindBeer(View view) {


    }
}
