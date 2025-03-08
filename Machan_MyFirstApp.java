import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Machan_MyFirstApp {
  public static void main(String[] args) {
    System.out.println("My name is Jasmine Machan");
    LocalDateTime myDateObj = LocalDateTime.now();
    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    String formattedDate = myDateObj.format(myFormatObj);
    System.out.println("After formatting: " + formattedDate);
  }
}
