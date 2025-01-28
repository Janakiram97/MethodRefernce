public class NestedStaticClass {

    private static String name="ram";

    public static class innerClass{
        private String age="25";
        public void display()
        {
            System.out.println(name+" "+age);
        }
    }

    public static void main(String[] args) {
        NestedStaticClass.innerClass innerClass=new NestedStaticClass.innerClass();
        innerClass.display();
       /* innerClass innerClass = new innerClass();
        innerClass.display();*/
    }
}
