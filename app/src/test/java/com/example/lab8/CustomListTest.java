package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CustomListTest {
    private CustomList list;
    /**
     * create a mocklist for my citylist * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>()); return list;

    }
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount(); list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    @Test
    public void testHasCity(){
        list = MockCityList();
        City city = new City("cityname", "AB");
        assertTrue(list.hasCity(city));

    }
//    @Test
//
//    public void testGetCities(){
//        list = MockCityList();
//        assertEquals(0,
//                MockCityList().compareTo(list.getCities().get(0)));
//        City city = new City("Charlottetown", "Prince Edward Island");
//        list.add(city);
//        assertEquals(0, city.compareTo(list.getCities().get(0)));
//        assertEquals(0,
//                MockCity().compareTo(list.getCities().get(1)));
//    }

    @Test
    public void testDeleteCity(){
        list = MockCityList();
        City city = new City("cityname", "AB");
        assertTrue(list.hasCity(city));


    }

    @Test
    public void testCountCities(){
        list = MockCityList();
        Boolean city;
        // if the list is empty which is expected
        assertEquals(0, list.getCities().size());
    }







}
