package inheritance;

public class Class4 extends Class3 {

    Class4(double basicPay, double deduction, double bonus) {
        super(basicPay, deduction, bonus);
    }

    void printSlip() {
        System.out.println("Basic Pay : " + basicPay);
        System.out.println("Deduction : " + deduction);
        System.out.println("Bonus     : " + bonus);
        System.out.println("HRA (5%)  : " + hra);
        System.out.println("PF (20%)  : " + pf);
        System.out.println("Total     : " + total);
    }

    public static void main(String[] args) {
        Class4 emp = new Class4(50000, 2000, 5000);
        emp.calcAllowance();   // Class 2
        emp.calcNetSalary();   // Class 3
        emp.printSlip();       // Class 4
    }
}

