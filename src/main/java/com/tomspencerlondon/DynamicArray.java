package com.tomspencerlondon;

import java.util.Arrays;

class Solution {

  public static void main(String[] args) {
    DynamicArray array = new DynamicArray();
    array.print();
    array.pushback(2);
    array.print();
    array.pushback(3);
    array.print();
    array.pushback(4);
    array.print();
    array.pushback(5);
    array.print();
    array.popback();
    array.print();
    System.out.println(array.get(1));
    array.insert(1, 25);
    array.print();
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

//  Insert n at i-th index
  public void insert(int i, int n) {
    if (i < length) {
      arr[i] = n;
      return;
    }

    return;
    // Here we would throw an index out of bounds exception
  }

  // Get value at i-th index
  public int get(int i) {
    if (i < length) {
      return arr[i];
    }
    // Here we would throw an index out of bounds exception
    return -1;
  }


//  Remove the last element in the array
  public void popback() {
    if (length > 0) {
      length--;
    }
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

  public void print() {
    System.out.print("[");
    for (int i = 0; i < length; i++) {
      if (i > 0) {
        System.out.print(" ");
      }
      System.out.print(arr[i]);

      if (i < length - 1) {
        System.out.print(",");
      }
    }
    System.out.println("]");
  }

  @Override
  public String toString() {
    return Arrays.toString(arr);
  }
}
