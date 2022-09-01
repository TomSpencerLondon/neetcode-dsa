package com.tomspencerlondon;

import java.util.Arrays;

public class StaticArray {

  public static void main(String[] args) {
    int[] arr = new int[4];
    insertEnd(arr, 3, 3, 4);
    System.out.println(Arrays.toString(arr));
    removeEnd(arr, 4);
    System.out.println(Arrays.toString(arr));
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
