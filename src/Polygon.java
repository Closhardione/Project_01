import java.util.Locale;

public class Polygon {
    private Point points[];
    private int size;
    public Polygon(int n){
        this.size = n;
        points = new Point[this.size];
        for(int i =0;i<this.size;i++){
            points[i]=new Point(0,0);
        }
    }
    public void setPoint(int index,Point point){
        if(index<=(this.size-1)){
            points[index]=point;
        }
    }
    public void setTable(Point points[],int size) {
        this.points = new Point[size];
        for (int i = 0; i < size; i++) {
            this.points[i] = points[i];
        }
    }
    public String toSvg(int index1,int index2){return String.format(Locale.ENGLISH,"<line x1=\"%f\" y1=\"%f\" x2=\"%f\",y2=\"%f\"/>",this.points[index1].x,this.points[index1].y,this.points[index2].x,this.points[index2].y);}

    //points = new Point[2];
}

