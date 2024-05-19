import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Q10 {
	public static void main(String[] args) {
		
		LocalDateTime dateTime=LocalDateTime.of(2024,03,15,05,02,35,20000000);
		System.out.println(dateTime);
		
		DateTimeFormatter format=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		System.out.println("Formatted Pattern: "+dateTime.format(format));
	}
}