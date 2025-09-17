public class DemoGrossPay {
    public static void main(String[] args) {
        calculateGross(10.0);
        calculateGross(25.0);
        calculateGross(37.5);
    }

    public static void calculateGross(double hours) {
        double rate = 22.75;
        double pay = hours * rate;
        System.out.println(hours + " hours at $" + rate + " per hour is $" + pay);
    }
}

