package com.stackandqueue;

public class MyNode<K> implements INode<K> {
    private INode next;
    private K key;

    public MyNode(K key) {
        this.key = key;
        this.next = null;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public void setNext(INode next) {

    }

    @Override
    public INode getNext() {
        return null;
    }

    @Override
    public void setKey(K key) {
        this.key = key;
    }
}

