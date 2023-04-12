package Third_Task;

import static java.lang.Math.pow;

public class CreditPaymentService {

    public int calculate(int loanAmount, int HowManyMonth) {
        final double interestRate = 0.0999/12;
        double AnnuetCoef = interestRate * pow((1 + (interestRate)), HowManyMonth) / (pow((1 + (interestRate)), HowManyMonth) - 1);
        double MonthlyRate = loanAmount * AnnuetCoef;
        return (int)MonthlyRate;
    }
}
