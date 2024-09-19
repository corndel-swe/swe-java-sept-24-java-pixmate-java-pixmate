package com.corndel.pixmate.exercises;

import static com.corndel.pixmate.exercises.Exercise2b.stepDown;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Exercise2bTest {

  // should return the index of the first element that is smaller than its
  // predecessor
  @Test
  void test() {
    assertEquals(3, stepDown(new int[] { 10, 12, 15, 14, 16, 20 }));
    assertEquals(2, stepDown(new int[] { 3, 4, 2, 5, 6 }));
  }

  // should return -1 for an array where no element is smaller than its
  // predecessor
  @Test
  void increasing() {
    assertEquals(-1, stepDown(new int[] { 5, 10, 15, 20 }));
    assertEquals(-1, stepDown(new int[] { 1, 2, 3, 4, 5 }));
  }

  // should return -1 for an empty array
  @Test
  void empty() {
    assertEquals(-1, stepDown(new int[] {}));
  }

  // should handle arrays with all identical elements
  @Test
  void constant() {
    assertEquals(-1, stepDown(new int[] { 7, 7, 7, 7 }));
  }

  // should handle arrays where the first two elements satisfy the condition
  @Test
  void firstTwo() {
    assertEquals(1, stepDown(new int[] { 3, 2, 4, 5, 6 }));
  }

  // should return the first index, and not subsequent indicies
  @Test
  void first() {
    assertEquals(1, stepDown(new int[] { 5, 4, 3, 2, 1 }));
  }
}
