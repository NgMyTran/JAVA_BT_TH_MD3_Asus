package Session10.ra.BT3.service;

import Session10.ra.BT3.service.BookService;
import Session10.ra.BT3.model.Book;
import Session10.ra.BT3.model.Category;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CategoryService {
    static List<Category> categories = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public Category inputData() {
        String name;
        boolean status;

        while (true) {
            System.out.println("Enter Category's name: ");
            name = scanner.nextLine().trim();

            if (name.length() < 6 || name.length() > 30) {
                System.err.println("Tên thể loại từ 6-30 kí tự");
                continue;
            }
            String finalName = name;
            boolean isExists = categories.stream().anyMatch(c -> c.getName().equalsIgnoreCase(finalName));
            if (isExists) {
                System.err.println("Tên thể loại đã tồn tại");
            } else {
                break;
            }
        }

        while (true) {
            System.out.println("Enter Status (true/false): ");
            String statusInput = scanner.nextLine().trim().toLowerCase();

            if (statusInput.equals("true") || statusInput.equals("false")) {
                status = Boolean.parseBoolean(statusInput);
                break;
            } else {
                System.err.println("Invalid status input (must be true/false)");
            }
        }

        return new Category(name, status);
    }


    public void addCategory() {
        System.out.println("Thêm mới thể loại sách:");
        Category category = inputData();
        categories.add(category);
    }

    public void displayCategories() {
        if (categories.isEmpty()) {
            System.out.println("Không có thể loại sách nào");
            return;
        }
        categories.sort((c1, c2) -> c1.getName().compareToIgnoreCase(c2.getName()));
        for (Category category : categories) {
            System.out.println(category);
        }
    }

    public void countBookInCategory() {
        for (Category category : categories) {
            int count = 0;
            for (int i = 0; i < BookService.books.size(); i++) {
                if (BookService.books.get(i).getCategory().getName().equals(category.getName())) {
                    count++;
                }
            }
            System.out.println(category.getName() + ": " + count + "quyển");
        }
    }

    public void updateCategory() {
        displayCategories();
        System.out.println("Nhập id thể loại cần cập nhật");
        int idUpdate = Integer.parseInt(scanner.nextLine());
        boolean isFound = false;
        for (int i = 0; i < categories.size(); i++) {
            if (categories.get(i).getId() == idUpdate) {
                categories.set(i, inputData());
                isFound = true;
                break;
            }
        }
        if (!isFound) {
            System.err.println("Không tìm thấy thể loại sách với id: " + idUpdate);
        }
    }
    public void deleteCategory() {
        if (categories.isEmpty()) return;

        System.out.println( "Các thể loại hiện có:");
        for (Category category : categories) {
            System.out.println(category.getId() + " " + category.getName());
        }
        System.out.println( "Nhập id thể loại cần xóa:");
        int idDelete = Integer.parseInt(scanner.nextLine());
        Category categoryToDelete = null;
        for (Category category : categories) {
            if (category.getId() == idDelete) {
                categoryToDelete = category;
                break;
            }
        }

        if (categoryToDelete == null) {
            System.err.println("Không có thể loại sách với id: " + idDelete);
        } else {
            boolean hasBooks = BookService.books.stream()
                    .anyMatch(book -> book.getCategory().getId() == idDelete);

            if (hasBooks) {
                System.err.println("Thể loại đang có sách, không thể xóa");
            } else {
                categories.remove(categoryToDelete);
                System.out.println( "Xóa thành công");
            }
        }
    }

    // Add more functionalities as per your requirements (like count books in category, update/delete categories, etc.)
    public void menuCategory() {
        boolean isExit = false;
        while (!isExit) {
            System.out.println("➢ ===== QUẢN LÝ THỂ LOẠI =====\n" +
                    "1.Thêm mới thể loại\n" +
                    "2.Hiển thị danh sách theo tên thể loại A – Z\n" +
                    "3.Thống kê thể loại và số sách có trong mỗi thể loại\n" +
                    "4.Cập nhật thể loại\n" +
                    "5.Xóa thể loại (kiểm tra tồn tai sách trước khi xóa)\n" +
                    "6.Quay lại");
            System.out.println("Nhập lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addCategory();
                    break;
                case 2:
                    displayCategories();
                    break;
                case 3:
                    countBookInCategory();
                    break;
                case 4:
                    updateCategory();
                    break;
                case 5:
                    deleteCategory();
                    break;
                case 6:
                    return;

            }
        }
        }
}
