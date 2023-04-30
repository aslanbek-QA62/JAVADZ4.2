public class BmiService {
    public int calculate(float weight, float height) {
        float bmiIndex = weight / (height * height);
        return (int) bmiIndex;
    }
}