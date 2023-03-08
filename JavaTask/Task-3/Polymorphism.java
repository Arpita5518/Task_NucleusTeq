interface Drawable{
    void draw();
}
Circle implements Drawable{
    void draw(){
      System.out.println("drawing circle");
    }
}
Rectangle implements Drawable{
    void draw(){
      System.out.println("drawing Rectangle.."); 
    }
}
Triangle implements Drawable{
    void draw(){
        System.out.println("drawing Triangle.."); 
    }
}
 public class Drawing{
    public static void main(String[] args) {
        Drawable[] draw = new Drawable[3];
        Circle.draw(10, 10);
        for(int i=0; i<3; i++){
            draw.draw();
        }
    }
 }