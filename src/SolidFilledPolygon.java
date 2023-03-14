public class SolidFilledPolygon extends Polygon{
    private String color;
    public SolidFilledPolygon(Vec2[] points,String color){
        super(points);
        this.color=color;
    }
    public String toSvg(String color){
        String fill = "fill=\""+color+"\"";
        return super.toSvg(fill);
    }
}
