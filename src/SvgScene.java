
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class SvgScene {
    private Shape[] shapes = new Shape[0];
    private static SvgScene instance=null;

    private String[] defs= new String[0];

    public SvgScene getInstance(SvgScene instance){
        if(this.instance==null){
            this.instance=instance;
            return this.instance;
        }
        else{
            return this.instance;
        }
    }
    public void addShape(Shape poly) {
        shapes = Arrays.copyOf(shapes, shapes.length + 1);
        shapes[shapes.length - 1] = poly;
    }
    public void addDefs(String def) {
        defs = Arrays.copyOf(defs, defs.length + 1);
        defs[defs.length - 1] = def;
    }

    public void saveHtml(String path) {
        try {
            FileWriter file = new FileWriter(path);
            file.write("<html>\n<body>\n");
            file.write(String.format("<svg width=1000 height=1000>\n"));
            for(Shape shape : shapes)
                file.write("\t"+ shape.toSvg("")+"\n");
            file.write("<defs>\n");
            for(String def : defs)
                file.write("\t"+ def.toString()+"\n");
            file.write("</defs>\n");
            file.write("</svg>\n</body>\n</html>\n");
            file.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
