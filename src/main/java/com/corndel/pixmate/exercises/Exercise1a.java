package com.corndel.pixmate.exercises;

public class Exercise1a {
  // https://tech-docs.corndel.com/java/while-loops.html
  // https://tech-docs.corndel.com/java/for-loops.html

  /**
   * Adds together all the positive even numbers smaller than or equal to n
   *
   * @example // returns 20 (= 2 + 4 + 6 + 8) addEven(8)
   * @param {int} n - The upper limit
   * @returns {int} The sum of the even numbers smaller than or equal to n
   */
  public static int addEven(int n) {
    // TODO
    // return 0;

    // TODO REMOVE
    int sum = 0; // initialize sum to 0
    for (int i = 2; i <= n; i += 2) { // loop from 2 to n, incrementing by 2 each time
      sum += i; // add the current even number to the sum
    }
    return sum;
  }
}
