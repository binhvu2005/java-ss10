public class Bai9 {
    public static class Employee{
        private String name;
        private int id;
        private double salary;

        public Employee(String name, int id, double salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }
        public String getName() {
            return name;
        }
        public int getId() {
            return id;
        }
        public double getSalary() {
            return salary;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setId(int id) {
            this.id = id;
        }
        public void setSalary(double salary) {
            this.salary = salary;
        }
        public double increaseSalary(double amount){
            return salary + amount;
        }
        public void toStrings() {
            System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);

        }
    }
    public static class Manager extends Employee{
        private double bonus;
        public Manager(String name, int id, double salary, double bonus) {
            super(name, id, salary);
            this.bonus = bonus;
        }
        public double getBonus() {
            return bonus;
        }
        public void setBonus(double bonus) {
            this.bonus = bonus;
        }
        @Override
        public double getSalary() {
            return super.getSalary() + bonus;
        }
        @Override
        public void toStrings() {
            super.toStrings();
            System.out.println(", Bonus: " + bonus);
        }
    }
    public static class Developer extends Employee{
        private String programmingLanguage;
        public Developer(String name, int id, double salary, String programmingLanguage) {
            super(name, id, salary);
            this.programmingLanguage = programmingLanguage;
        }
        public String getProgrammingLanguage() {
            return programmingLanguage;
        }
        public void setProgrammingLanguage(String programmingLanguage) {
            this.programmingLanguage = programmingLanguage;
        }
        @Override
        public void toStrings() {
            super.toStrings();
            System.out.println(", Programming Language: " + programmingLanguage);
        }
        @Override
        public double getSalary(){
            return super.getSalary();
        }
    }
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 1, 5000);
        Manager manager = new Manager("Jane Smith", 2, 7000, 1000);
        Developer developer = new Developer("David Johnson", 3, 6000, "Java");

        employee.toStrings();
        manager.toStrings();
        developer.toStrings();

        System.out.println("Increased Salary of Employee: " + employee.increaseSalary(2000));
        System.out.println("Increased Salary of Manager: " + manager.increaseSalary(3000));
        System.out.println("Increased Salary of Developer: " + developer.increaseSalary(4000));
    }
}
