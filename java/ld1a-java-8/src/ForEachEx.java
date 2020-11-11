import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ForEachEx {
   public static void main(String[] args) {
      // java7Way();
      java8Way();
   }

   private static void java8Way() {
      Map<Integer, String> hmap = new HashMap<Integer, String>();
      hmap.put(1, "Monkey");
      hmap.put(2, "Dog");
      hmap.put(3, "Cat");
      hmap.put(4, "Lion");
      hmap.put(5, "Tiger");
      hmap.put(6, "Bear");

      hmap.forEach((key,value) -> System.out.println(key));
      hmap.forEach((key,value) -> System.out.println(value));
      hmap.forEach((key,value) -> System.out.println(key + " " + value));
   }
   private static void java7Way() {
      Map<Integer, String> hmap = new HashMap<Integer, String>();
      hmap.put(1, "Monkey");
      hmap.put(2, "Dog");
      hmap.put(3, "Cat");
      hmap.put(4, "Lion");
      hmap.put(5, "Tiger");
      hmap.put(6, "Bear");

      //displaying the keys
      for (Integer key : hmap.keySet()) {
         System.out.println(key);
      }
      //displaying the values
      for (String value : hmap.values()) {
         System.out.println(value);
      }

      Iterator<Map.Entry<Integer,String>> iterator = hmap.entrySet().iterator();
      while(iterator.hasNext()){
         Map.Entry<Integer,String> entry = iterator.next();
         System.out.println(entry.getKey() +  " " + entry.getValue());
      }
   }
}
