public class Bai4 {
    public  static class Book{
        private String title;
        private String author;
        private double price;
        public Book(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }
        public String getTitle() {
            return title;
        }
        public void setTitle(String title) {
            this.title = title;
        }
        public String getAuthor() {
            return author;
        }
        public void setAuthor(String author) {
            this.author = author;
        }
        public double getPrice() {
            return price;
        }
        public void setPrice(double price) {
            this.price = price;
        }
        public void display(){
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Price: " + price);  //To display the details of the book object.
        }
        public static void main(String[] args){
            Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 12.99);
            book1.display();
            System.out.println("đổi thông tin");
            book1.setTitle("The Great Gatsby");
            book1.setAuthor("F. Scott Fitzgerald");
            book1.setPrice(9.99);
            System.out.println("Title: " + book1.getTitle());
            System.out.println("Author: " + book1.getAuthor());
            System.out.println("Price: " + book1.getPrice());

        }

    }
}
