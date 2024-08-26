package entity;

public abstract  class Shape {
    public abstract void draw();
   public abstract String getDescription();
    private static Shape squareInstance;
    private static Shape circleInstance;
    public static Shape getSquareInstance(AbstractShapeFactory factory) {
        if (squareInstance == null) {
            squareInstance = factory.createSquare();
        }
        return squareInstance;
    }
    public static Shape getCircleInstance(AbstractShapeFactory factory) {  // Renamed to reflect its purpose
        if (circleInstance == null) {
            circleInstance = factory.createCircle();
        }
        return circleInstance;
    }

}
