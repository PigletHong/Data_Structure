package com.example.datastructure.dataStructure.stack;

import org.junit.jupiter.api.Test;

import java.util.Stack;


public class StackTest {
    @Test
    void stack() {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i <= 5; i++) {
            stack.push(i);
        }
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
