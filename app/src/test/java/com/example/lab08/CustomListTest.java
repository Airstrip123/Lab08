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

}
