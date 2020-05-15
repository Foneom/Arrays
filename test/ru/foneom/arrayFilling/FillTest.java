package ru.foneom.arrayFilling;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FillTest {

    @Test
    public void whenOneFirstAndLastElement() {
        int[] input = new int[6];
        int[] result = Fill.oneFirstAndLastElement(input);
        int[] expect = new int[] {1, 0, 0, 0, 0, 1};
        assertThat(result, is(expect));
    }
    @Test
    public void whenOneAfterZero() {
        int[] input = new int[6];
        int[] result = Fill.oneAfterZero(input);
        int[] expect = new int[] {0, 1, 0, 1, 0, 1};
        assertThat(result, is(expect));
    }
    @Test
    public void whenFillOddNumber() {
        int[] input = new int[6];
        int[] result = Fill.fillOddNumbers(input);
        int[] expect = new int[] {1, 3, 5, 7, 9, 11};
        assertThat(result, is(expect));
    }

    @Test
    public void whenFillArithmeticProgression() {
        int[] input = new int[4];
        int[] result = Fill.fillArithmeticProgression(input, 2);
        int[] expect = new int[] {1, 3, 5, 7};
        assertThat(result, is(expect));
    }
}