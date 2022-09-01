package com.tomspencerlondon;

import java.util.Arrays;

class Solution {

  public static void main(String[] args) {
    DynamicArray array = new DynamicArray();
    System.out.println(array);
    array.pushback(2);
    System.out.println(array);
    array.pushback(3);
    System.out.println(array);
    array.pushback(4);
    System.out.println(array);
    array.pushback(5);
    System.out.println(array);
    array.pushback(7);
    System.out.println(array);
  }
}

class DynamicArray {
  public int capacity;
  public int length;
  public int[] arr;

  public DynamicArray() {
    capacity = 2;
    length = 0;
    arr = new int[2];
  }

  // insert n in the last position of the array
  public void pushback(int n) {
    if (length == capacity) {
      this.resize();
    }
    // insert at next empty position
    arr[length] = n;
    length++;
  }


  public void resize() {
    // Create new array of double capacity
    capacity = 2 * capacity;
    int[] newArr = new int[capacity];

    // copy elements to newArr
    for (int i = 0; i < length; i++) {
      newArr[i] = arr[i];
    }

    arr = newArr;
  }

  @Override
  public String toString() {
    return Arrays.toString(arr);
  }
}
