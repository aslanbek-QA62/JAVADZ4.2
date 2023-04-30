public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();
        float weight = 98.0f; // в кг
        float height = 1.87f; // в метрах
        int bmiIndex = bmiService.calculate(weight, height);
        System.out.println("Ваш индекс массы тела: " + bmiIndex);
    }
}