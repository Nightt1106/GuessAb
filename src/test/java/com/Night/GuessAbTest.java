package com.Night;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GuessAbTest {

    GuessAb ab = new GuessAb(4);

    @Test
    public void randomTest(){
        Assertions.assertNotEquals("1234",ab.secret);
    }
}
