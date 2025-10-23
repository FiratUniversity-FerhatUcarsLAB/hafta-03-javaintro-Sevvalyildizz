public class HesapOzeti {
    public static void main(String[] args) {
        String urun1 = "Kalem";
        int miktar1 = 2;
        double fiyat1 = 5.5;

        String urun2 = "Defter";
        int miktar2 = 3;
        double fiyat2 = 12.75;

        String urun3 = "Silgi";
        int miktar3 = 1;
        double fiyat3 = 4.25;

        System.out.println("====================================");
        System.out.println("          HESAP OZETI");
        System.out.println("====================================");
        System.out.printf("%-10s %-10s %-10s%n", "Urun", "Miktar", "Fiyat");
        System.out.println("------------------------------------");
        System.out.printf("%-10s %-10d %-10.2f%n", urun1, miktar1, fiyat1);
        System.out.printf("%-10s %-10d %-10.2f%n", urun2, miktar2, fiyat2);
        System.out.printf("%-10s %-10d %-10.2f%n", urun3, miktar3, fiyat3);
        System.out.println("====================================");
    }
}
