public class Bai1 {
    /*
    1. Tính đóng gói là gì? Tại sao tính đóng gói lại quan trọng trong lập trình đối tượng?**
Tính đóng gói (Encapsulation)** là một trong bốn nguyên lý quan trọng của lập trình hướng đối tượng (OOP). Nó cho phép đóng gói dữ liệu (thuộc tính) và phương thức vào một lớp, đồng thời hạn chế quyền truy cập trực tiếp từ bên ngoài lớp bằng cách sử dụng các mức truy cập (`private`, `protected`, `public`).

Tại sao tính đóng gói quan trọng?
- **Bảo vệ dữ liệu**: Ngăn chặn việc truy cập và thay đổi dữ liệu một cách không hợp lệ từ bên ngoài.
- **Kiểm soát truy cập**: Chỉ cho phép truy cập dữ liệu thông qua các phương thức cụ thể (getter và setter).
- **Tính linh hoạt và bảo trì dễ dàng**: Nếu cần thay đổi logic nội bộ, chỉ cần chỉnh sửa trong lớp mà không ảnh hưởng đến các phần khác của chương trình.
- **Ẩn chi tiết triển khai**: Giúp che giấu các phần không cần thiết của lớp và chỉ cung cấp những gì cần thiết.

---

### **2. Làm thế nào để áp dụng tính đóng gói trong Java?**
Trong Java, ta có thể áp dụng tính đóng gói bằng cách:
1. **Khai báo các thuộc tính của lớp với phạm vi truy cập `private`**, ngăn chặn truy cập trực tiếp từ bên ngoài.
2. **Cung cấp các phương thức `getter` và `setter` với phạm vi truy cập `public` hoặc `protected`** để cho phép đọc/ghi dữ liệu một cách có kiểm soát.

#### **Getter và Setter trong Java**
- **Getter**: Phương thức dùng để lấy giá trị của thuộc tính.
- **Setter**: Phương thức dùng để thiết lập giá trị của thuộc tính, có thể chứa logic kiểm tra hợp lệ.



 3. Ví dụ về tính đóng gói trong Java


 **4. Lợi ích của việc sử dụng tính đóng gói trong việc bảo vệ dữ liệu và kiểm soát quyền truy cập**
- **Bảo vệ dữ liệu khỏi sự thay đổi không mong muốn**: Ví dụ trên đã kiểm tra giá trị `age`, ngăn việc gán giá trị không hợp lệ.
- **Kiểm soát quyền truy cập**: Chỉ các phương thức getter và setter mới có thể truy cập hoặc thay đổi dữ liệu.
- **Giảm sự phụ thuộc giữa các lớp**: Nếu thay đổi cách lưu trữ dữ liệu trong lớp `Person`, các lớp khác không bị ảnh hưởng miễn là phương thức getter/setter không thay đổi.
- **Hỗ trợ bảo trì và mở rộng dễ dàng**: Dễ dàng chỉnh sửa hoặc bổ sung logic kiểm tra mà không ảnh hưởng đến phần còn lại của chương trình.

---

Tóm tắt
Tính đóng gói giúp bảo vệ dữ liệu, kiểm soát quyền truy cập, và tăng tính bảo trì trong lập trình hướng đối tượng. Trong Java, ta sử dụng thuộc tính `private` và cung cấp các phương thức `getter` và `setter` để truy xuất hoặc cập nhật dữ liệu một cách an toàn.*/
    // Ví dụ
    // Lớp Person áp dụng tính đóng gói
    public class Person {
        // Thuộc tính private (không thể truy cập trực tiếp từ bên ngoài)
        private String name;
        private int age;

        // Constructor để khởi tạo đối tượng
        public Person(String name, int age) {
            this.name = name;
            setAge(age); // Sử dụng setter để kiểm tra dữ liệu hợp lệ
        }

        // Getter cho name
        public String getName() {
            return name;
        }

        // Setter cho name
        public void setName(String name) {
            this.name = name;
        }

        // Getter cho age
        public int getAge() {
            return age;
        }

        // Setter cho age (có kiểm tra hợp lệ)
        public void setAge(int age) {
            if (age >= 0) { // Không cho phép tuổi âm
                this.age = age;
            } else {
                System.out.println("Age must be non-negative!");
            }
        }

        // Phương thức hiển thị thông tin
        public void displayInfo() {
            System.out.println("Name: " + name + ", Age: " + age);
        }

        // Main để kiểm tra
        public void main(String[] args) {
            Person p = new Person("John", 25);
            p.displayInfo(); // Output: Name: John, Age: 25

            p.setAge(-5); // Sẽ in ra thông báo lỗi do age âm
            p.setAge(30); // Thay đổi giá trị hợp lệ
            p.displayInfo(); // Output: Name: John, Age: 30
        }
    }

}
