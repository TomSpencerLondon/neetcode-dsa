package com.tomspencerlondon;

import java.util.ArrayList;

class Working {

  public static void main(String[] args) {
    Stack stack = new Stack();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    System.out.println(stack);
    System.out.println(stack.pop());
    System.out.println(stack);
    System.out.println(stack.size());
  }
}

// Implementing a stack is trivial using a dynamic array
// Which is in the other file
public class Stack {

  ArrayList<Integer> stack = new ArrayList<Integer>();

  public void push(int n) {
    stack.add(n);
  }

  public int pop() {
    return stack.remove(stack.size() - 1);
  }

  public int size() {
    return stack.size();
  }

  @Override
  public String toString() {
    return stack.toString();
  }
}
