import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public final class Q11 {
    public static void main(String[] args) {
        String utc="2024-05-19T15:30:45Z";
        Instant instant=Instant.parse(utc);

        ZoneId targetZone=ZoneId.of("America/New_York");
        ZonedDateTime targetDateTime=instant.atZone(targetZone);

        DateTimeFormatter format=DateTimeFormatter.ofPattern("yyyy-MM-dd , HH:mm:ss");
        System.out.println("Formatted DateTime: " + targetDateTime.format(format));
    }
}
