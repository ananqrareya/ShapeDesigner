package entity;

public class BorderLightCommand implements Command{
    @Override
    public void execute() {
        System.out.println("Executing border light command for Square");
    }
}
