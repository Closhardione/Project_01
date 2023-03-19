public class DropShadowDecorator extends ShapeDecorator{
    private String shadow;
    private static int id;
    public DropShadowDecorator(Shape decoratedShape, String shadow) {
        super(decoratedShape);
        this.shadow = shadow;
    }
    //idk
    public String toSvg(String string){
        return null;
    }
}
