package ru.foneom.arrayFilling;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FibonachiNumbersTest {
@Test
    public void whenFibonachiNumbersSize6() {
    int[] input = new int[6];
    int[] result = FibonachiNumbers.fillsFibonachiNumbers(input, 6);
    int[] expect = new int[]{0, 1, 1, 2, 3, 5};
    assertThat(expect, is(result));
}
}