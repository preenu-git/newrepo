package inheritance;

class Class2 extends Class1 {
    double hra, pf;

    Class2(double basicPay, double deduction, double bonus) {
        super(basicPay, deduction, bonus);
    }

    void calcAllowance() {
        hra = 0.05 * basicPay;
        pf = 0.20 * basicPay;
    }
}

