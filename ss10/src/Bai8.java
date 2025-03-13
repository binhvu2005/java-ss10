public class Bai8 {
    public static class Animals{
        private String name;
        private int age;

        public Animals(String name, int age){
            this.name = name;
            this.age = age;
        }
        public String getName(){
            return name;
        }
        public int getAge(){
            return age;
        }
        public void setName(String name){
            this.name = name;
        }
        public void setAge(int age){
            this.age = age;
        }
        public void makeSound(){
            System.out.println("Some generic sound");
        }
        public void displayInfo(){
            System.out.println("Name: " + name + " age: " + age);
        }
    }
    public static class Dogs extends Animals{
        private String breed;
        public Dogs(String name, int age, String breed){
            super(name, age);
            this.breed = breed;
        }
        public String getBreed(){
            return breed;
        }
        public void setBreed(String breed){
            this.breed = breed;
        }
        @Override
        public void makeSound(){
            System.out.println("Woof! Woof!");
        }
        public void displayInfo(){
            super.displayInfo();
            System.out.println("Breed: " + breed);
        }
    }
    public static class Cat extends Animals{
        private String furColor ;
        public Cat(String name, int age, String furColor){
            super(name, age);
            this.furColor = furColor;
        }
        public String getFurColor(){
            return furColor;
        }
        public void setFurColor(String furColor){
            this.furColor = furColor;
        }
        @Override
        public void makeSound(){
            System.out.println("Meow! Meow!");
        }
        public void displayInfo(){
            super.displayInfo();
            System.out.println("Fur Color: " + furColor);
        }
    }
    public static void main(String[] args){
        Dogs dog = new Dogs("Buddy", 3, "Golden Retriever");
        Cat cat = new Cat("Whiskers", 4, "White");

        dog.makeSound();
        cat.makeSound();

        dog.displayInfo();
        cat.displayInfo();
    }
}
