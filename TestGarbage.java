class TestGarbage {
    public void finalize() {
        System.out.println("Garbage is collected");
    }

    public static void main(String args[]) {
        TestGarbage s1 = new TestGarbage();
        TestGarbage s2 = new TestGarbage();
        s1 = null;
        s2 = null;
        System.gc();
    }
}