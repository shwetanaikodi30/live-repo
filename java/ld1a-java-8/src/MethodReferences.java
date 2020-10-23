import java.util.ArrayList;
import java.util.List;

public class MethodReferences {
	// new features in java8
	// method reference ::
	// forEach() List
	public static void main(String[] args) {
		List<String> namesList = new ArrayList<String>();
		namesList.add("Orange");
		// namesList.add(100);
		namesList.add("Red");
		namesList.add("Green");
		// (File pathname) -> pathname.getName().endsWith(".java")
//	namesList.forEach((item)-> {System.out.println(item);});
		namesList.forEach((item) -> System.out.println(item));
		// use method references to make the make compact
		// the :: is the method reference operator.
		namesList.forEach(System.out::println);
		
		//(System.out::println)
		//(item) -> System.out.println(item)
	}
}
