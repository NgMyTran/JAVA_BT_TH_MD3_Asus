
package Session10.ra.BT3;
import java.util.Scanner;

public class Library {
    private static Category[] categories = new Category[100];
    private static Book[] books = new Book[100];
    private static int categoryCount = 0;
    private static int bookCount = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("===== QUẢN LÝ THƯ VIỆN =====");
            System.out.println("1. Quản lý Thể loại");
            System.out.println("2. Quản lý Sách");
            System.out.println("3. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    manageCategories();
                    break;
                case 2:
                    manageBooks();
                    break;
                case 3:
                    System.out.println("Thoát chương trình.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

    private static void manageCategories() {
        while (true) {
            System.out.println("===== QUẢN LÝ THỂ LOẠI =====");
            System.out.println("1. Thêm mới thể loại");
            System.out.println("2. Hiển thị danh sách theo tên thể loại A – Z");
            System.out.println("3. Thống kê thể loại và số sách có trong mỗi thể loại");
            System.out.println("4. Cập nhật thể loại");
            System.out.println("5. Xóa thể loại");
            System.out.println("6. Quay lại");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                Category.addCategory(scanner);
                break;
                case 2:
                    Category.displayCategories();
                    break;
                case 3:
                    Category.statisticsCategories(categories, books);
                    break;
                case 4:
                    Category.updateCategory(scanner);
                    break;
                case 5:
                    Category.deleteCategory(scanner, books);
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

private static void manageBooks() {
        while (true) {
            System.out.println("===== QUẢN LÝ SÁCH =====");
            System.out.println("1. Thêm mới sách");
            System.out.println("2. Cập nhật thông tin sách");
            System.out.println("3. Xóa sách");
            System.out.println("4. Tìm kiếm sách");
            System.out.println("5. Hiển thị danh sách sách theo nhóm thể loại");
            System.out.println("6. Quay lại");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    Book.addBook(scanner,categories);
                    break;
                case 2:
                    Book.updateBook(scanner);
                    break;
                case 3:
                    Book.deleteBook(scanner, books, bookCount);
                    break;
                case 4:
                    Book.searchBook(scanner, books);
                    break;
                case 5:
                    Book.displayBooksByCategory(books, categories);
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}