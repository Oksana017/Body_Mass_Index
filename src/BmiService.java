public class BmiService {
    public int calculate(int weightKg, double heightMeter) {
        int bmi = (int) (weightKg / Math.pow(heightMeter, 2));
        return bmi;
    }
}
