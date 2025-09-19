package inheritance;

class Class3 extends Class2 {
    double total;

    Class3(double basicPay, double deduction, double bonus) {
        super(basicPay, deduction, bonus);
    }

    void calcNetSalary() {
        total = basicPay + hra - pf - deduction + bonus;
    }
}



