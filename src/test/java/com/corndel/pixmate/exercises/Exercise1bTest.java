package com.corndel.pixmate.exercises;

import static com.corndel.pixmate.exercises.Exercise1b.sumArray;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;

public class Exercise1bTest {

  // should return the sum of all numbers in an array
  @Test
  void sum() {
    assertEquals(15, sumArray(new int[] { 1, 2, 3, 4, 5 }));
    assertEquals(11, sumArray(new int[] { 10, -2, 3 }));
  }

  // should return 0 for an empty array
  @Test
  void empty() {
    assertEquals(0, sumArray(new int[] {}));
  }

  // should handle arrays with negative numbers
  @Test
  void negative() {
    assertEquals(-15, sumArray(new int[] { -1, -2, -3, -4, -5 }));
  }

  // should return the number itself for single-element arrays
  @Test
  void single() {
    assertEquals(5, sumArray(new int[] { 5 }));
    assertEquals(-10, sumArray(new int[] { -10 }));
  }

  // should handle large arrays
  @Test
  void big() {
    var largeArray = IntStream.range(1, 101).toArray();
    var expectedSum = 5050;
    assertEquals(expectedSum, sumArray(largeArray));
  }
}
