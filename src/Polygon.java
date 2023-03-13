import java.util.Locale;

public class Polygon extends Shape{
    private Point arr[];
    private int size;
    private Style style;
    public Polygon(int count,Style style) {
        super(style);
        arr = new Point[count];
    }
    public Polygon(int n){
        this(n,new Style("transparent","black",1.0));
        /*this.size = n;
        arr = new Point[this.size];
        for(int i =0;i<this.size;i++){
            arr[i]=new Point(0,0);
        }*/
    }
    public void setPoint(int index,Point point){
        if(index<=(this.size-1)){
            arr[index]=point;
        }
    }
    public void setTable(Point[] points) {
       this.arr=points;
        }
    @Override
    public String toSvg() {
        String pointsString = "";
        for(Point point : arr)
            pointsString += point.x + "," + point.y + " ";

        return String.format(Locale.ENGLISH,"<polygon points=\"%s\" style=\"%s\" />", pointsString,this.style.toSvg());
    }
    public Point getMaxCords(){
        Point maxPoint = new Point(0,0);
        for(Point p:this.arr){
            if(p.x>maxPoint.x){
                maxPoint.x=p.x;
            }
            if(p.y>maxPoint.y){
                maxPoint.y=p.y;
            }
        }
        return maxPoint;
    }
    public static Polygon square(Segment diagonal, Style style) {
        Point center = new Point((diagonal.getP1().x+diagonal.getP2().x)/2, (diagonal.getP1().y+diagonal.getP2().y)/2);
        Segment[] perpResult = Segment.perpendicular(diagonal,center, diagonal.getDistance()/2);
        Point[] pointArr = new Point[4];
        pointArr[0] = diagonal.getP1();
        pointArr[1] = perpResult[0].getP2();
        pointArr[2] = diagonal.getP2();
        pointArr[3] = perpResult[1].getP2();
        Polygon result = new Polygon(4, style);
        result.setTable(pointArr);
        return result;
    }

}

