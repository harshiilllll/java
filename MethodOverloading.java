public class MethodOverloading {

    public void show() {                        // with 0 parameters
        System.out.println("Empty");
    }

    public void show(int a) {                   // with 1 parameter
        System.out.println(a);
    }

    public void show(int a, int b) {            // with 2 parameters
        System.out.println(a + b);
    }

    public static void main(String args[]) {
        MethodOverloading sb = new MethodOverloading();

        sb.show();
        sb.show(2);
        sb.show(2, 2);
    }

}
