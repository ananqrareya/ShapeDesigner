package entity;

public class BorderColorDecorator extends ShapeDecorator{

    public BorderColorDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("Applying border color");
    }

    @Override
    public String getDescription() {
        return decoratedShape.getDescription() + " with border color";
    }
}
