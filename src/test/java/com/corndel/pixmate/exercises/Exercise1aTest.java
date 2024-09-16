package com.corndel.pixmate.exercises;

import static com.corndel.pixmate.exercises.Exercise1a.addEven;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Exercise1aTest {

  // should return 20 for n=8
  @Test
  void eight() {
    assertEquals(addEven(8), 20);
  }

  // should return 0 for n=1
  @Test
  void one() {
    assertEquals(addEven(1), 0);
  }

  // should handle a large number
  @Test
  void big() {
    assertEquals(addEven(100), 2550);
  }

  // should return 2 for n=2
  @Test
  void two() {
    assertEquals(addEven(2), 2);
  }

  // should handle odd numbers
  @Test
  void odd() {
    assertEquals(addEven(7), 12); // 2 + 4 + 6 = 12
  }

  // should handle even numbers
  @Test
  void even() {
    assertEquals(addEven(10), 30); // 2 + 4 + 6 + 8 + 10 = 30
  }
}
