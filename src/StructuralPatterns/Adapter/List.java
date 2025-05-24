package StructuralPatterns.Adapter;

public class List {

    private Node head;
    private Node tail;

    public void insert(Node pos, Object o){

    }

    public void remove(Node pos, Object o){

    }

    public void insertHead(Object o){
        this.head.setValue(o);
    }

    public void insertTail(Object o){
        this.tail.setValue(o);
    }

    public Object removeHead(){
        Object temp = this.head.getValue();
        this.head.setValue(null);
        return temp;
    }

    public Object removeTail(){
        Object temp = this.tail.getValue();
        this.tail.setValue(null);
        return temp;
    }

    public Object getHead(){
        return this.head.getValue();
    }

    public Object getTail(){
        return this.tail.getValue();
    }
}
