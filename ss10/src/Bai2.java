public class Bai2 {
    /*
    * ### **1. Kế thừa là gì? Nó giúp ích gì trong lập trình hướng đối tượng?**
**Kế thừa (Inheritance)** là một trong những nguyên lý cơ bản của lập trình hướng đối tượng (OOP). Nó cho phép một lớp con (subclass) kế thừa các thuộc tính (fields) và phương thức (methods) từ một lớp cha (superclass), giúp tái sử dụng mã nguồn và giảm sự trùng lặp.

**Lợi ích của kế thừa trong lập trình hướng đối tượng:**
- **Tái sử dụng mã nguồn**: Lớp con không cần phải định nghĩa lại các thuộc tính và phương thức đã có trong lớp cha.
- **Dễ mở rộng hệ thống**: Nếu cần thêm tính năng mới, có thể tạo lớp con kế thừa lớp cha mà không làm thay đổi mã nguồn cũ.
- **Tăng tính bảo trì và quản lý mã dễ dàng**: Thay đổi trong lớp cha sẽ được áp dụng cho tất cả lớp con.

---

### **2. Sự khác biệt giữa kế thừa (Inheritance) và đóng gói (Encapsulation) trong Java**
| Đặc điểm       | Kế thừa (Inheritance) | Đóng gói (Encapsulation) |
|---------------|----------------------|--------------------------|
| **Mục đích** | Cho phép một lớp kế thừa thuộc tính và phương thức của lớp khác. | Bảo vệ dữ liệu bằng cách ẩn thông tin và kiểm soát quyền truy cập. |
| **Cách thức hoạt động** | Sử dụng từ khóa `extends` để tạo mối quan hệ cha - con. | Sử dụng các mức truy cập (`private`, `protected`, `public`) và các phương thức getter/setter. |
| **Lợi ích** | Tái sử dụng mã nguồn, giảm trùng lặp code. | Bảo vệ dữ liệu và kiểm soát quyền truy cập. |
| **Ứng dụng** | Khi cần mở rộng hoặc xây dựng các lớp có đặc điểm chung. | Khi cần kiểm soát dữ liệu đầu vào và bảo vệ thông tin bên trong lớp. |

---

### **3. Ví dụ về kế thừa trong Java với từ khóa `extends`**
Dưới đây là ví dụ về một lớp `Animal` (lớp cha) và lớp `Dog` (lớp con) kế thừa từ `Animal`:

```java
// Lớp cha (Superclass)
class Animal {
    String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Phương thức chung
    public void makeSound() {
        System.out.println("Some generic animal sound...");
    }

    // Hiển thị thông tin
    public void displayInfo() {
        System.out.println("Animal name: " + name);
    }
}

// Lớp con (Subclass) kế thừa từ Animal
class Dog extends Animal {
    // Constructor gọi lớp cha bằng từ khóa super
    public Dog(String name) {
        super(name); // Gọi constructor của lớp cha
    }

    // Ghi đè phương thức makeSound()
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

// Lớp Main để kiểm tra
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy");
        myDog.displayInfo();  // Output: Animal name: Buddy
        myDog.makeSound();    // Output: Woof! Woof!
    }
}
```

**Giải thích:**
- Lớp `Animal` có thuộc tính `name` và phương thức `makeSound()`.
- Lớp `Dog` kế thừa từ `Animal` bằng từ khóa `extends`.
- Lớp `Dog` có thể sử dụng phương thức `displayInfo()` của `Animal`.
- Phương thức `makeSound()` được ghi đè (`@Override`) trong `Dog` để thể hiện âm thanh riêng của chó.

---

### **4. Lợi ích và hạn chế của kế thừa trong Java**
#### **Lợi ích của kế thừa**
✅ **Tái sử dụng mã nguồn**: Giúp giảm thiểu việc viết lại code.
✅ **Dễ bảo trì và mở rộng**: Khi cần sửa đổi hoặc mở rộng tính năng, ta chỉ cần thay đổi lớp cha mà không ảnh hưởng nhiều đến lớp con.
✅ **Tăng tính tổ chức và logic**: Giúp phân cấp các lớp trong chương trình một cách có tổ chức.

#### **Hạn chế của kế thừa**
⚠ **Tăng độ phức tạp**: Khi có quá nhiều cấp kế thừa, chương trình trở nên khó hiểu và khó quản lý.
⚠ **Gây phụ thuộc chặt chẽ**: Nếu thay đổi lớp cha, tất cả các lớp con có thể bị ảnh hưởng.
⚠ **Không phù hợp với mọi trường hợp**: Đôi khi, sử dụng **Composition (Thành phần)** có thể là lựa chọn tốt hơn thay vì kế thừa.

---

### **Tóm tắt**
- **Kế thừa** giúp lớp con tái sử dụng mã nguồn từ lớp cha bằng cách dùng từ khóa `extends`.
- **Khác với đóng gói**, kế thừa tập trung vào việc mở rộng và tái sử dụng code, còn đóng gói bảo vệ dữ liệu bên trong lớp.
- **Ví dụ trên** minh họa cách lớp `Dog` kế thừa từ `Animal` và ghi đè phương thức `makeSound()`.
- **Lợi ích** của kế thừa là tái sử dụng mã nguồn, mở rộng dễ dàng, nhưng **hạn chế** là có thể làm chương trình phức tạp và gây phụ thuộc chặt chẽ.  */
}
