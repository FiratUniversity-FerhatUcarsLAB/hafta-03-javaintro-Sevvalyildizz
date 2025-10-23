public class DonusumTablosu {
    public static void main(String[] args) {
        System.out.println("Mil   Km");
        System.out.println("--------");
        int[] mil = {1, 5, 10, 20, 50};
        for (int m : mil) {
            double km = m * 1.609;
            System.out.printf("%-5d %.3f%n", m, km);
        }
    }
}
