package ru.foneom.arrayFilling;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FillArithmeticProgressionTest {

    @Test
    public void whenFillArithmeticProgression() {
        int[] input = new int[4];
        int[] result = FillArithmeticProgression.fillArithmeticProgression(input, 2);
        int[] expect = new int[] {1, 3, 5, 7};
        assertThat(result, is(expect));
    }

}