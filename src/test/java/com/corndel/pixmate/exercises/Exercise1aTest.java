package com.corndel.pixmate.exercises;

import static com.corndel.pixmate.exercises.Exercise1a.addEven;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Exercise1aTest {

  // should return 20 for n=8
  @Test
  void eight() {
    assertEquals(20, addEven(8));
  }

  // should return 0 for n=1
  @Test
  void one() {
    assertEquals(0, addEven(1));
  }

  // should handle a large number
  @Test
  void big() {
    assertEquals(2550, addEven(100));
  }

  // should return 2 for n=2
  @Test
  void two() {
    assertEquals(2, addEven(2));
  }

  // should handle odd numbers
  @Test
  void odd() {
    assertEquals(12, addEven(7)); // 2 + 4 + 6 = 12
  }

  // should handle even numbers
  @Test
  void even() {
    assertEquals(30, addEven(10)); // 2 + 4 + 6 + 8 + 10 = 30
  }
}
