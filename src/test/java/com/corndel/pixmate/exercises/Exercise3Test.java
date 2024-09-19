package com.corndel.pixmate.exercises;

import static com.corndel.pixmate.exercises.Exercise3.gridLimit;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Exercise3Test {

  // should count the numbers larger than 10 in a grid
  @Test
  void test() {
    var grid1 = new int[][] {
        new int[] { 3, 12, 1 },
        new int[] { 19, 10, 11 },
        new int[] { 9, 5, 105 }
    };
    assertEquals(4, gridLimit(grid1));

    var grid2 = new int[][] {
        new int[] { 15, 20, 25 },
        new int[] { 11, 12, 13 },
        new int[] { 16, 17, 18 }
    };
    assertEquals(9, gridLimit(grid2));
  }

  // should return 0 for a grid with all numbers 10 or less
  @Test
  void allLessThanTen() {
    var grid = new int[][] { new int[] { 1, 2 }, new int[] { 3, 4, 5, 6 }, new int[] { 7, 8 }, new int[] { 9 } };
    assertEquals(0, gridLimit(grid));
  }

  // should handle an empty grid
  @Test
  void empty() {
    assertEquals(0, gridLimit(new int[][] {}));
  }

  // should handle grids with empty sub-arrays
  @Test
  void handleEmptySubArrays() {
    var grid = new int[][] { new int[] {}, new int[] { 11, 20, 30 }, new int[] {} };
    assertEquals(3, gridLimit(grid));
  }

  // should handle grids with mixed negative and positive numbers
  @Test
  void testName() {
    var grid = new int[][] {
        new int[] { -1, -20, 30 },
        new int[] { 40, 50, -60 },
        new int[] { -70, 80, 90 }
    };
    assertEquals(5, gridLimit(grid));
  }
}
