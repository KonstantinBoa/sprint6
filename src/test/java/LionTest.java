package com.example;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

public class LionTest {

    @Test
    public void doesHaveManeShouldReturnTrueForMale() throws Exception {
        Feline mockFeline = mock(Feline.class);
        Lion lion = new Lion("Самец", mockFeline);
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void doesHaveManeShouldReturnFalseForFemale() throws Exception {
        Feline mockFeline = mock(Feline.class);
        Lion lion = new Lion("Самка", mockFeline);
        assertFalse(lion.doesHaveMane());
    }

    @Test(expected = Exception.class)
    public void constructorShouldThrowExceptionForInvalidSex() throws Exception {
        Feline mockFeline = mock(Feline.class);
        new Lion("Боевой вертолет", mockFeline);
    }

    @Test
    public void getKittensShouldReturnCorrectNumber() throws Exception {
        Feline mockFeline = mock(Feline.class);
        when(mockFeline.getKittens()).thenReturn(2);
        Lion lion = new Lion("Самец", mockFeline);
        assertEquals(2, lion.getKittens());
    }

    @Test
    public void getFoodShouldReturnMeatList() throws Exception {
        Feline mockFeline = mock(Feline.class);
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        when(mockFeline.getFood("Хищник")).thenReturn(expected);
        Lion lion = new Lion("Самец", mockFeline);
        assertEquals(expected, lion.getFood());
    }
}
