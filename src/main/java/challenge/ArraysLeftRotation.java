package challenge;

import java.util.Arrays;
import java.util.Scanner;

//    Input Format
//
//    The first line contains two space-separated integers denoting the respective values of  (the number of integers) and  (the number of left rotations you must perform).
//    The second line contains  space-separated integers describing the respective elements of the array's initial state.
//
//    Sample Input
//
//    5 4
//    1 2 3 4 5
//
//    Sample Output
//
//    5 1 2 3 4

public class ArraysLeftRotation {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int arrayLength = in.nextInt();
    int numRotations = in.nextInt() % arrayLength;
    int[] arrayToRotate = new int[arrayLength];

    for (int index = 0; index < arrayLength; index++) {
      arrayToRotate[index] = in.nextInt();
    }

    int[] rotatedArray = getRotatedArray(arrayLength, numRotations, arrayToRotate);

    for (int i = 0; i < arrayLength; i++) {
      System.out.print(rotatedArray[i] + " ");
    }
  }

  private static int[] getRotatedArray(int arrayLength,
                                       int numRotations,
                                       int[] arrayToRotate) {
    int[] endOfNewRotatedArray = Arrays.copyOfRange(arrayToRotate, 0, numRotations);
    int[] begOfNewRotatedArray = Arrays.copyOfRange(arrayToRotate,
                                                    numRotations,
                                                    arrayToRotate.length);

    int[] rotatedArray = new int[arrayLength];
    System.arraycopy(begOfNewRotatedArray, 0, rotatedArray, 0, begOfNewRotatedArray.length);
    System.arraycopy(endOfNewRotatedArray,
                     0,
                     rotatedArray,
                     begOfNewRotatedArray.length,
                     endOfNewRotatedArray.length);
    return rotatedArray;
  }

}
