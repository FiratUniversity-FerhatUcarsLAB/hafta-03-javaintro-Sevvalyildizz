public class DesenJAVA {
    public static void main(String[] args) {
        String[] J = {
            "  JJJJJ ",
            "     J  ",
            "     J  ",
            "     J  ",
            "J    J  ",
            "J    J  ",
            " JJJJ   "
        };

        String[] A = {
            "   A   ",
            "  A A  ",
            " A   A ",
            " AAAAA ",
            " A   A ",
            " A   A ",
            " A   A "
        };

        String[] V = {
            "V     V",
            "V     V",
            "V     V",
            " V   V ",
            " V   V ",
            "  V V  ",
            "   V   "
        };

        // Her satırı sırayla birleştirip yazdır
        for (int i = 0; i < 7; i++) {
            // Harfler arası boşlukları istediğin gibi ayarlayabilirsin
            System.out.println(J[i] + "  " + A[i] + "  " + V[i] + "  " + A[i]);
        }
    }
}
