public class Point {

    private final double pointX;
    private final double pointY;

    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double getPointX() {
        return pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public double getDistance(Point point) {
        return Math.sqrt(Math.pow((this.pointX - point.getPointX()), 2) + Math.pow((this.pointY - point.getPointY()), 2));
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + pointX +
                ", y=" + pointY +
                '}';
    }
}
