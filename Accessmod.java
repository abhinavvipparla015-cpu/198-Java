import java.util.ArrayList;
import java.util.HashSet;
import java.util.Arrays;

public class Accessmod {
    public static void main(String[] args) {

        String[] fruitArray = new String[3];
        ArrayList<String> fruitList = new ArrayList<>(); 
        HashSet<String> fruitSet = new HashSet<>();

        fruitArray[0] = "Apple";
        fruitArray[1] = "Banana";
        fruitArray[2] = "Apple"; 
        System.out.println("Array Element at index 1: " + fruitArray[1]);
        System.out.println("Full Array: " + Arrays.toString(fruitArray));

        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Apple"); 
        fruitList.add("Orange"); 
        System.out.println("ArrayList Element at index 3: " + fruitList.get(3));
        System.out.println("Full ArrayList: " + fruitList);
        
        fruitSet.add("Apple");
        fruitSet.add("Banana");
        fruitSet.add("Apple");
        fruitSet.add("Orange");
        System.out.println("Does Set contain 'Apple'?: " + fruitSet.contains("Apple"));
        System.out.println("Full HashSet : " + fruitSet);
    }
}
