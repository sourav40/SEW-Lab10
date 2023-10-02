package org.example.questionTwo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


@ExtendWith(MockitoExtension.class)
class ArrayReversorTest {

    @Test
    @DisplayName("when input is legit")
    public void test_one() {
        int[][] input = {{1, 3}, {0}, {4, 5, 9}};
        int[] expectedOutput = {9, 5, 4, 0, 3, 1};
        assertArrayEquals(expectedOutput, ArrayReversor.reverseArray(input));
    }

    @Test
    @DisplayName("when input is null")
    public void test_two() {
        int[][] input = {};
        int[] expectedOutput = {};
        assertArrayEquals(expectedOutput, ArrayReversor.reverseArray(input));
    }

}