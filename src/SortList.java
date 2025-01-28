import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 3, 4, 7, 34, 21, 10);
        System.out.println("before sorting :"+integerList);
        /*Sorting sorting=(list) -> {
            Collections.sort(list);
            };*/
        Sorting sorting=Collections::sort; //using method reference to Collections.sort() method.
        sorting.sort(integerList);
        System.out.println("after sorting :"+ integerList);
    }
}
