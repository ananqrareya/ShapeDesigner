package entity;

public class MotionCommand implements Command{

    @Override
    public void execute() {
        System.out.println("Executing motion command for Circle");
    }
}
