package StructuralPatterns.Proxy;

public class ProxyImage implements Image{

    private String filename;
    private RealImage realImage;

    public ProxyImage(String filename){
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null){
            realImage = new RealImage(this.filename);
        }
        realImage.display();
    }
}
