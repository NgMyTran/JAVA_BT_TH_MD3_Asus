package session11.bt9;

public class Student {
    private int studentId;
    private String studentName;
    private double averageScore;

    public Student() {}
    public Student(int studentId, String studentName, double averageScore) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.averageScore = averageScore;
    }

    public int getStudentId() {return studentId;}
    public String getStudentName() {return studentName;}
    public double getAverageScore() {return averageScore;}

    public void setStudentId(int studentId) {this.studentId = studentId;}
    public void setStudentName(String studentName) {this.studentName = studentName;}
    public void setAverageScore(double averageScore) {this.averageScore = averageScore;}

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + studentName + '\'' +
                ", averageScore=" + averageScore +
                '}';
    }
}
