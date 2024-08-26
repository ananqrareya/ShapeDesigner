package entity;

public class DoubleBorderDecorator extends ShapeDecorator{

    public DoubleBorderDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("Applying double border size.");
    }

    @Override
    public String getDescription() {
        return decoratedShape.getDescription() + " with double border size";
    }
}
