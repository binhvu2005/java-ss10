public class Bai10 {
    public static class Shape{
        private String name;
        
        public Shape(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
        public double calculateArea() {
            return 0.0;
        }
        public double calculatePerimeter() {
            return 0.0;
        }
        public void toStrings() {
            System.out.println("tên:"+getName()+"chu vi"+calculatePerimeter()+"diện tích"+calculateArea());
        }
    }
    public static class Circle extends Shape{
        private final double radius;
        public Circle(String name, double radius) {
            super(name);
            this.radius = radius;
        }
        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }
        @Override
        public double calculatePerimeter() {
            return 2 * Math.PI * radius;
        }
        @Override
        public void toStrings() {
            super.toStrings();
            System.out.println("bán kính:"+radius);
        }
    }
    public static class Rectangle extends Shape{
        private double width;
        private double height;
        public Rectangle(String name, double width, double height) {
            super(name);
            this.width = width;
            this.height = height;
        }
        @Override
        public double calculateArea() {
            return width * height;
        }
        @Override
        public double calculatePerimeter() {
            return 2 * (width + height);
        }
        @Override
        public void toStrings() {
            super.toStrings();
            System.out.println("chiều dài:"+width+" chiều rộng:"+height);
        }
    }
    public static class Triangle extends Shape{
        private double side1;
        private double side2;
        private double side3;
        public Triangle(String name, double side1, double side2, double side3) {
            super(name);
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
        @Override
        public double calculateArea() {
            double p = (side1 + side2 + side3) / 2;
            return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
        }
        @Override
        public double calculatePerimeter() {
            return side1 + side2 + side3;
        }
        @Override
        public void toStrings() {
            super.toStrings();
            System.out.println("cạnh 1:"+side1+" cạnh 2:"+side2+" cạnh 3:"+side3);
        }
    }
    public static void main(String[] args) {
        Shape shape1 = new Shape("hình");
        shape1.toStrings();
        Circle circle1 = new Circle("hinh tròn", 5);
        circle1.toStrings();
        Rectangle rectangle1 = new Rectangle("hình chữ nhật", 5, 10);
        rectangle1.toStrings();
        Triangle triangle1 = new Triangle("hình tam giác", 3, 4, 5);
        triangle1.toStrings();
    }
}
