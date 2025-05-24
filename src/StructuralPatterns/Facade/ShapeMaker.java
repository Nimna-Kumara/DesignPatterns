package StructuralPatterns.Facade;

public class ShapeMaker {

    private Shape cricle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker(){
        cricle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void drawCircle(){
        cricle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }

    public void drawSquare(){
        square.draw();
    }
}
