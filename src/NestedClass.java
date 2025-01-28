public class NestedClass {

    public void test1()
    {
        System.out.println("outerclass");
    }
    public class InnerClass{
        public void test(){
            System.out.println("Inner Class Method");
        }
    }

    public static void main(String[] args) {
        NestedClass outer=new NestedClass();
        InnerClass innerClass = outer.new InnerClass();
        innerClass.test();
        outer.test1();
    }
}
