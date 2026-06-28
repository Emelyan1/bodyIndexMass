public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double testHeight = 1.87;
        int testWeight = 98;
        System.out.println(service.calculate(testHeight, testWeight));
    }
}
