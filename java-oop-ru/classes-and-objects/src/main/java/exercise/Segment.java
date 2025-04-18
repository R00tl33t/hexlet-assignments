package exercise;

public class Segment {
    public Segment(Point beginPoint, Point endPoint) {
        this.beginPoint = beginPoint;
        this.endPoint = endPoint;
    }

    public static Point getBeginPoint() {
        return beginPoint;
    }

    public static Point getEndPoint() {
        return endPoint;
    }

    public static Point getMidPoint() {
        Point midPoint = new Point();
        var endPointX = endPoint.getX();
        var beginPointX = beginPoint.getX();
        var endPointY = endPoint.getY();
        var beginPointY = beginPoint.getY();
        midPoint.setX(endPointX - beginPointX);
        midPoint.setY(endPointY - beginPointY);
        return midPoint;
    }
}