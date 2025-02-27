public class Area {
    int length;
    int width;

    Area(int length, int width) {
        this.length = length;
        this.width = width;
    }
   public void getArea() {
    int area = length * width;
    System.out.println("Area of rectangle is: " + area);
   }
    
}

public class Main {
    public static void main(String[] args) {
        Area rectangle = new Area(3,4);
        rectangle.getArea();                                                            
    }
}
