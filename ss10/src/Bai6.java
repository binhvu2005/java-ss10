public class Bai6 {
    public static class Point{
        private double x;
        private double y;
        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
        public double getX(){
           return this.x;
        }
        public double getY(){
            return this.y;
        }
        public double setX(double x){
            return this.x = x;
        }
        public double setY(double y){
            return this.y = y;
        }
        public String toString(){
            System.out.println("Point(" + x + ", " + y + ")");
            return null;
        }
    }
    public static class MoveablePoint extends Point{
        private double xSpeed;
        private double ySpeed;
        public MoveablePoint(double x, double y, double xSpeed, double ySpeed) {
            super(x, y);
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }
        public double getxSpeed() {
            return this.xSpeed;
        }
        public double getySpeed() {
            return this.ySpeed;
        }
        public void setxSpeed(double xSpeed) {
            this.xSpeed = xSpeed;
        }
        public void setySpeed(double ySpeed) {
            this.ySpeed = ySpeed;
        }
        public void move(){
            System.out.println("Moving...");
            this.setX(this.getX() + this.xSpeed);
            this.setY(this.getY() + this.ySpeed);
        }
        public String toString(){
            System.out.println("MoveablePoint(" + getX() + ", " + getY() + ", " + getxSpeed() + ", " + getySpeed() + ")");
            return null;
        }
    }
    public static void main(String[] args) {
        Point p = new Point(10, 20);
        System.out.println("Vị trí ban đầu: " + p.toString());

        MoveablePoint mp = new MoveablePoint(10, 20, 5, 7);
        System.out.println("Vị trí ban đầu của MoveablePoint: " + mp.toString());

        mp.move();
        System.out.println("Vị trí sau khi di chuyển: " + mp.toString());

        mp.setxSpeed(10);
        mp.setySpeed(15);
        mp.move();
        System.out.println("Vị trí sau khi thay đổi tốc độ và di chuyển: " + mp.toString());
    }
}