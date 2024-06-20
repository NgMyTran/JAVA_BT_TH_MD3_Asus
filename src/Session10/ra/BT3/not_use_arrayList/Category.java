//package Session10.ra.BT3;
//
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.Scanner;
//
//public class Category {
//    private int id;
//    private String name;
//    private boolean status;
//    private static int idCounter = 1;
//    public static Category[] categories = new Category[0];
//    public Category() {
//        id = idCounter++;
//    }
//
//    public Category(String name, boolean status) {
//        this.id = idCounter++;
//        this.name = name;
//        this.status = status;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//     this.name=name;
//    }
//
//    public boolean isStatus() {
//        return status;
//    }
//
//    public void setStatus(boolean status) {
//        this.status = status;
//    }
//
//    public void inputData(Scanner scanner) {
//            while (true) {
//                System.out.print("Enter category name (6-30 characters): ");
//                name = scanner.nextLine();
//                if (name.length() >= 6 && name.length() <= 30) {
//                    break;
//                } else {
//                    System.out.println("Invalid category name format! Please enter between 6 to 30 characters.");
//                }
//            }
//            while (true) {
//                System.out.print("Enter category status (true/false): ");
//                String statusInput = scanner.nextLine().trim().toLowerCase();
//
//                if (statusInput.equals("true") || statusInput.equals("false")) {
//                    status = Boolean.parseBoolean(statusInput);
//                    break;
//                } else {
//                    System.out.println("Invalid category status format! Please enter 'true' or 'false'.");
//                }
//            }
//    }
//    public void displayData() {
//        System.out.println("ID: " + id + ", Tên: " + name + ", Trạng thái: " + (status ? "Hoạt động" : "Không hoạt động"));
//    }
//
//public static void addCategory(Scanner scanner) {
//    System.out.println("How many categories do you want to input?");
//    int numberInput = Integer.parseInt(scanner.nextLine());
//
//    Category[] newCategories = new Category[categories.length + numberInput];
////    Gan phan tu mang cu sang mang moi
//    System.arraycopy(categories, 0, newCategories, 0, categories.length); // 8 phan tu: 5 phan tu roi
//
//    for (int i = 0; i < numberInput; i++) {
//        Category newCategory= new Category();
//        newCategory.inputData(scanner);
//
//        newCategories[i+categories.length] = newCategory;
//        System.out.println("Thêm thể loại thành công!");
//    }
//    categories = newCategories;
//}
//
//    public static void displayCategories() {
//        if (categories.length == 0) {
//        System.out.println("Danh sách thể loại rỗng.");
//        return;
//    }
//        Category[] sortedCategories = new Category[categories.length];
//        System.arraycopy(categories, 0, sortedCategories, 0, categories.length);
//        for (int i = 0; i < categories.length - 1; i++) {
//            for (int j = i + 1; j < categories.length; j++) {
//                if (sortedCategories[i].getName().compareToIgnoreCase(sortedCategories[j].getName()) > 0) {
//                    Category temp = sortedCategories[i];
//                    sortedCategories[i] = sortedCategories[j];
//                    sortedCategories[j] = temp;
//                }
//            }
//        }
//        for (Category category : sortedCategories) {
//            category.displayData();
//        }
//    }
//
//    public static void statisticsCategories(Category[] categories, Book[] books) {
//        for (Category category : categories) {
//            if (category != null) {
//                int count = 0;
//                for (Book book : books) {
//                    if (book != null && book.getCategory().getId() == category.getId()) {
//                        count++;
//                    }
//                }
//                System.out.println("Thể loại: " + category.getName() + ", Số sách: " + count);
//            }
//        }
//    }
//
//public static void updateCategory(Scanner scanner) {
//        System.out.print("Nhập ID thể loại cần cập nhật: ");
//        int id = scanner.nextInt();
//        scanner.nextLine(); // consume newline
//        for (int i = 0; i < categories.length; i++) {
//            if (categories[i].getId() == id) {
//                categories[i].inputData(scanner);
//                System.out.println("Cập nhật thể loại thành công!");
//                return;
//            }
//        }
//        System.out.println("Không tìm thấy thể loại với ID: " + id);
//    }
//
//    public static void deleteCategory(Scanner scanner, Book[] books) {
//        System.out.print("Nhập ID thể loại cần xóa: ");
//        int id = scanner.nextInt();
//        scanner.nextLine();
//        boolean found = false;
//        for (int i = 0; i < categories.length; i++) {
//            if (categories[i].getId() == id) {
//                boolean hasBooks = false;
//                for (Book book : books) {
//                    if (book != null && book.getCategory().getId() == id) {
//                        hasBooks = true;
//                        break;
//                    }
//                }
//                if (hasBooks) {
//                    System.out.println("Thể loại đang có sách, không thể xóa.");
//                } else {
//                    for (int j = i; j < categories.length - 1; j++) {
//                        categories[j] = categories[j + 1];
//                    }
//                    categories[categories.length - 1] = null; // Clear the last element
//                    System.out.println("Xóa thể loại thành công!");
//                }
//                found = true;
//                break;
//            }
//        }
//
//        if (!found) {
//            System.out.println("Không tìm thấy thể loại với ID: " + id);
//        }
//    }
//
//}
