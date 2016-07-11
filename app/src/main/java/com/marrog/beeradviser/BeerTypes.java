package com.marrog.beeradviser;

/**
 * Created by Сергей on 10.07.2016.
 */
public class BeerTypes {

   public static String getBeer(String beerType){

       if (beerType.equals("Dark"))
       return "type1, type2";
       else return "type3, type4";

   }

}
