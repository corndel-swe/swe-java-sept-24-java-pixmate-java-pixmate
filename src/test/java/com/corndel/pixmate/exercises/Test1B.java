package com.corndel.pixmate.exercises;

import static com.corndel.pixmate.exercises.Exercise1b.sumArray;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;

public class Test1B {

  // should return the sum of all numbers in an array
  @Test
  void sum() {
    assertEquals(sumArray(new int[] {1, 2, 3, 4, 5}), 15);
    assertEquals(sumArray(new int[] {10, -2, 3}), 11);
  }

  // should return 0 for an empty array
  @Test
  void empty() {
    assertEquals(sumArray(new int[] {}), 0);
  }

  // should handle arrays with negative numbers
  @Test
  void negative() {
    assertEquals(sumArray(new int[] {-1, -2, -3, -4, -5}), -15);
  }

  // should return the number itself for single-element arrays
  @Test
  void single() {
    assertEquals(sumArray(new int[] {5}), 5);
    assertEquals(sumArray(new int[] {-10}), -10);
  }

  // should handle large arrays
  @Test
  void big() {
    var largeArray = IntStream.range(1, 101).toArray();
    var expectedSum = 5050;
    assertEquals(sumArray(largeArray), expectedSum);
  }
}
