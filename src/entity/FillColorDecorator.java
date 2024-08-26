package entity;

public class FillColorDecorator extends ShapeDecorator{
    private String color;
    public FillColorDecorator(Shape decoratedShape, String color) {
        super(decoratedShape);
        this.color = color;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("Filling shape with color: " +color);
    }

    @Override
    public String getDescription() {
        return decoratedShape.getDescription() + " with color fill: "+color;
    }
}
