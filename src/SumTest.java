public class SumTest {

    public static void main(String[] args) {
       //Implementation of Sum method in interface using Anonymous class
       /* Sum sum=new Sum() {
            @Override
            public int sum(int a, int b) {
                return a+b;
            }
        };
        int sum1 = sum.sum(10, 10);
        System.out.println(sum1);*/

        //Using lambda function for implementing sum method
        /*Sum sum2= (int a, int b) -> a+b;
        int sum3 = sum2.sum(10, 10);
        System.out.println(sum3);*/

        //1st way
        //Using Method reference for implementing sum method
        /*Sum sum=SumTest::addition;
        int sum1 = sum.sum(10, 10);
        System.out.println(sum1);*/

        //2nd way using already defined methods
        /*Sum sum=Integer::sum;
        int sum1=sum.sum(10, 10);
        System.out.println(sum1);*/
/*
        Sum max = Integer::max;
        int max1 = max.sum(200, 50);
        System.out.println(max1);*/

    }
    //testing git commit

    public int addition(int i, int i1) {
        return i+i1;
    }
}
