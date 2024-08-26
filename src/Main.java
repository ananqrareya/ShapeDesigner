import entity.*;

public class Main {
    public static void main(String[] args) {
        // Step 1: Create a factory for Linux shapes
        AbstractShapeFactory linuxFactory = new LinuxShapeFactory();

        // Step 2: Create a Linux Circle using the factory and the Singleton pattern
        Shape linuxCircle = Shape.getCircleInstance(linuxFactory);

        // Step 3: Decorate the Linux Circle with a border color and double border size
        // This adds functionality to the shape without modifying its core behavior
        linuxCircle = new BorderColorDecorator(new DoubleBorderDecorator(linuxCircle));

        // Step 4: Draw the Linux Circle and print its description
        // This should output:
        // Drawing Linux Circle
        // Applying double border size.
        // Applying border color
        // with the description reflecting these changes.
        linuxCircle.draw();
        System.out.println(linuxCircle.getDescription());

        // Step 5: Execute the motion command for the circle
        // The command should automatically be triggered for circles
        ShapeCommandExecutor executor = new ShapeCommandExecutor();
        executor.executeCommand(linuxCircle); // Should execute the motion command

        // Step 6: Create a Windows Square and apply decorations
        // This tests the ability to create and modify a Windows-specific shape
        AbstractShapeFactory windowsFactory = new WindowsShapeFactory();
        Shape windowsSquare = Shape.getSquareInstance(windowsFactory);
        windowsSquare = new FillColorDecorator(new DoubleBorderDecorator(windowsSquare),"blue");

        // Step 7: Draw the Windows Square and print its description
        // Expected output:
        // Drawing Windows Square
        // Filling shape with color: Blue
        // Applying double border size.
        windowsSquare.draw();
        System.out.println(windowsSquare.getDescription());

        // Step 8: Execute the border light command for the square
        executor.executeCommand(windowsSquare); // Should execute the border light command
    }
}