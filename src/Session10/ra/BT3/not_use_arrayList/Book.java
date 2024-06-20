////package Session10.ra.BT3;
////
////import java.util.Scanner;
////
////public class Book {
////    private String id;
////    private String title;
////    private String author;
////    private int year;
////    private String description;
////    private Category category;
////
////    public Book() {
////    }
////
////    public Book(String id, String title, String author, int year, String description, Category category) {
////        this.id = id;
////        this.title = title;
////        this.author = author;
////        this.year = year;
////        this.description = description;
////        this.category = category;
////    }
////
////    public String getId() {
////        return id;
////    }
////
////    public void setId(String id) {
////        if (id.startsWith("B") && id.length() == 4) {
////            this.id = id;
////        } else {
////            System.out.println("Mã sách phải bắt đầu bằng 'B' và có độ dài 4 kí tự.");
////        }
////    }
////
////    public String getTitle() {
////        return title;
////    }
////
////    public void setTitle(String title) {
////        if (title.length() >= 6 && title.length() <= 50) {
////            this.title = title;
////        } else {
////            System.out.println("Tiêu đề sách phải từ 6 đến 50 kí tự.");
////        }
////    }
////
////    public String getAuthor() {
////        return author;
////    }
////
////    public void setAuthor(String author) {
////        if (!author.isEmpty()) {
////            this.author = author;
////        } else {
////            System.out.println("Tên tác giả không được bỏ trống.");
////        }
////    }
////
////    public int getYear() {
////        return year;
////    }
////
////    public void setYear(int year) {
////        int currentYear = java.time.Year.now().getValue();
////        if (year >= 1970 && year <= currentYear) {
////            this.year = year;
////        } else {
////            System.out.println("Năm xuất bản phải từ 1970 đến năm hiện tại.");
////        }
////    }
////
////    public String getDescription() {
////        return description;
////    }
////
////    public void setDescription(String description) {
////        if (!description.isEmpty()) {
////            this.description = description;
////        } else {
////            System.out.println("Mô tả sách không được bỏ trống.");
////        }
////    }
////
////    public Category getCategory() {
////        return category;
////    }
////
////    public void setCategory(Category category) {
////        this.category = category;
////    }
////
////    public void inputData(Category[] categories) {Scanner scanner = new Scanner(System.in);
////        System.out.print("Nhập mã sách (bắt đầu bằng 'B', độ dài 4 kí tự): ");
////        setId(scanner.nextLine());
////        System.out.print("Nhập tiêu đề sách (6-50 kí tự): ");
////        setTitle(scanner.nextLine());
////        System.out.print("Nhập tên tác giả: ");
////        setAuthor(scanner.nextLine());
////        System.out.print("Nhập năm xuất bản: ");
////        setYear(scanner.nextInt());
////        scanner.nextLine();
////        System.out.print("Nhập mô tả sách: ");
////        setDescription(scanner.nextLine());
////
////        System.out.println("Chọn thể loại sách từ danh sách dưới đây:");
////        for (Category category : categories) {
////            if (category != null) {
////                category.displayData();
////            }
////        }
////        System.out.print("Nhập ID thể loại: ");
////        int categoryId = scanner.nextInt();
////        for (Category category : categories) {
////            if (category != null && category.getId() == categoryId) {
////                setCategory(category);
////                break;
////            }
////        }
////    }
////
////    private void displayCategoryMenu(Category[] categories) {
////        System.out.println("Danh sách thể loại có sẵn:");
////        for (Category category : categories) {
////            if (category != null) {
////                System.out.println("ID: " + category.getId() + ", Tên: " + category.getName());
////            }
////        }
////    }
////
////    private Category findCategoryById(Category[] categories, String id) {
////        for (Category category : categories) {
////            if (category != null && category.getId() == Integer.parseInt(id)) {
////                return category;
////            }
////        }
////        return null;
////    }
////
////    public void displayData() {
////        System.out.println("Mã sách: " + id);
////        System.out.println("Tựa sách: " + title);
////        System.out.println("Tác giả: " + author);
////        System.out.println("Thể loại: " + category.getName());
////    }
////
////    public static void addBook(Scanner scanner, Book[] books, int bookCount, Category[] categories) {
////        if (bookCount < books.length) {
////            Book book = new Book();
////            book.inputData(categories);
////            books[bookCount++] = book;
////            System.out.println("Thêm sách thành công!");
////        } else {
////            System.out.println("Không thể thêm sách mới, danh sách đã đầy.");
////        }
////    }
////
////    public static void updateBook(Scanner scanner, Book[] books) {
////        System.out.print("Nhập mã sách cần cập nhật: ");
////        String id = scanner.nextLine();
////        for (int i = 0; i < books.length; i++)
////            if (books[i] != null && books[i].getId().equals(id)) {
////                books[i].inputData(new Category[]{books[i].getCategory()});
////                System.out.println("Cập nhật thông tin sách thành công!");
////                return;
////            }
////        System.out.println("Không tìm thấy sách với mã: " + id);
////    }
////
////    public static void deleteBook(Scanner scanner, Book[] books, int bookCount) {
////        System.out.print("Nhập mã sách cần xóa: ");
////        String id = scanner.nextLine();
////        for (int i = 0; i < bookCount; i++) {
////            if (books[i] != null && books[i].getId().equals(id)) {
////                books[i] = books[--bookCount];
////                books[bookCount] = null;
////                System.out.println("Xóa sách thành công!");
////                return;
////            }
////        }
////        System.out.println("Không tìm thấy sách với mã: " + id);
////    }
////
////    public static void searchBook(Scanner scanner, Book[] books) {
////        System.out.print("Nhập từ khóa tìm kiếm: ");
////        String keyword = scanner.nextLine();
////        for (Book book : books) {
////            if (book != null && (book.getTitle().contains(keyword) || book.getAuthor().contains(keyword))) {
////                book.displayData();
////            }
////        }
////    }
////
////    public static void displayBooksByCategory(Book[] books, Category[] categories) {
////        for (Category category : categories) {
////            if (category != null) {
////                System.out.println("Thể loại: " + category.getName());
////                for (Book book : books) {
////                    if (book != null && book.getCategory().getId() == category.getId()) {
////                        book.displayData();
////                    }
////                }
////            }
////        }
////    }
////
//////    public void displayData() {
//////        System.out.println("ID: " + id + ", Tiêu đề: " + title + ", Tác giả: " + author + ", Năm xuất bản: " + year + ", Mô tả: " + description + ", Thể loại: " + category.getName());
//////    }
////
////}
//
//package Session10.ra.BT3;
//
//import java.util.Scanner;
//import java.util.regex.Pattern;
//import static Session10.ra.BT3.Category.categories;
//
//public class Book {
//    private String id;
//    private String title;
//    private String author;
//    private int year;
//    private String description;
//    private Category category;
//    private static Book [] books =new Book[0];
//
//    public Book() {
//    }
//
//    public Book(String id, String title, String author, int year, String description, Category category) {
//        this.id = id;
//        this.title = title;
//        this.author = author;
//        this.year = year;
//        this.description = description;
//        this.category = category;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }
//
//    public int getYear() {
//        return year;
//    }
//
//    public void setYear(int year) {
//        this.year = year;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public Category getCategory() {
//        return category;
//    }
//
//    public void setCategory(Category category) {
//        this.category = category;
//    }
//
//    public void inputData(Scanner scanner) {
////        while (true) {
//            System.out.print("Nhập mã sách (bắt đầu bằng 'B', độ dài 4 kí tự): ");
//            id = scanner.nextLine();
////            if (id.startsWith("B") && id.length() == 4) {
////                break;
////            } else {
////                System.out.println("Nhập lại.");
////            }
////        }
//
//        while (true) {
//            System.out.print("Nhập tiêu đề sách (6-50 kí tự): ");
//            String inputTitle = scanner.nextLine();
//            if (inputTitle.length() >= 6 && inputTitle.length() <= 50) {
//                this.title = inputTitle;
//                break;
//            } else {
//                System.out.println("Tiêu đề sách phải từ 6 đến 50 kí tự.");
//            }
//        }
//
//        while (true) {
//            System.out.print("Nhập tên tác giả: ");
//            String inputAuthor = scanner.nextLine();
//            if (!inputAuthor.isEmpty()) {
//                this.author = inputAuthor;
//                break;
//            } else {
//                System.out.println("Tên tác giả không được bỏ trống.");
//            }
//        }
//
//        int currentYear = java.time.Year.now().getValue();
//        while (true) {
//            System.out.print("Nhập năm xuất bản (1970-" + currentYear + "): ");
//            year = Integer.parseInt(scanner.nextLine().trim());
//            if (!Pattern.matches("^(19[7-9][0-9]|20[0-2][0-9])$", year)) {
//                System.err.println("Năm xuất bản (tối thiểu từ năm 1970 và không lớn hơn năm hiện tại)");
//            } else {
//                this.setYear(Integer.parseInt(year));
//                break;
//            }
//        }
//
//
//        while (true) {
//            System.out.print("Nhập mô tả sách: ");
//            String inputDescription = scanner.nextLine();
//            if (!inputDescription.isEmpty()) {
//                this.description = inputDescription;
//                break;
//            } else {
//                System.out.println("Mô tả sách không được bỏ trống.");
//            }
//        }
//
//        displayCategoryMenu(categories);
//        while (true) {
//            System.out.print("Nhập ID thể loại: ");
//            int categoryId = scanner.nextInt();
//            scanner.nextLine(); // consume newline
//            Category foundCategory = findCategoryById(categories, String.valueOf(categoryId));
//            if (foundCategory != null) {
//                this.category = foundCategory;
//                break;
//            } else {
//                System.out.println("Không tìm thấy thể loại với ID: " + categoryId);
//                displayCategoryMenu(categories);
//            }
//        }
//    }
//
//    private void displayCategoryMenu(Category[] categories) {
//        System.out.println("Danh sách thể loại có sẵn:");
//        for (Category category : categories) {
//            if (category != null) {
//                System.out.println("ID: " + category.getId() + ", Tên: " + category.getName());
//            }
//        }
//    }
//
//    private Category findCategoryById(Category[] categories, String id) {
//        for (Category category : categories) {
//            if (category != null && category.getId() == Integer.parseInt(id)) {
//                return category;
//            }
//        }
//        return null;
//    }
//
//    public void displayData() {
//        System.out.println("Mã sách: " + id);
//        System.out.println("Tựa sách: " + title);
//        System.out.println("Tác giả: " + author);
//        System.out.println("Thể loại: " + category.getName());
//    }
//
//    public static void addBook(Scanner scanner,  Category[] categories) {
//        System.out.println("How many books do you want to input?");
//        int numberInput = Integer.parseInt(scanner.nextLine());
//
//        Book[] newBooks = new Book[books.length + numberInput];
//        System.arraycopy(books, 0, newBooks, 0, books.length);
//
//        for (int i = 0; i < numberInput; i++) {
//            Book book = new Book();
//            book.inputData( scanner);
//
//            newBooks[books.length + i] = book;
//            System.out.println("Thêm sách thành công!");
//        }
//        books = newBooks;
//    }
//
//    public static void updateBook(Scanner scanner) {
//        System.out.print("Nhập mã sách cần cập nhật: ");
//        String id = scanner.nextLine();
//        for (int i = 0; i < books.length; i++) {
//            if (books[i] != null && books[i].getId().equals(id)) {
//                books[i].inputData(scanner);
//                System.out.println("Cập nhật thông tin sách thành công!");
//                return;
//            }
//        }
//        System.out.println("Không tìm thấy sách với mã: " + id);
//    }
//
////    public static void deleteBook(Scanner scanner, Book[] books, int bookCount) {
////        System.out.print("Nhập mã sách cần xóa: ");
////        String id = scanner.nextLine();
////        for (int i = 0; i < bookCount; i++) {
////            if (books[i] != null && books[i].getId().equals(id)) {
////                books[i] = books[--bookCount];
////                books[bookCount] = null;
////                System.out.println("Xóa sách thành công!");
////                return;
////            }
////        }
////        System.out.println("Không tìm thấy sách với mã: " + id);
////    }
//    public static void deleteBook(Scanner scanner, Book[] books, int bookCount) {
//        System.out.print("Nhập mã sách cần xóa: ");
//        String id = scanner.nextLine();
//
//        boolean found = false;
//        for (int i = 0; i < bookCount; i++) {
//            if (books[i] != null && books[i].getId().equals(id)) {
//                // Shift books to remove the book at index i
//                for (int j = i; j < bookCount - 1; j++) {
//                    books[j] = books[j + 1];
//                }
//                books[--bookCount] = null; // Clear the last element
//                System.out.println("Xóa sách thành công!");
//                found = true;
//                return;
//            }
//        }
//
//        if (!found) {
//            System.out.println("Không tìm thấy sách với mã: " + id);
//        }
//    }
//
//
//    public static void searchBook(Scanner scanner, Book[] books) {
//        System.out.print("Nhập từ khóa tìm kiếm: ");
//        String keyword = scanner.nextLine();
//        for (Book book : books) {
//            if (book != null && (book.getTitle().contains(keyword) || book.getAuthor().contains(keyword))) {
//                book.displayData();
//            }
//        }
//    }
//
//    public static void displayBooksByCategory(Book[] books, Category[] categories) {
//        for (Category category : categories) {
//            if (category != null) {
//                System.out.println("Thể loại: " + category.getName());
//                for (Book book : books) {
//                    if (book != null && book.getCategory().getId() == category.getId()) {
//                        book.displayData();
//                    }
//                }
//            }
//        }
//    }
//}