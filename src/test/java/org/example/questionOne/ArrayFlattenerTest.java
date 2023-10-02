package org.example.questionOne;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class ArrayFlattenerTest {

    @Test
    @DisplayName("when input is legit")
    public void test_one() {
        int[][] input = {{1, 3}, {0}, {4, 5, 9}};
        int[] expectedOutput = {1, 3, 0, 4, 5, 9};
        assertArrayEquals(expectedOutput, ArrayFlattener.flattenArray(input));
    }

    @Test
    @DisplayName("when input is null")
    public void test_two() {
        int[][] input = null;
        int[] expectedOutput = {};
        assertArrayEquals(expectedOutput, ArrayFlattener.flattenArray(input));
    }

}