public class UcgenHesap {
    public static void main(String[] args) {
        double a = 3;
        double b = 4;
        double c = 5;

        // Üçgenin çevresinin yarısı (Heron formülü için)
        double s = (a + b + c) / 2;

        // Alan hesapla (Heron formülü)
        double alan = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        // Çevre hesapla
        double cevre = a + b + c;

        // Sonuçları yazdır
        System.out.println("Kenarlar: a=" + a + ", b=" + b + ", c=" + c);
        System.out.println("Alan: " + alan);
        System.out.println("Çevre: " + cevre);
    }
}
