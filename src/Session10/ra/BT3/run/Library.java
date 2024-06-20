package Session10.ra.BT3.run;

import Session10.ra.BT3.model.Category;
import Session10.ra.BT3.service.BookService;
import Session10.ra.BT3.service.CategoryService;

import java.util.List;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                boolean isExit = false;
                while (!isExit) {
                    System.out.print("\u001B[H\u001B[2J");
                    System.out.println("➢ ===== QUẢN LÝ THƯ VIỆN =====\n" +
                            "1.Quản lý Thể loại\n" +
                            "2.Quản lý Sách\n" +
                            "3.Thoát");
                    System.out.println("Nhập lựa chọn của bạn: ");
                    int choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            CategoryService categoryService = new CategoryService();
                            categoryService.menuCategory();
                            break;
                        case 2:
//                            BookService bookService = new BookService();
                            BookService.menuBook();
                            break;
                        case 3:
                            System.out.println("Tạm biệt!");
                            isExit = true;
                            break;
                        default:
                            System.out.println("Lựa chọn sai, mời nhập lại!");
                    }

                }
            }

    }

