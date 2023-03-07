import java.util.Locale;

public class Polygon {
    private Point arr[];
    private int size;
    private Style style;
    public Polygon(int n){
        this.size = n;
        arr = new Point[this.size];
        for(int i =0;i<this.size;i++){
            arr[i]=new Point(0,0);
        }
    }
    public void setPoint(int index,Point point){
        if(index<=(this.size-1)){
            arr[index]=point;
        }
    }
    public void setTable(Point points[],int size) {
        this.arr = new Point[size];
        for (int i = 0; i < size; i++) {
            this.arr[i] = points[i];
        }
    }
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

}

