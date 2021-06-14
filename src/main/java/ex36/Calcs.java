package ex36;

public class Calcs {
    public static double Average(double d1, double d2) {
        return d1 + d2/2;
    }

    public static double Minimum(double d1, double d2) {
        double min = Math.min(d1, d2);
        return min;
    }

    public static double Maximum(double d1, double d2) {
        double max = Math.max(d1, d2);
        return max;
    }

    public static double StdDeviation(double d1, double d2) {
        double sum = 0.0, standardDeviation = 0.0;
        int length = numArray.length;

        for(double num : numArray) {
            sum += num;
        }

        double mean = sum/length;

        for(double num: numArray) {
            standardDeviation += Math.pow(num - mean, 2);
        }

        return Math.sqrt(standardDeviation/length);
    }
}
