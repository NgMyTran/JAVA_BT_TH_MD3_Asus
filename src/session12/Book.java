package session12;

import java.util.Date;

//public class Book implements Comparable<Book> {
public class Book {
    private String id, name, content;
    private int totalPage;
    private double price;
    private Date createdAt;

    public Book(String id, String name, String content, int totalPage, double price, Date createdAt) {
        this.id = id;
        this.name = name;
        this.content = content;
        this.totalPage = totalPage;
        this.price = price;
        this.createdAt = createdAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

//    @Override
//    public int compareTo(Book o) {
////        return o.id.compareTo(this.id);
////        return this.totalPage - o.totalPage;
//        return Double.compare(o.price, this.price);
////    return Double.compare(o.price, this.price);
////    return Double.compare(o.price, this.price);
////    return this.createdAt.compareTo(o.createdAt);
//    }
    //int có thể return trực tiếp bằng hiệu 2 số
    //String phải chấm đến compareTo()
    //double và các kiểu nguyên thủy khác nếu muốn so sánh dùng lớp bao bọc.compare()

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
//                ", name='" + name + '\'' +
//                ", content='" + content + '\'' +
                ", totalPage=" + totalPage +
                ", price=" + price +
//                ", createdAt=" + createdAt +
                '}';
    }

}
