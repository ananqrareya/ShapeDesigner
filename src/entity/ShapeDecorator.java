package entity;

public abstract class ShapeDecorator extends Shape {
    protected Shape decoratedShape;
    public ShapeDecorator(Shape shape) {
        this.decoratedShape = shape;
    }

    public void draw() {
        decoratedShape.draw();
    }

    public String getDescription() {
        return decoratedShape.getDescription();
    }
}
