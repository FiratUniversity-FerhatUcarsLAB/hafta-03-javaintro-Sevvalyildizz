public class ParaBozma {
    public static void main(String[] args) {
        int toplamTutar = 278;
        int kalan = toplamTutar;

        int[] banknotlar = {100, 50, 20, 10, 5, 2, 1};
        int[] adet = new int[banknotlar.length];

        for (int i = 0; i < banknotlar.length; i++) {
            adet[i] = kalan / banknotlar[i];
            kalan = kalan % banknotlar[i];
        }

        System.out.println(toplamTutar + " TL =");
        for (int i = 0; i < banknotlar.length; i++) {
            if (adet[i] > 0) {
                System.out.println(adet[i] + " x " + banknotlar[i]);
            }
        }
    }
}
