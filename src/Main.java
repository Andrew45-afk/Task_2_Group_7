import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("Apple");
        originalList.add("Banana");
        originalList.add("Cherry");
        originalList.add("Date");
        originalList.add("Banana");
        originalList.add("Apple");

        System.out.println("Original List: " + originalList);

        ArrayList<String> listWithoutDuplicates = new ArrayList<>();
        for (String item : originalList) {
            if (!listWithoutDuplicates.contains(item)) {
                listWithoutDuplicates.add(item);
            }
        }

        System.out.println("List after removing duplicates: " + listWithoutDuplicates);

        Stack<String> stack = new Stack<>();
        for (String item : listWithoutDuplicates) {
            stack.push(item);
        }

        ArrayList<String> reversedList = new ArrayList<>();
        while (!stack.isEmpty()) {
            reversedList.add(stack.pop());
        }

        System.out.println("Reversed List: " + reversedList);
    }
}