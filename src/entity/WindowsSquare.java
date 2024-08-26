package entity;

public class WindowsSquare extends Shape{
    @Override
    public void draw() {
        System.out.println("Drawing Windows Square");
    }

    @Override
  public   String getDescription() {
        return "This is a Windows Square";
    }
}
