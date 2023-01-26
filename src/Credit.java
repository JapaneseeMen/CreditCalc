public class Credit {

    public double calculate(double sum, double month) {

        double percent = 9.99;
        double cost = 0;
        double degree = Math.pow(1 + (percent / 12 / 100), month);
        double v = sum * ((percent / 12 / 100 * degree) / (degree - 1));
        cost = Math.ceil(v);
        return cost;
    }
}