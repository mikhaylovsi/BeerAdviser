package com.marrog.beeradviser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 11.07.2016.
 */
public class BeerExpert {

    List<String> getBrands(String color){

        ArrayList<String> brands = new ArrayList<String>();

        if (color.equals("amber")){

            brands.add("Ambassadore");
            brands.add("Guiness");

        }
        else {

            brands.add("Kozel");
            brands.add("Gus");
        }

        return brands;

    }
}
