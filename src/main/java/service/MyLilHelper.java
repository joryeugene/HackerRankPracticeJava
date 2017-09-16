package service;

import java.util.Arrays;
import java.util.Optional;

public class MyLilHelper {

  public static final String NEW_LINE = System.getProperty("line.separator");

  public static String getFormattedOutputString(String[] printLines) {
    return Arrays.stream(printLines)
                 .reduce("", (a, b) -> a.concat(b)
                                        .concat(NEW_LINE));
  }
}
