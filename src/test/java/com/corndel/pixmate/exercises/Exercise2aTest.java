package com.corndel.pixmate.exercises;

import static com.corndel.pixmate.exercises.Exercise2a.sumSelective;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;

public class Exercise2aTest {

  // should sum numbers that are either even or greater than 10, but not both
  @Test
  void typical() {
    assertEquals(37, sumSelective(new int[] { 1, 4, 12, 15, 20, 5, 8, 10 }));
  }

  // should return 0 for an empty array
  @Test
  void empty() {
    assertEquals(0, sumSelective(new int[] {}));
  }

  // should correctly handle arrays with only even numbers
  @Test
  void even() {
    assertEquals(30, sumSelective(new int[] { 2, 4, 6, 8, 10 }));
  }

  // should correctly handle arrays with numbers only greater than 10
  @Test
  void allGreaterThanTen() {
    assertEquals(39, sumSelective(new int[] { 11, 13, 15 }));
  }

  // should skip numbers that are both even and greater than 10
  @Test
  void skipBothEvenAndGreaterThanTen() {
    assertEquals(0, sumSelective(new int[] { 12, 14, 16, 3, 5 }));
  }

  // should handle large arrays
  @Test
  void handlesLargeArrays() {
    var largeArray = IntStream.range(1, 50).toArray();
    assertEquals(630, sumSelective(largeArray));
  }
}
