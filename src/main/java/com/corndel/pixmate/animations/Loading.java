package com.corndel.pixmate.animations;

import java.util.ArrayList;
import java.util.List;

public class Loading {
  public static void main(String[] args) {
    List<String> frames = new ArrayList<>();

    // Create frames for the loading animation
    for (int i = 0; i <= 10; i++) {
      StringBuilder line = new StringBuilder("|");
      line.append("#".repeat(i)); // Append i number of '#' characters
      line.append(" ".repeat(10 - i)); // Append (10 - i) number of spaces
      line.append("|");

      frames.add(line.toString()); // Add the frame to the list
    }

    // Call the animate method from Animator with a 0.5 second interval (500 ms)
    Animator.animate(frames, 0.5);
  }
}
