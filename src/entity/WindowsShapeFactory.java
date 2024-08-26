package entity;

public class WindowsShapeFactory implements AbstractShapeFactory{
    @Override
    public Shape createSquare() {
        return new WindowsSquare();
    }

    @Override
    public Shape createCircle() {
        return new WindowsCircle();
    }
}
