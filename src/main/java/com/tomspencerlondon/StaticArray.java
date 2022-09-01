package com.tomspencerlondon;

import java.util.Arrays;

public class StaticArray {

  public static void main(String[] args) {
    int[] arr = new int[5];
    insertEnd(arr, 3, 3, 4);
    System.out.println(Arrays.toString(arr));
    removeEnd(arr, 4);
    printArr(arr, 5);
    insertMiddle(arr, 2, 5, 4);
    printArr(arr, 5);
    removeMiddle(arr, 1, 5);
    printArr(arr, 5);
  }

  // Remove value at index i before shifting elements to the left.
  // Assuming i is a valid index.
  public static void removeMiddle(int[] arr, int i, int length) {
    // Shift starting from i + 1 to the end.
    for (int index = i + 1; index < length; index++) {
      arr[index - 1] = arr[index];
    }

    // No need to 'remove' arr[i], since we already shifted
  }

  // insert n into index i after shifting elements to the right.
  // Assuming i is a valid index and arr is not full.
  public static void insertMiddle(int[] arr, int i, int n, int length) {
    // Shift starting from the end to i.
    for (int index = length - 1; index > i - 1; index--) {
      arr[index + 1] = arr[index];
    }
    // insert at i
    arr[i] = n;
  }

  public static void printArr(int[] arr, int capacity) {
    System.out.print("[");
    for (int i = 0; i < capacity; i++) {
      if (i > 0) {
        System.out.print(" ");
      }
      System.out.print(arr[i]);

      if (i < capacity - 1) {
        System.out.print(",");
      }
    }
    System.out.println("]");
  }

  // Remove from the last position in the array of the array
  // is not empty (i.e. length is non-zero)
  public static void removeEnd(int[] arr, int length) {
    if (length > 0) {
      // Overwrite last element with some default value.
      // We would also want the length to be decreased by 1.
      arr[length - 1] = 0;
      length--;
    }
  }


//  Insert n into arr at the next open position.
  // Length is the number of 'real' values in arr, and capacity
  // is the size (aka memory allocated for the fixed size array).

  public static void insertEnd(int[] arr, int n, int length, int capacity) {
    if (length < capacity) {
      arr[length] = n;
    }
  }
}
