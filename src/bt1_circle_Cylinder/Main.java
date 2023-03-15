package bt1_circle_Cylinder;


public class Main {
    public static void main(String[] args) {
        // Class Circle
        System.out.println("----------CIRCLE----------");
        Circle circle = new Circle();
        circle.setRadius(3);
        System.out.println(circle);

        System.out.println("Nhập vào bán kính hình tròn : "+circle.getRadius());
        System.out.println("In ra diện tích hình tròn : "+circle.getArea());
        System.out.println("In ra chu vi hình tròn : "+   circle.getPerimeter());


        //Class Cylinder
        System.out.println("----------CYLYNDER----------");
        Cylinder cylinder = new Cylinder(circle.getArea(),"lolo",3);
        System.out.println("đây là hình trụ " + cylinder.getAre());
    }
}
