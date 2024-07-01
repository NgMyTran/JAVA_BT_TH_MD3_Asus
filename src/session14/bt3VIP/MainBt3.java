//package session14.bt3VIP;
//
//import session14.bt3VIP.bussiness.DepartmentBussiness;
//import session14.bt3VIP.bussiness.EmployeeBussiness;
//import session14.bt3VIP.entity.Department;
//import session14.bt3VIP.entity.Employee;
//
//import java.util.Scanner;
//
//public class MainBt3 {
//    private final static Scanner sc = new Scanner(System.in);
//    private final static DepartmentBussiness departmentBussiness = new DepartmentBussiness();
//    private final static EmployeeBussiness employeeBussiness = new EmployeeBussiness();
//
//    public static void main(String[] args) {
//            while (true) {
//                System.out.println("************************MUSIC-MANAGEMENT*************************\n" +
//                        "1. Quản lý ca sĩ \n" +
//                        "2. Quản lý bài hát \n" +
////                        "3. Tìm kiếm bài hát\n" +
//                        "4. Thoát");
//                System.out.println("Nhap lua chon cua ban: ");
//                byte choice = Byte.parseByte(sc.nextLine());
//                switch (choice) {
//                    case 1:
//                        showMenuDepartment();
//                        break;
//                    case 2:
//                        showMenuEmployee();
//                        break;
////                    case 3:
////                        showMenuSinger();
////                        break;
//                    default:
//                        System.out.println("Invalid choice. Try again.");
//                        break;
//                }
//            }
//        }
//
//        public static void showMenuDepartment() {
//            while (true) {
//                System.out.println("**********************SINGER-MANAGEMENT*************************\n" +
//                        "1.Nhập vào số lượng ca sĩ cần thêm và nhập thông tin cần thêm mới (có validate dữ liệu nhập vào) \n" +
//                        "2.Hiển thị danh sách tất cả ca sĩ đã lưu trữ \n" +
//                        "3.Thay đổi thông tin ca sĩ theo mã id \n" +
//                        "4.Xóa ca sĩ theo mã id (kiểm tra xem nếu ca sĩ có bài hát thì không xóa được)\n" +
//                        "5.Thoát");
//                System.out.println("Nhap kua chon cua ban: ");
//                byte choice = Byte.parseByte(sc.nextLine());
//                switch (choice) {
//
//                    case 1:
//                        departmentBussiness.create();
//                        break;
//                    case 2:
//                        departmentBussiness.findAll();
//                        break;
//                    case 3:
//                        departmentBussiness.update();
//                        break;
//                    case 4:
//                        departmentBussiness.delete();
//                        break;
//                    case 5:
//                        return;
//                }
//            }
//        }
//
//        public static void showMenuEmployee() {
//            while (true) {
//                System.out.println("**********************SONG-MANAGEMENT*************************\n" +
//                        "1.Nhập vào số lượng bài hát cần thêm và nhập thông tin cần thêm mới (có validate dữ\n" +
//                        "liệu nhập vào) \n" +
//                        "2.Hiển thị danh sách tất cả bài hát đã lưu trữ \n" +
//                        "3.Thay đổi thông tin bài hát theo mã id \n" +
//                        "4.Xóa bài hát theo mã id \n" +
//                        "5.Thoát");
//                System.out.println("Nhap kua chon cua ban: ");
//                byte choice = Byte.parseByte(sc.nextLine());
//                switch (choice) {
//                    Employee employee=null;
//                    case 1:
//                        employeeBussiness.create();
//                        break;
//                    case 2:
//                        employeeBussiness.findAll();
//                        break;
//                case 3:
//                    employeeBussiness;
//                    break;
//                case 4:
//                    employeeBussiness;
//                    break;
//                    case 5:
//                        return;
//                }
//            }
//        }
//    }
//
