public class Bai5 {
    public static class Circle{
        private double radius;
        public Circle(double radius){
            this.radius = radius;
        }
        public double getRadius(){
            return radius;
        }
        public double setRadius(double radius){
            return this.radius= radius;
        }
        public double getArea(){
            return Math.PI * radius * radius;
        }

    }
    public static class Cylinder extends Circle {
        private double height;
        public Cylinder(double radius, double height) {
            super(radius);
            this.height = height;
        }
        public double getHeight(){
            return height;
        }
        public double setHeight(double height){
            return this.height = height;
        }
        public double getVolume(){
            return Math.PI * Math.pow(getRadius(), 2) * height;
        }

    }
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());

        Cylinder cylinder = new Cylinder(5, 10);
        System.out.println("Radius: " + cylinder.getRadius());
        System.out.println("Height: " + cylinder.getHeight());
        System.out.println("Volume: " + cylinder.getVolume());
        circle.setRadius(100);
        System.out.println("Updated Radius: " + circle.getRadius());
        cylinder.setHeight(100);
        System.out.println("Updated Height: " + cylinder.getHeight());

    }
}
