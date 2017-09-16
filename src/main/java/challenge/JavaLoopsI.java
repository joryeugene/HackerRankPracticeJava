package challenge;

import java.awt.font.NumericShaper.Range;
import java.util.Scanner;
import java.util.stream.IntStream;

//    Sample Input
//
//    2
//
//    Sample Output
//
//    2 x 1 = 2
//    2 x 2 = 4
//    2 x 3 = 6
//    2 x 4 = 8
//    2 x 5 = 10
//    2 x 6 = 12
//    2 x 7 = 14
//    2 x 8 = 16
//    2 x 9 = 18
//    2 x 10 = 20

public class JavaLoopsI {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int numInput = in.nextInt();

    IntStream.range(1,
                    11)
             .forEach(num ->
                          System.out.println(numInput + " x " + num + " = " + numInput * num));
  }

}
