import java.util.Scanner;

public class BMIHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kilonuzu (kg) girin: ");
        double kilo = input.nextDouble();

        System.out.print("Boyunuzu (metre) girin: ");
        double boy = input.nextDouble();

        double bmi = kilo / (boy * boy);

        System.out.printf("Vucut Kitle Indeksiniz (BMI): %.2f%n", bmi);

        // BMI değerlendirmesi
        if (bmi < 18.5) {
            System.out.println("Durum: Zayıf");
        } else if (bmi < 25) {
            System.out.println("Durum: Normal");
        } else if (bmi < 30) {
            System.out.println("Durum: Fazla kilolu");
        } else {
            System.out.println("Durum: Obez");
        }

        input.close();
    }
}
