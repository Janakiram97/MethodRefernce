public class Print {

    public static void main(String[] args) {
        Iprint iprint=Print::print;
        iprint.print("test");

    }
    /*public static void print(String str)
    {
       System.out.println(str);
    }*/
    public static String print(String str)
    {
        System.out.println(str);
        return str;
    }
}
