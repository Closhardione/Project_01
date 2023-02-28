public class Segment {
    private Point p1,p2;
    public Segment(Point p1,Point p2){
        this.p1=p1;
        this.p2=p2;
    }
    public void setP1(Point x){
        this.p1=x;
    }
    public void setP2(Point y){
        this.p2=y;
    }
    public Point getP1(){return p1;}
    public Point getP2(){return p2;}
    public double getDistance(){
        return Math.hypot(p1.x-p2.x,p1.y-p2.y);
    }
}
