package Session10.ra.bt3VIP.service;

import Session10.ra.bt3VIP.model.Book;
import Session10.ra.bt3VIP.model.Category;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class BookService {
    static List<Book> books = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    private static Book inputData(Category category) {
        String title, author, description;
        int year;
        category = null;

        while (true) {
            System.out.println("Enter book title: ");
            title = scanner.nextLine().trim();

            String finalTitle = title;
            boolean isExists = books.stream().anyMatch(b -> b.getTitle().equalsIgnoreCase(finalTitle));
            if (isExists) {
                System.err.println("Tiêu đề sách đã tồn tại, mời nhập lại");
                continue;
            }

            // Validate title length
            if (title.length() < 6 || title.length() > 50) {
                System.err.println("Tiêu đề sách từ 6-50 kí tự");
                continue;
            }

            break;
        }

        System.out.println("Enter author name: ");
        author = scanner.nextLine().trim();

        // Validate year of publishing
        while (true) {
            System.out.println("Enter publishing year (1970-" + java.time.LocalDate.now().getYear() + "): ");
            String yearInput = scanner.nextLine().trim();

            if (Pattern.matches("^(19[7-9][0-9]|20[0-2][0-9])$", yearInput)) {
                year = Integer.parseInt(yearInput);
                break;
            } else {
                System.err.println("Invalid year input (should be between 1970 and current year)");
            }
        }

        System.out.println("Enter book description: ");
        description = scanner.nextLine().trim();

        // Select category
        while (true) {
            System.out.println("Select category:");
            displayCategories();

            try {
                int categoryIndex = Integer.parseInt(scanner.nextLine().trim());
                if (categoryIndex >= 0 && categoryIndex < CategoryService.categories.size()) {
                    category = CategoryService.categories.get(categoryIndex);
                    break;
                } else {
                    System.err.println("Invalid category selection");
                }
            } catch (NumberFormatException e) {
                System.err.println("Please enter a valid integer.");
            }
        }

        Book newBook = new Book();
        newBook.setTitle(title);
        newBook.setAuthor(author);
        newBook.setYear(year);
        newBook.setDescription(description);
        newBook.setCategory(category);
        return newBook;
    }
    public static void addBook() {
        System.out.println("Thêm mới sách:");
        System.out.println("Danh sách các thể loại sách:");
        displayCategories();

        Category selectedCategory = null;
        while (selectedCategory == null) {
            try {
                System.out.println("Chọn thể loại sách (Nhập số thứ tự): ");
                int categoryIndex = Integer.parseInt(scanner.nextLine().trim());

                if (categoryIndex >= 0 && categoryIndex < CategoryService.categories.size()) {
                    selectedCategory = CategoryService.categories.get(categoryIndex);
                } else {
                    System.err.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                }
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng nhập một số nguyên.");
            }
        }
        Book book = inputData(selectedCategory);

        books.add(book);
        System.out.println("Thêm sách thành công.");
    }

    private static void displayCategories() {
        for (int i = 0; i < CategoryService.categories.size(); i++) {
            System.out.println((i+1) + ". " + CategoryService.categories.get(i).getName());
        }
    }

    public static void updateBook() {
        if (books.isEmpty()) {
            System.out.println("Không có sách để cập nhật.");
            return;
        }

        System.out.println("Nhập id sách cần cập nhật:");
        String idUpdate = scanner.nextLine().trim();
        boolean isFound = false;

        for (Book book : books) {
            if (book.getId().equals(idUpdate)) {
                book = inputData(book.getCategory());
                isFound = true;
                System.out.println("Cập nhật sách thành công.");
                break;
            }
        }
        if (!isFound) {
            System.out.println("Không tìm thấy sách với id: " + idUpdate);
        }
    }

    public static void deleteBook() {
        if (books.isEmpty()) {
            System.out.println("Không có sách để xóa.");
            return;
        }

        System.out.println("Nhập id sách cần xóa:");
        String idDelete = scanner.nextLine().trim();
        boolean isFound = false;

        for (Book book : books) {
            if (book.getId().equals(idDelete)) {
                books.remove(book);
                isFound = true;
                System.out.println("Xóa sách thành công.");
                break;
            }
        }

        if (!isFound) {
            System.out.println("Không tìm thấy sách với id: " + idDelete);
        }
    }

    public static void searchBook() {
        System.out.println("Nhập sách cần tìm kiếm:");
        String searchInput = scanner.nextLine().trim().toLowerCase();
        boolean found = false;

        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(searchInput) || book.getAuthor().toLowerCase().contains(searchInput)) {
                System.out.println(book);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy sách phù hợp.");
        }
    }

    public static void showBookByCategory() {
        if (books.isEmpty()) {
            System.out.println("Không có sách nào để hiển thị.");
            return;
        }

        for (Category category : CategoryService.categories) {
            System.out.println("Thể loại: " + category.getName());
            boolean found = false;

            for (Book book : books) {
                if (book.getCategory().getId() == category.getId()) {
                    System.out.println(book);
                    found = true;
                }
            }

            if (!found) {
                System.out.println("Không có sách thuộc thể loại này.");
            }
        }
    }

    public static void menuBook() {
        boolean isExit = false;
        while (!isExit) {
            System.out.println("" +
                    "➢ ===== QUẢN LÝ SÁCH =====\n" +
                    "1. Thêm mới sách\n" +
                    "2. Cập nhật thông tin sách\n" +
                    "3. Xóa sách\n" +
                    "4. Tìm kiếm sách\n" +
                    "5. Hiển thị danh sách sách theo nhóm thể loại\n" +
                    "6. Quay lại");
            System.out.println("Nhập lựa chọn của bạn: ");
            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng nhập một số nguyên.");
                continue;
            }

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    updateBook();
                    break;
                case 3:
                    deleteBook();
                    break;
                case 4:
                    searchBook();
                    break;
                case 5:
                    showBookByCategory();
                    break;
                case 6:
                    isExit = true;
                    break;
                default:
                    System.out.println("Lựa chọn sai, mời nhập lại!");
            }
        }
    }
}
