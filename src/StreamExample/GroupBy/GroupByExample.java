package StreamExample.GroupBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByExample {

    static class Item {
        String name;
        int qty;

        public Item(String name, int qty) {
            this.name = name;
            this.qty = qty;
        }

        public String getName() {
            return name;
        }

        public int getQty() {
            return qty;
        }
    }

    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item("apple", 10),
                new Item("banana", 20),
                new Item("apple", 15),
                new Item("orange", 10),
                new Item("banana", 25));

        // Grouping by item name and counting the occurrences
        Map<String, Long> counting = items.stream()
                .collect(Collectors.groupingBy(Item::getName, Collectors.counting()));
        System.out.println("Counting: " + counting);
        // Output: Counting: {banana=2, orange=1, apple=2}

        // Grouping by item name and summing the quantities
        Map<String, Integer> sum = items.stream()
                .collect(Collectors.groupingBy(Item::getName, Collectors.summingInt(Item::getQty)));
        System.out.println("Summing: " + sum);
        // Output: Summing: {banana=45, orange=10, apple=25}
    }
}
