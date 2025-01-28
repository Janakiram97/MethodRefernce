import java.util.function.BiFunction;
import java.util.function.Consumer;

public class MRWithInbuiltFunctionalInterface {
    //We can use

    public static void main(String[] args) {
        /*List<Integer> list = Arrays.asList(1,4,8,5,2,20);
        System.out.println("Before sorting :"+list);
        Consumer<List<Integer>> sortingCode= Collections::sort;
        sortingCode.accept(list);
        System.out.println("After sorting :"+list);*/

        /*SumTest sum = new SumTest();
        BiFunction<Integer, Integer, Integer> i = sum::addition;
        Integer i1 = i.apply(1, 1);
        System.out.println("i1 :" + i1);*/


        /*//BiPredicate
        BiPredicate<String,String> comparison= Objects::equals;
        boolean test = comparison.test("ram", "ram12");
        System.out.println("Test :"+test);*/

        Consumer<String> con=System.out::println;
        con.accept("test");

    }


    public static int sum(int a, int b) {
        System.out.println("Sum of " + a + " and " + b + " is :" + (a + b));  //This will print the sum, not return it.
        return a + b;
    }


}
