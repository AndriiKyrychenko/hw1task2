public class Circle {

    private final Point circleCenter;
    private final double radius;

    public Circle(Point circleCenter, double radius) {
        this.circleCenter = circleCenter;
        this.radius = radius;
    }

    public boolean pointInCircle(Point point) {
        return point.getDistance(circleCenter) <= radius;
    }
}
