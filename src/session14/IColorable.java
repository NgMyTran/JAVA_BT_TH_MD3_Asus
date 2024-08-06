package session14;

public interface IColorable {
    void changeColor();

    default void displayColor() {
    }

    ;

    static void returnOldColor() {
    }

    ;
}
