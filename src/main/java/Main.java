public class Main {
    public static void main(String[] args) {
        BinOps binOps = new BinOps();
        String sum = binOps.sum("1", "1");
        System.out.println(sum);

        String mult = binOps.mult("10", "10");
        System.out.println(mult);
    }
}
