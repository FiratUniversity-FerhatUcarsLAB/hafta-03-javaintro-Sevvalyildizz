public class IkiIslem {
    public static void main(String[] args) {
        // Pay hesapla
        double pay = (9.5 * 4.5) - (2.5 * 3);
        // Payda hesapla
        double payda = 45.5 - 3.5;
        // Bölme yap
        double sonuc = pay / payda;
        // 4 ondalık basamak ile formatla ve yazdir
        System.out.printf("%.4f\n", sonuc);
    }
}
