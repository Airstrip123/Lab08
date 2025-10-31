package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City edmonton = new City("Edmonton", "AB");

        list.addCity(edmonton);

        // This will fail because hasCity() doesn't exist yet
        assertTrue(list.hasCity(edmonton));
    }

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        City vancouver = new City("Vancouver", "BC");

        list.addCity(calgary);
        list.addCity(vancouver);

        // Should have 2 cities
        assertEquals(2, list.getCount());

        // Delete one city
        list.deleteCity(calgary);

        // Should have 1 city now
        assertEquals(1, list.getCount());
        assertFalse(list.hasCity(calgary));
        assertTrue(list.hasCity(vancouver));
    }
    @Test
    public void testCountCities() {
        CustomList list = new CustomList();

        // Empty list should have count 0
        assertEquals(0, list.countCities());

        // Add cities and verify count
        list.addCity(new City("Toronto", "ON"));
        assertEquals(1, list.countCities());

        list.addCity(new City("Montreal", "QC"));
        assertEquals(2, list.countCities());

        list.addCity(new City("Ottawa", "ON"));
        assertEquals(3, list.countCities());
    }
}
