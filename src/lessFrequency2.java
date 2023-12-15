import java.util.*;



public class lessFrequency2 {

    public static void main(String[] args) {
        int[] array = {1, 6, 3, 10, 5, 6, 6, 6, 6, 6, 7, 8, 8, 8};

        int keys = 1;
        Map<Integer, Integer> counts = new HashMap<>();

        for (Integer i : array) {

            // System.out.println(i);
            counts.put(keys, i);
            keys++;
        }
        Collection c = counts.values();

        Iterator itr = c.iterator();

        while (itr.hasNext()) {

            System.out.print(itr.next());

        }

        System.out.println(counts);

        List<Integer> cs = new ArrayList<Integer>(counts.values());
        Collections.sort(cs);
        int minVal = cs.get(0);

        Iterator<Integer> itrX = cs.iterator();
        while (itrX.hasNext()) {
            System.out.println(itrX.next());
        }

        int test = Collections.frequency(cs, 7);

        System.out.println("Collection "+Collections.frequency(cs, 6));
        System.out.println(test);

    }
}
