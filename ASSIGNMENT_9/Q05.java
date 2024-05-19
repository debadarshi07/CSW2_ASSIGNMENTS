import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q05 {
	public static boolean startsWithVowel(String string) {
		return "AEIOUaeiou".indexOf(string.charAt(0))!=-1;
	}
	public static void main(String[] args) {
		List<String> list=Arrays.asList("Debadarshi","Virat","Axar","Rohit","Ishan","Sanju","Yashasvi","Umran","Shubhman");
		List<String> newList=list.stream().map(String::toUpperCase).filter(string->!startsWithVowel(string)).collect(Collectors.toList());
		
		newList.forEach(string->System.out.print(string+" "));
	}
}