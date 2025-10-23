public class SaatDonusturme {
    public static void main(String[] args) {
        int toplamSaniye = 3665;

        int saat = toplamSaniye / 3600;
        int dakika = (toplamSaniye % 3600) / 60;
        int saniye = toplamSaniye % 60;

        System.out.printf("%d saniye = %02d:%02d:%02d%n", toplamSaniye, saat, dakika, saniye);
    }
}
