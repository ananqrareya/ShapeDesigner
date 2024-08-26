package entity;

public class LinuxShapeFactory implements AbstractShapeFactory {
    public Shape createSquare() {
        return new LinuxSquare();
    }

    public Shape createCircle() {
        return new LinuxCircle();
    }
}
