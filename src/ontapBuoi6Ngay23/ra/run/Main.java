package ontapBuoi6Ngay23.ra.run;

import ontapBuoi6Ngay23.ra.design.IClassesDesign;
import ontapBuoi6Ngay23.ra.design.IStudentDesign;
import ontapBuoi6Ngay23.ra.designimpl.ClassesImpl;
import ontapBuoi6Ngay23.ra.designimpl.StudentImpl;
import ontapBuoi6Ngay23.ra.entity.Classes;
import ontapBuoi6Ngay23.ra.entity.Students;
import ontapBuoi6Ngay23.ra.util.InputMethods;

import java.util.Scanner;

public class Main {
    private static IClassesDesign classDesign = new ClassesImpl();
    private static IStudentDesign studentDesign = new StudentImpl();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Menu:\n" +
                    "1. Quản lý lớp học\n" +
                    "2. Quản lý hs\n" +
                    "5. Thoát");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    classesMenu();
                    break;
                case 2:
                    studentMenu();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid choice");

            }
            if (choice == 3) {
                break;
            }
        }
    }

    private static void classesMenu() {
        while (true) {
            System.out.println("menu Classes:\n" +
                    "1. Thêm mới\n" +
                    "2. Hiển thị\n" +
                    "3.Sửa thông tin\n" +
                    "4. Xóa (khi lớp k có hs)\n" +
                    "5. Thoát");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Classes newClass = new Classes();
                    newClass.inputData();
                    classDesign.add(newClass);
                    System.out.println("Thêm mới thành công");
                    break;
                case 2:
                    classDesign.display();
                    break;
                case 3:
                    System.out.println("Nhập id của lớp cần sửa thông tin");
                    String idEdit = InputMethods.getString();
                    // lấy thong tin cu
                    Classes oldClass = classDesign.findById(idEdit);
                    if (oldClass == null) {
                        System.err.println("ID ko tồn tại");
                    } else {
                        // chỉnh sua thông tin
                        System.out.println("Thông tin cũ");
                        oldClass.print();
                        System.out.println("Nhập tên lớp mới");
                        oldClass.setClassName(InputMethods.getString());
                        classDesign.update(oldClass);
                    }
                    break;
                case 4:
                    System.out.println("Nhập id lớp cần xóa");
                    String idDel = InputMethods.getString();
                    classDesign.delete(idDel);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            if (choice == 5) {
                break;
            }
        }
    }

    private static void studentMenu() {
        while (true) {
            System.out.println("menu Classes:\n" +
                    "1. Thêm mới\n" +
                    "2. Hiển thị\n" +
                    "3.Sửa thông tin\n" +
                    "4. Xóa (khi lớp k có hs)\n" +
                    "5. Thoát");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Students s = new Students();
                    s.inputData();
                    studentDesign.add(s);
                    break;
                case 2:
                    studentDesign.display();
                    break;
                case 3:
//                    studentDesign.update();
                    break;
                case 4:
//                    studentDesign.delete();
                    break;
                case 5:
                    studentDesign.getClassWithTotalStudents();
                default:
                    System.out.println("Invalid choice");
            }
            if (choice == 6) {
                break;
            }
        }
    }
}
