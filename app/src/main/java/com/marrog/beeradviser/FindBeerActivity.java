package com.marrog.beeradviser;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class FindBeerActivity extends AppCompatActivity {

    Spinner color;
    String[] beerTypes = new String[3];
    TextView brands;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);

        color = (Spinner)findViewById(R.id.color);
        brands = (TextView)findViewById(R.id.brands);

    }


    public void onClickFindBeer(View view) {


        String beerType = String.valueOf(color.getSelectedItem());
        List<String> list = new ArrayList<String>();

        BeerExpert beerExper = new BeerExpert();
        list = beerExper.getBrands(beerType);

        String brandsString = new String();

        for(int i = 0; i < list.size(); i++){

            if(i == 0) {
              brandsString = list.get(i);
            }
            else {

                brandsString = brandsString + ", " + String.valueOf(list.get(i));
            }

        }

        brands.setText(brandsString);

    }
}
