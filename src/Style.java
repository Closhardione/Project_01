public class Style {
    public final String fillColor;
    public final String strokeColor;
    public final Double strokeWidth;

    public Style(String fill,String stroke,Double width){
        this.fillColor=fill;
        this.strokeColor=stroke;
        this.strokeWidth=width;
    }
    public String getFillColor() {
        return fillColor;
    }

    public String getStrokeColor() {
        return strokeColor;
    }

    public Double getStrokeWidth() {
        return strokeWidth;
    }
    public String toSvg(){
        String style=" ";
        if(this.fillColor==null){
            style+="fill: transparent; ";
        }
        else{
            style+="fill: ";
            style+= this.fillColor;
        }
        if(this.strokeColor==null){
            style+="stroke: black; ";
        }
        else{
            style+="stroke: ";
            style+=this.strokeColor;
        }
        if(this.strokeWidth==null){
            style+="stroke-width: 1px; ";
        }
        else{
            style+="stroke-width: ";
            style+=this.strokeWidth+"; ";
        }
        return style;
    }
}
