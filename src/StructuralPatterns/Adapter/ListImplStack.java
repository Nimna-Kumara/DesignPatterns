package StructuralPatterns.Adapter;

public class ListImplStack extends List implements Stack{

    @Override
    public void push(Object o) {
        this.insertTail(o);
    }

    @Override
    public Object pop() {
        return this.removeHead();
    }

    @Override
    public Object top() {
        return this.getHead();
    }
}
