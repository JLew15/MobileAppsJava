package com.example.beeradvisor;
import java.util.ArrayList;
import java.util.List;

public class DrinkExpert {
    List<String>getBrands(String color){
        List<String>brands = new ArrayList<>();
        if(color.equals("Clear")){
            brands.add("Sprite");
            brands.add("7Up");
            brands.add("Canada Dry");
            brands.add("Water");
            brands.add("Club Soda");
        }
        else if(color.equals("Dark Cola")){
            brands.add("Coca Cola");
            brands.add("Pepsi");
            brands.add("Root Beer");
            brands.add("Dr. Pepper");
            brands.add("Generic Cola");
        }
        else if(color.equals("Punch")){
            brands.add("Cherry");
            brands.add("Grape");
            brands.add("Strawberry");
            brands.add("Orange");
            brands.add("Raspberry");
            brands.add("Blueberry Grape");
        }
        else if(color.equals("Diet")){
            brands.add("Diet Pepsi");
            brands.add("Diet Coke");
            brands.add("Diet Dr. Pepper");
            brands.add("Diet Sprite");
        }
        else if(color.equals("Zero Sugar")){
            brands.add("Pepsi Zero Sugar");
            brands.add("Coke Zero");
            brands.add("Dr. Pepper Zero Sugar");
        }
        else if(color.equals("Energy")){
            brands.add("Mountain Dew");
            brands.add("Monster");
            brands.add("Rockstar");
            brands.add("Bang");
        }
        else if(color.equals("Tea")){
            brands.add("Green Tea");
            brands.add("Lemon Tea");
            brands.add("Black Tea");
            brands.add("Chai Tea");
        }
        else if(color.equals("Coffee")){
            brands.add("Black Coffee");
            brands.add("Vanilla Coffee");
            brands.add("French Vanilla Coffee");
            brands.add("Caramel Coffee");
            brands.add("Hazelnut Coffee");
            brands.add("Creme Brulee Coffee");
            brands.add("Irish Creme Coffee");
            brands.add("Breakfast Blend Coffee");
        }
        else{
            brands.add("How did you get here...?");
        }

        return brands;
    }
}
