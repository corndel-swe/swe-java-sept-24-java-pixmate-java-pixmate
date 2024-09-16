package com.corndel.pixmate.exercises;

import static com.corndel.pixmate.exercises.Exercise2b.stepDown;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Test2B {

  // should return the index of the first element that is smaller than its predecessor
  @Test
  void test() {
    assertEquals(stepDown(new int[] {10, 12, 15, 14, 16, 20}), 3);
    assertEquals(stepDown(new int[] {3, 4, 2, 5, 6}), 2);
  }

  // should return -1 for an array where no element is smaller than its predecessor
  @Test
  void increasing() {
    assertEquals(stepDown(new int[] {5, 10, 15, 20}), -1);
    assertEquals(stepDown(new int[] {1, 2, 3, 4, 5}), -1);
  }

  // should return -1 for an empty array
  @Test
  void empty() {
    assertEquals(stepDown(new int[] {}), -1);
  }

  // should handle arrays with all identical elements
  @Test
  void constant() {
    assertEquals(stepDown(new int[] {7, 7, 7, 7}), -1);
  }

  // should handle arrays where the first two elements satisfy the condition
  @Test
  void firstTwo() {
    assertEquals(stepDown(new int[] {3, 2, 4, 5, 6}), 1);
  }

  // should return the first index, and not subsequent indicies
  @Test
  void first() {
    assertEquals(stepDown(new int[] {5, 4, 3, 2, 1}), 1);
  }
}
