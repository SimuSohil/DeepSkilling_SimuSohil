public class ForecastTest {
    public static void main(String[] args) {
        double presentValue = 1000.0; // Starting value
        double annualGrowthRate = 0.05; // 5% growth
        int years = 5;

        double futureValue = ForecastUtil.forecastFutureValue(presentValue, annualGrowthRate, years);
        System.out.printf("Future value after %d years: %.2f%n", years, futureValue);
    }
}
