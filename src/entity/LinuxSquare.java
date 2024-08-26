package entity;

public class LinuxSquare extends Shape{
    @Override
    public void draw() {
        System.out.println("Drawing Linux Square");
    }
    @Override
    public String getDescription() {
        return "This is a Linux Square";
    }
}
