package session14.test.phuong_thuc_thuc_dinh;

@FunctionalInterface
public interface Shape {
    void printCanh();
//    void draw();

    // phg thuc mac dinh (default) cho phep ghi de o lop trien khai
    default void printColor() {
        System.out.println("black");
    }

    //phg thuc tinh, chi dung truc tiep tu interface
    static void howToColor(){
        System.out.println("how to color");
    }
}
