package base;

public interface Fiscal {
    default double tax(double profit, double taxRate) {
        return 0;
    }

}

