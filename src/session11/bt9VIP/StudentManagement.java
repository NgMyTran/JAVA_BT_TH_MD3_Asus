package session11.bt9VIP;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentManagement {
    private List<Student> studentList;

public StudentManagement() {
    studentList = new ArrayList<Student>();
}
public void showAll(){
    if(studentList.isEmpty()) System.out.println("don't have student");
    for(Student s: studentList){
        System.out.println(s);
    }
}
public void addStudent(Student student) {
    studentList.add(student);
}

public void removeStudent(int studentId) {
    Student foundStudent=null;
    for(Student s: studentList){
        if(s.getStudentId()==studentId){
            foundStudent=s;
            break;
        }
    }
    if(foundStudent!=null){
        studentList.remove(foundStudent);
        System.out.println("Đã xóa sinh viên có mã số " + studentId);
    }else{System.out.println("Không tìm thấy sinh viên có mã số " + studentId);}
}

public Student searchById(int studentId) {
    for (Student s : studentList) {
        if (s.getStudentId() == studentId) {
            return s;
        }
    }
    System.out.println("Không tìm thấy sinh viên có mã số " + studentId);
    return null;
}

    public double getAverageScore(){
    if(studentList.isEmpty()){return 0;}
    double sum=0;
    for(Student s: studentList){
        sum+=s.getAverageScore();
    }
    return sum/studentList.size();
    }

    public void sortByScore(){
        studentList.sort(Comparator.comparingDouble(Student::getAverageScore));
    }
//    public void sortByScore() {
//        for (int i = 0; i < studentList.size() - 1; i++) {
//            for (int j = i + 1; j < studentList.size(); j++) {
//                Student student1 = studentList.get(i);
//                Student student2 = studentList.get(j);
//                if (student1.getAverageScore() > student2.getAverageScore()) {
//                    // Swap student1 and student2
//                    Student temp = student1;
//                    studentList.set(i, student2);
//                    studentList.set(j, temp);
//                }
//            }
//        }
//    }

}
