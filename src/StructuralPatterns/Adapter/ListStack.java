package StructuralPatterns.Adapter;

public class ListStack implements Stack {

    public  List list;

    public ListStack() {
        this.list = new List();
    }

    @Override
    public void push(Object o) {
        list.insertTail(o);
    }

    @Override
    public Object pop() {
        return list.removeHead();
    }

    @Override
    public Object top() {
        return list.getHead();
    }
}
