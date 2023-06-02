package com.example.datastructure.dataStructure.stack;

public class ArrayStack {
    int top;    //인덱스
    int size;    //스택 배열의 크기
    int [] stack;
    public ArrayStack(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    public void push(int num) {
        stack[++top] = num;
        System.out.println(stack[top] + " Push!");
    }

    public void pop() {
        System.out.println(stack[top] + " Pop!");
        int pop = stack[top];
        stack[top--] = 0;
    }

    public void peek() {
        System.out.println(stack[top] + " Peek!");
    }

    public int search(int num) {
        for (int i = 0; i <= top; i++) {
            if (stack[i] == num) {
                System.out.println("Index Number Is " + ((top - i) + 1) + "!");
                return (top - i) + 1;
            }
        }
        return -1;
    }

    public boolean empty() {
        System.out.println("Result is " + (size == 0));
        return size == 0;
    }
}
