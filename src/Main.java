public class Main {
    public static void main(String[] args) {
        Point point3 = new Point(2,3);
        Point point2 = new Point(6,5);
        Point point = new Point(7,7);
        Segment segment = new Segment(point2,point3);
        System.out.println("Hello world!");
    }
    Segment segOut(Segment segment, Point point){
        double dist = segment.getDistance();

        return segment;
    }
}