import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class Q02 {
    public static void main(String[] args) {
    	
        List<String> listOfStrings = new ArrayList<>();
        listOfStrings.add("Debadarshi Omkar");
        listOfStrings.add("Rohit Sharma");
        listOfStrings.add("Yashasvi Jaiswal");
        listOfStrings.add("Virat Kohli");
        listOfStrings.add("Surya Kumar Yadav");
        listOfStrings.add("Sanju Samson");
        listOfStrings.add("Axar Patel");
        listOfStrings.add("Rishabh Pant");
        
        Comparator<String> comparator = (s1, s2) -> Integer.compare(s2.length(), s1.length());

        listOfStrings.sort(comparator);

        System.out.println("Strings after sorting: ");
        for (String s : listOfStrings) 
            System.out.println(s);
    }
}