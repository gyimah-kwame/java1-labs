package com.company.lab3;

import java.util.ArrayList;
import java.util.List;

public class MyStack <T>{

    private final List<T> elements;

    public MyStack() {
       elements = new ArrayList<>();
    }

    public void push(T item) {
        elements.add(item);
    }

    public T top() {
        return elements.get(elements.size()-1);
    }

    public void pop() {
        T item = top();
        elements.remove(item);
        System.out.println(item);
    }

    public int size() {
        return elements.size();
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "elements=" + elements.toString() +
                '}';
    }
}
