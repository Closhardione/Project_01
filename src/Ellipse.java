import java.util.Locale;

public class Ellipse extends Shape{
    public Ellipse(Style style, Point center, double rx, double ry, Style style1) {
        super(style);
        this.center = center;
        this.rx = rx;
        this.ry = ry;
        this.style = style1;
    }

    @Override
    public String toSvg(){
        return String.format(Locale.ENGLISH,"<ellipse cx=\"%f\" cy=\"%f\" rx=\"%f\" ry=\"%f\" style=\"%s\"/>", center.x,center.y,rx,ry, style.toSvg());
    }
    private Point center;
    private double rx;
    private double ry;
    private Style style;


}
