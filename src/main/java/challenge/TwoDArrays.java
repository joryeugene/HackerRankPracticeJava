package challenge;

import java.util.Scanner;

//    Output Format
//
//    Print the largest (maximum) hourglass sum found in .
//
//    Sample Input
//
//    1 1 1 0 0 0
//    0 1 0 0 0 0
//    1 1 1 0 0 0
//    0 0 2 4 4 0
//    0 0 0 2 0 0
//    0 0 1 2 4 0
//
//    Sample Output
//
//    19

public class TwoDArrays {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int[][] arr = new int[6][6];
    int largestHourglassSum = -100000;

    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 6; j++) {
        arr[i][j] = in.nextInt();
      }
    }

    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        int hourglassSum = getHourglassSum(arr, i, j);
        if (hourglassSum > largestHourglassSum) {
          largestHourglassSum = hourglassSum;
        }
      }
    }

    System.out.println(largestHourglassSum);
  }

  private static int getHourglassSum(int[][] arr,
                                     int i,
                                     int j) {
    return arr[i][j] +
           arr[i][j + 1] +
           arr[i][j + 2] +
           arr[i + 1][j + 1] +
           arr[i + 2][j] +
           arr[i + 2][j + 1] +
           arr[i + 2][j + 2];
  }

}
