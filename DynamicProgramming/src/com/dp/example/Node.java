package com.dp.example;

public class Node<T> {

    public Node left;
    public Node right;
    public  T data;

    public Node(Node left, Node right, T data) {
        this.left = left;
        this.right = right;
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public T getData() {
        return data;
    }

}
