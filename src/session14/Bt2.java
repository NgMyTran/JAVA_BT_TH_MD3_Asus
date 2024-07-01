package session14;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.TimeZone;

public class Bt2 {
    public static void main(String[] args) {
//        Viết chương trình để lấy ngày hiện tại của hệ thống và các nơi bao gồm : Asia/Tokyo, Australia/Sydney ,America/Sao_Paulo
//        Viết chương trình để lấy thời gian hiện tại (giờ phút giây).
//        Viết chương trình để tính toán số ngày trong tháng hiện tại.
//        Viết chương trình để tính toán số ngày trong năm hiện tại.
//        Viết chương trình để chuyển đổi một chuỗi ngày sang một đối tượng LocalDate.
//        Viết chương trình để chuyển đổi một đối tượng LocalDate sang một chuỗi ngày (dd/MM/yyyy).
//        Viết chương trình để chuyển đổi một đối tượng LocalDateTime sang một chuỗi ngày(dd/MM/yyyy HH:mm:ss).
//        Viết chương trình để so sánh hai ngày LocalDate ( trả về int ).
//        Viết chương trình để so sánh hai thời gian LocalTime.
//        Viết chương trình để thêm hoặc bớt một số ngày, giờ, phút, giây hoặc mili giây vào một ngày hoặc thời gian nhập vào.
//        Viết chương trình để tính toán ngày (LocalDate) tiếp theo hoặc ngày trước đó của một ngày.
        LocalDate today = LocalDate.now();
        System.out.println("Ngày hiện tại của hệ thống: "+today);
        ZoneId asiaTokyo= ZoneId.of("Asia/Tokyo");
        ZoneId australia= ZoneId.of("Australia/Sydney");
        ZoneId americas= ZoneId.of("America/Sao_Paulo");
        LocalDate tokyo= LocalDate.now(asiaTokyo);
        LocalDate sydney= LocalDate.now(australia);
        LocalDate america= LocalDate.now(americas);
        System.out.println("Ngày hiện tại của Tokyo: " + tokyo);
        System.out.println("Ngày hiện tại của Sydney: " + sydney);
        System.out.println("Ngày hiện tại của Sao_Paulo: " + america);

        LocalTime vietNamToday = LocalTime.now();
        System.out.println(vietNamToday);

        int dayInMonth= YearMonth.now().lengthOfMonth();
        System.out.println(dayInMonth);

        int dayInYear= Year.now().length();
        System.out.println(dayInYear);

        String dateStr="2024-06-25";
        LocalDate parseDay = LocalDate.parse(dateStr);
        System.out.println(parseDay);

        DateTimeFormatter formatToday= DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(formatToday.format(today));

       LocalDateTime dateTime=LocalDateTime.now();
       DateTimeFormatter dateTimeFormatter= DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
       String strDateTime= dateTime.format(dateTimeFormatter);
       System.out.println("Chuỗi ngày giờ từ LocalDateTime: " + strDateTime);

// C1      LocalDate date1= LocalDate.of(2024, 6,25);
//       LocalDate date2= LocalDate.now();
//       int comparisonResult= date1.compareTo(date2);
//        if (comparisonResult < 0) {
//            System.out.println(date1 + " trước " + date2);
//        } else if (comparisonResult > 0) {
//            System.out.println(date1 + " sau " + date2);
//        } else {
//            System.out.println(date1 + " bằng " + date2);
//        }
        //C2
        LocalDate date1= LocalDate.of(2024, 6,25);
        LocalDate date2= LocalDate.of(2023, 6,26);
        long elapseDate= Math.abs(ChronoUnit.DAYS.between(date1, date2));
        System.out.println(elapseDate);

        LocalDateTime now= LocalDateTime.now();
        System.out.println(now);
        System.out.println(now.plusDays(6).plusHours(10).plusMinutes(10).plus(10, ChronoUnit.MICROS));
    }
}
