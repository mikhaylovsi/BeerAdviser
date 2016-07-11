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
        beerTypes = getResources().getStringArray(R.array.beer_types);

        spinner = (Spinner)findViewById(R.id.color);
        brands = (TextView)findViewById(R.id.brands);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, beerTypes);
        spinner.setAdapter(adapter);



    }

    public void onClick(View view) {

      //  brands.setText(BeerTypes.getBeer());

    }
}
