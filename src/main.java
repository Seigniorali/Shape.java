import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;
class Main {
    public static void main(String[] args) throws FileNotFoundException {
        List<String> files = new ArrayList<String>();
        files.add("C:\\Homework 1st year\\Homework 2nd Trimester\\src\\file1.txt");
        files.add("C:\\Homework 1st year\\Homework 2nd Trimester\\src\\file1.txt");
        for (int i = 0; i < files.size(); i++) {
            File file = new File(files.get(i));
            Scanner sc = new Scanner(file);
            int x, y;
            System.out.println(sc.hasNextInt());
            Shape s1 = new Shape();
            while (sc.hasNextInt()) {
                x = sc.nextInt();
                y = sc.nextInt();
                Point point = new Point(x, y);
                s1.addPoint(point);
            }
            System.out.println(s1.calculatePerimeter());
            System.out.println(s1.getLongestSide());
            System.out.println(s1.getAverageLengthOfSides());
        }
    }
}
