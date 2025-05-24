package StructuralPatterns.Proxy;

public class RealImage implements Image{

    private String filename;

    public RealImage(String filename){
        this.filename = filename;
        this.loadImageFromDisk();
    }

    private void loadImageFromDisk(){
        System.out.println("Loading Image : " + this.filename);
    }


    @Override
    public void display() {
        System.out.println("Display Image : " + filename);
    }
}
