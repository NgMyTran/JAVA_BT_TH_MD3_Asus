package session4.ra;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestSession6 {
    public static void main(String[] args) {
        //String la k the thay doi-immutable
        //TOPIC 1: lop String, StringBuilder, StringBuffer
        //cach tao 1 chuoi
        String str1 = "tran"; // tao trong String pool cua vung nho heap
//        String str1 = "    ";
        String str2 = "tran"; //gan dia chi cua str1 cho str2
        //in dia chi tham chieu
        System.out.println("dia chi str1 " + System.identityHashCode(str1));
        System.out.println("dia chi str2 " + System.identityHashCode(str2));

        //new: cap phat dong, luon khoi tao vung nho moi trong heap, all vung nho deu co dia chi khac nhau
        String str3 = new String("tran");//tao trong Heap nhung k thuoc String pool
        String str4 = new String("tran");
        System.out.println("dia chi str3 " + System.identityHashCode(str3));
        System.out.println("dia chi str4 " + System.identityHashCode(str4));

        str3 = str1 + "ok";//bat cu thao tac chinh sua chuoi nao khi gan lai deu thay doi vung nho chuoi ban dau
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str1));
        //--> k nen dung str khi co qua nhieu thao tac chinh sua chuoi

        //cac phuong thuc lam viec voi chuoi
        //equalsIgnoreCase: so sanh k phan biet hoa, thuong
        //trim(): bo khoang trang dau, duoi
        //contains: tra ve true flase khi so khop.
//        System.out.println(str1==str2);//true: ss theo dia chi tham
//        System.out.println(str1.equals(str2));//true: equals ss lan luot tung ky tu tai vi tri tg dong
//        System.out.println(str1==str3);//false
        System.out.println(str1.equals(str3));//true

        //cat chuoi
        System.out.println(str1.substring(2));// co the them vi tri ket thuc
        //tach thanh mang
        System.out.println(Arrays.toString(str1.split("a")));
        // tim kiem va thay the
        String abc = "hello, hom nay the nao";
        String o = abc.replace("h", "0");
        System.out.println(o);

        //NOTE:
        System.out.println("str1 start by char t: " + str1.contains("t"));
//        System.out.println(str1.isEmpty());//tru khi chuoi rong , space thi van tra false
//        System.out.println(str1.isBlank());// tra ve true khi la 1 chuoi empty or toan khoang trang


        //StringBuilder & StringBuffer
        StringBuilder str = new StringBuilder("tran ng");
        str.append(("JAVA"), 0, 3);//tran ngJAV
        System.out.println(str);
        str.delete(3, 5);//trangJAV
        System.out.println(str);
        str.insert(3, "n ");//tran ngJAV
        System.out.println(str);

        //StringBuilder & StringBuffer khac nhau:
        // ?????? Thao tac cua StringBuilder: bat dong bo nen can phai dong bo (nhanh hon vi chay da luong, k phai wait), StringBuffer: dong bo-synchronize
        //buffer da luong nen mat time xu ly nhieu hon.
        //Phuong thuc () cua 2 dang giong het nhau


        //TOPIC 2: bieu thuc 9h quy: regex (regular ẽpression): validate du lieu dau vao
        //Pattern: tao ra khuon mau
        //Matcher

        // numberphone bat dau bang 0|+84, theo sau la 9 ky tu so
        String regex = "^(0|\\+84)\\d{9}$";
        Pattern p = Pattern.compile(regex);

        Matcher m = p.matcher("0987644032");
        System.out.println(m.matches());

//        boolean check=Pattern.compile(regex).matcher("0987644032").matches();
//        boolean check=Pattern.matches("0987644032", regex);
        boolean check = "0987644032".matches(regex);

        //tao BT 9h quy cho email (abc@gmail.com/abc@yahoo.com/abc@rikkei.com)
        //phan dau it nhat 1 ky tu
        //dau @
        //duoi gmail.com / yahoo.com / rikkei.com
//        String regex2 = "^[a-zA-Z0-9._%+-]+@(gmail\\.com|yahoo\\.com|rikkei\\.com)$";
        String regexEmail = "^[a-zA-Z]+@(gmail|yahoo|rikkei)\\.com$";
        boolean checkEmail = "ab@gmail,com".matches(regexEmail);
        System.out.println(checkEmail);

        //userName không chứa khoảng trắng hay ký tự đặc biệt, có tối thiểu 6 ký tự
//        String regexUserName = "^[a-zA-Z0-9._]{6,}$";
        String regexUserName = "^[a-zA-Z0-9]{6,}$";
        boolean checkName = "MyTran".matches(regexUserName);
        System.out.println(checkName);
    }
//

}
