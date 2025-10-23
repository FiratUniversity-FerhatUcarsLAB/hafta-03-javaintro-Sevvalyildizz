public class Faktoriyel {
    public static void main(String[] args) {
        int sonuc = 1;

        System.out.print("5! = ");

        for (int i = 5; i >= 1; i--) {
            sonuc *= i;  // çarpma işlemi

            // Ara adımları yazdır
            if (i > 1) {
                System.out.print(i + " × ");
            } else {
                System.out.print(i + " = " + sonuc);
            }
        }
    }
}
