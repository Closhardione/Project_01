public class TransformationDecorator extends ShapeDecorator {
    private boolean translate;
    private Vec2 translateVector;

    private boolean rotate;
    private double rotateAngle;
    private Vec2 rotateCenter;

    private boolean scale;
    private Vec2 scaleVector;
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

        private boolean rotate=false;
        private double rotateAngle;
        private Vec2 rotateCenter;

        private boolean scale;
        private Vec2 scaleVector;

        private Shape shape;
        public Builder setTranslate(Vec2 vector){
            this.translateVector=vector;
            translate=true;
            return this;
        }

        public Builder setRotate( double rotateAngle, Vec2 rotateCenter) {
            this.rotate = true;
            this.rotateAngle = rotateAngle;
            this.rotateCenter = rotateCenter;
            return this;
        }

        public Builder setScale(Vec2 scaleVector) {
            this.scale = true;
            this.scaleVector = scaleVector;
            return this;
        }

        public TransformationDecorator build(Shape shape){
            TransformationDecorator result = new TransformationDecorator(shape);
            if(translate){
                result.translate=this.translate;
                result.translateVector=this.translateVector;
            }
            if(rotate){
                result.rotate=this.rotate;
                result.rotateAngle=this.rotateAngle;
                result.rotateCenter=this.rotateCenter;
            }
            if(scale){
                result.scale=this.scale;
                result.scaleVector=this.scaleVector;
            }
            return result;
        }

    }

}
