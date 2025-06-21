public class ForecastUtil {
    public static double forecastFutureValue(double presentValue, double growthRate, int years) {
        if (years == 0) {
            return presentValue;
        }
        return forecastFutureValue(presentValue, growthRate, years - 1) * (1 + growthRate);
    }
}
