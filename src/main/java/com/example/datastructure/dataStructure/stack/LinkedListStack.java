package com.example.datastructure.dataStructure.stack;

public class LinkedListStack {
    public class Node {
        private int item;
        private Node node;

        public Node(int item) {
            this.item = item;
            this.node = null;
        }

        protected void linkNode(Node node) { //가르킬 노드를 지정
            this.node = node;
        }
        protected int getData() {
            return this.item;
        }
        protected Node getNextNode() { //다음 노드를 리턴
            return this.node;
        }
    }

    //LinkedListStack을 관리하는 클래스
    public class NodeManager {
        Node top; //가장 최근에 들어온 노드를 가리킴

        public NodeManager() {
            this.top = null;
        }
        public void push(int data) {
            Node node = new Node(data);    //노드를 생성
            node.linkNode(top);    //새로 생성된 노드가 top이 가르키고 있는 노드를 맄크로 연결하게 함
            top = node;    //top의 값을 가장 최근에 생성된 node로 바꿈
        }
        public void pop() {
            top = top.getNextNode(); // 현재 top이 가리키고 있는 노드를 가리키게 함
        }

        public int peek() {
            return top.getData();
        }

        private int search(int item) {
            Node searchNode = top;
            int index = 1;
            while(true) {
                if (searchNode.getData() == item) {
                    System.out.println("Index Number Is " + index + "!");
                    return index;
                } else {
                    searchNode = searchNode.getNextNode();
                    index ++;
                    if (searchNode == null)
                        break;
                }
            }
            return -1;
        }

        private boolean empty() {
            System.out.println("Result is " + (top == null));
            return top == null;
        }
    }
}
