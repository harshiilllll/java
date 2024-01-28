public class Strings {
    public void method() {

        String s = "Java";

        String s1 = new String("Java");

        char c[] = { 'J', 'a', 'v', 'a' };
        String s2 = new String(c);

        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);

    }

    public static void main(String args[]) {

        Strings s = new Strings();
        s.method();

    }
}
