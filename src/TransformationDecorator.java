public class TransformationDecorator extends ShapeDecorator {
    private boolean translate;
    private Vec2 translateVector;
    public Shape shape;
    public void setShape(Shape shape){
        this.shape = shape;
    }
    public TransformationDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }
//    public String toSvg(String parameters){
//        String result="";
//        if(translate){
//            result+="";
//        }
//        return super.toSvg(result);
//    }

    public static class Builder{
        private boolean translate=false;
        private Vec2 translateVector;
        private Shape shape;
        public Builder setTranslate(Vec2 vector){
            this.translateVector=vector;
            translate=true;
            return this;
        }
        public TransformationDecorator build(Shape shape){
            TransformationDecorator result = new TransformationDecorator(shape);
            if(translate){
                result.translate=this.translate;
                result.translateVector=this.translateVector;
            }
            return result;
        }

    }

}
