package entity;

public class ShapeCommandExecutor {
    public void executeCommand(Shape shape) {
        Shape originalShape = unwrapShape(shape);

        if (originalShape instanceof WindowsCircle || originalShape instanceof LinuxCircle) {
            new MotionCommand().execute();
        } else if (originalShape instanceof WindowsSquare || originalShape instanceof LinuxSquare) {
            new BorderLightCommand().execute();
        }
    }
    private Shape unwrapShape(Shape shape) {
        // Unwraps the shape to its original form if it's wrapped in decorators
        while (shape instanceof ShapeDecorator) {
            shape = ((ShapeDecorator) shape).decoratedShape;
        }
        return shape;
    }
}
