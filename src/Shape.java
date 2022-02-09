import java.util.*;
public class Shape {
    List<Point> points = new ArrayList<Point>();
    public void addPoint(Point point) {
        this.points.add(point);
    }
    public List<Point> getPoints() {
        return points;
    }
    public double calculatePerimeter() {
        double perimeter = 0;
        for (int i = 0; i < points.size(); i++) {
            Point val = points.get(i);
            if (i + 1 < points.size()) {
                perimeter += val.distance(points.get(i + 1));
            } else {
                perimeter += val.distance(points.get(0));
            }
        }
        return perimeter;
    }
    public double getLongestSide() {
        double tmpDistance = 0;
        for (int i = 0; i < points.size(); i++) {
            Point val = points.get(i);
            if (i + 1 < points.size()) {
                tmpDistance = Math.max(tmpDistance, val.distance(points.get(i + 1)));
            } else {
                tmpDistance = Math.max(tmpDistance, val.distance(points.get(0)));
            }
        }
        return tmpDistance;
    }
    public double getAverageLengthOfSides() {
        double perimeter = this.calculatePerimeter();
        return perimeter / points.size();
    }
}
