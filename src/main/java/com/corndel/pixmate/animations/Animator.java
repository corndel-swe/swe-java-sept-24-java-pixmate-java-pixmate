package com.corndel.pixmate.animations;

import java.util.List;

public class Animator {

  // Helper method to sleep for a certain number of seconds
  public static void wait(Double seconds) {
    int interval = (int) Math.floor(seconds * 1000);
    try {
      Thread.sleep(interval); // sleep for n seconds
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      System.out.println("Animation interrupted!");
    }
  }

  // Method to animate a sequence of frames
  public static void animate(List<String> frames, Double seconds) {
    clearConsole();

    for (String frame : frames) {
      System.out.println(frame); // Print each frame in green
      wait(seconds); // Pause between frames
      clearConsole(); // Clear console after each frame
    }
  }

  // Method to clear the console (using ANSI escape codes)
  public static void clearConsole() {
    System.out.print("\033[H\033[2J"); // ANSI escape code for clearing the console
    System.out.flush(); // Ensure the output is flushed immediately
  }
}
