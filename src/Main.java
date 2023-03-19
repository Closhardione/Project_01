

import java.util.ArrayList;
import java.util.Locale;


public class Main {

    public static void main(String[] args) {
        Shape poly = new Polygon(new Vec2[]{new Vec2(120,60), new Vec2(270,280), new Vec2(240,320), new Vec2(110,80)});

        Shape ellipse = new Ellipse(new Vec2(2,3),10,20);
        poly = new SolidFilledShapeDecorator(poly,"red");
        ellipse = new SolidFilledShapeDecorator(ellipse,"blue");
        ellipse = new StrokeShapeDecorator(ellipse, "green", 24);

        new TransformationDecorator
                .Builder()
                .setTranslate(new Vec2(2,3))
                .setTranslate(new Vec2(4,5))
                .build(poly);

//        SvgScene scene=new SvgScene();
//        scene.addShape(poly);
//        scene.addShape(ellipse);
//        scene.saveHtml("scene.html");
    }
}
