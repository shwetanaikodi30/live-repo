import java.util.Arrays;
import java.util.Comparator;

public class ArraySortLambda {
   public static void main(String[] args) {
      // java7ArraySort();
      // java7ArraySortByLength();
      // java7ArraySortByLengthAnonymous();
      java8ArraySortByLength();
   }

   // custom sort
   private static void java8ArraySortByLength() {
      // java.util.Comparator in jdk 1.2
      // Any interface that has only on abstract method is a functional interface.
      // The type of a lambda expression is a functional interface.

      String[] testStrings = new String[3];
      testStrings[0] = "apple";
      testStrings[1] = "hello maverick";
      testStrings[2] = "wow";

      // anonymous instance
      // Comparator sortByLengthComparator = new Comparator<String>() {
      // @Override
      // public int compare(String string1, String string2) {
      // int result = string1.length() - string2.length();
      // // greater +ve //lesser -ve //equal 0
      // return result;
      // }
      // };

      // creating our lambda expression
      // Comparator sortByLengthComparator1 = (String string1, String string2) -> {
      // int result = string1.length() - string2.length();
      // return result;
      // };

      Comparator<String> sortByLengthComparator1 = (String string1, String string2)
      -> {
      return (string1.length() - string2.length());
      };
      // Arrays.sort(testStrings, sortByLengthComparator1);

      // Arrays.sort(testStrings,(String string1, String string2) -> {
      // return (string1.length() - string2.length());
      // });

      // Arrays.sort(testStrings,( string1, string2) -> {
      // return (string1.length() - string2.length());
      // });

      // Arrays.sort(testStrings,(string1, string2) -> {
      // return (string1.length() - string2.length());
      // });

      Arrays.sort(testStrings, (string1, string2) -> string1.length() - string2.length());
      System.out.println(Arrays.asList(testStrings));
   }

   private static void java7ArraySort() {
      String[] testStrings = new String[3];
      testStrings[0] = "hiii";
      testStrings[1] = "wow";
      testStrings[2] = "apple";
      Arrays.sort(testStrings);
      System.out.println(Arrays.asList(testStrings));
   }

   // custom sort
   private static void java7ArraySortByLength() {
      String[] testStrings = new String[3];
      testStrings[0] = "apple";
      testStrings[1] = "hello maverick";
      testStrings[2] = "wow";
      SortByLength sortByLength = new SortByLength();
      Arrays.sort(testStrings, sortByLength);
      System.out.println(Arrays.asList(testStrings));
   }

   // custom sort
   private static void java7ArraySortByLengthAnonymous() {
      String testStrings1[] = new String[] { "apple", "orange", "pear" };

      // anonymous instance of comparator
      Arrays.sort(testStrings1, new Comparator<String>() {
         @Override
         public int compare(String string1, String string2) {
            int result = string1.length() - string2.length();
            // greater +ve //lesser -ve //equal 0
            return result;
         }
      });
      System.out.println(Arrays.asList(testStrings1));
      // anonymous instance of comparator
      Arrays.sort(testStrings1, new Comparator<String>() {
         @Override
         public int compare(String string1, String string2) {
            int result = string2.length() - string1.length();
            // greater +ve //lesser -ve //equal 0
            return result;
         }
      });

      System.out.println(Arrays.asList(testStrings1));
   }
}

// Can be used multiple times in the project.
class SortByLength implements Comparator<String> {
   @Override
   public int compare(String string1, String string2) {
      int result = string1.length() - string2.length();
      // greater +ve //lesser -ve //equal 0
      return result;
   }
}