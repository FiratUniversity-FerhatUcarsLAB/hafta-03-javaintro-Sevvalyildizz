public class BMIHesaplama {
    public static void main(String[] args) {
        double kilo = 45;     // kg
        double boy = 1.65;    // metre

        double bmi = kilo / (boy * boy);

        System.out.printf("Vucut Kitle Indeksiniz (BMI): %.2f%n", bmi);
    }
}

                                            
