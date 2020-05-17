package ru.foneom.arrayFilling;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FillOddAndEvenTest {

    @Test
    public void whenFillOddNumber() {
        int[] input = new int[6];
        int[] result = FillOddAndEven.fillOddNumbers(input);
        int[] expect = new int[] {1, 3, 5, 7, 9, 11};
        assertThat(result, is(expect));
    }
    @Test
    public void whenFillEvenNumbers() {
        int[] input = new int[4];
        int[] result = FillOddAndEven.fillEvenNumbers(input);
        int[] expect = new int[] {0, 2, 4, 6};
        assertThat(result, is(expect));
    }

}