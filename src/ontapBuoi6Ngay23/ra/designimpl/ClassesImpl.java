package ontapBuoi6Ngay23.ra.designimpl;

import ontapBuoi6Ngay23.ra.design.IClassesDesign;
import ontapBuoi6Ngay23.ra.entity.Classes;
import ontapBuoi6Ngay23.ra.util.MyArray;

public class ClassesImpl implements IClassesDesign {
    public static MyArray<Classes> classList = new MyArray<>();

    @Override
    public void add(Classes classes) {
        classList.add(classes);
    }

    @Override
    public Classes findById(String id) {
        for (int i = 0; i < classList.size(); i++) {
            if (classList.get(i).getClassId().equals(id)) {
                return classList.get(i);
            }
        }
        return null;
    }

    @Override
    public void update(Classes classes) {
        classList.set(classList.indexOf(findById(classes.getClassId())), classes);
        System.out.println("Cập nhật thanh công");
    }

    @Override
    public void delete(String id) {
        Classes classes = findById(id);
        if (classes != null) {
            classList.remove(classList.indexOf(classes));
            System.out.println("Đã xóa thành công");
        } else {
            System.err.println("Id không tôn tại");
        }
    }

    @Override
    public void display() {
        if (classList.size() == 0) {
            System.err.println("Danh sách rỗng");
            return;
        }
        for (int i = 0; i < classList.size(); i++) {
            classList.get(i).print();
        }
    }
}