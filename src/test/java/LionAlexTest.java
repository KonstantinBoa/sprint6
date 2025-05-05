package com.example;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class LionAlexTest {

    @Test
    public void shouldReturnPlaceOfLiving() throws Exception {
        Feline mockFeline = mock(Feline.class);
        LionAlex alex = new LionAlex(mockFeline);
        assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }

    @Test
    public void shouldReturnZeroKittens() throws Exception {
        Feline mockFeline = mock(Feline.class);
        LionAlex alex = new LionAlex(mockFeline);
        assertEquals(0, alex.getKittens());
    }

    @Test
    public void shouldReturnFriendsList() throws Exception {
        Feline mockFeline = mock(Feline.class);
        LionAlex alex = new LionAlex(mockFeline);
        assertTrue(alex.getFriends().contains("Марти"));
        assertTrue(alex.getFriends().contains("Глория"));
        assertTrue(alex.getFriends().contains("Мелман"));
    }
}
