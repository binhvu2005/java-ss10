import java.util.Date;

public class Bai3 {
    public static class Car{
        private String make;
        private String model;
        private int year;

        public Car(String make, String model, int year) {
            this.make = make;
            this.model = model;
            this.year = year;
        }

        public String getMake() {
            return make;
        }
        public void setMake(String make) {
            this.make = make;
        }
        public String getModel() {
            return model;
        }
        public void setModel(String model) {
            this.model = model;
        }
        public int getYear() {
            return year;
        }
        public void display(){
            System.out.println("Xe: " + make + " - " + model + " - " + year);
        }
        public void setYear(int year) {
            if(year < new Date().getYear()){
                System.out.println("năm sản xuất phải bé hơn hoặc bằng năm hiện tại.");
            }else {
                this.year = year;
            }
        }
        public static void main(String[] args){
            Car car1 = new Car("Toyota", "Camry", 2010);
            car1.display();
            car1.setYear(2020);
            System.out.println("Năm sản xuất của xe sau khi thay đổi: " + car1.getYear());
            car1.display();
        }

    }
}
