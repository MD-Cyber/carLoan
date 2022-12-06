public class CarLoan {
    int carLoanAmount ;
    int loanLength;
    int interestRate;
    int downPayment;

    //constructor
    public CarLoan(int loanAmount, int loanLengthInYears, int interestRateInPercentage, int downPaymentp){

        if ( loanLengthInYears <= 0 || interestRateInPercentage <= 0){
            System.out.println("Error!, you must take a vaid car loan.");
        }else if (downPaymentp >= loanAmount){
            System.out.println("The car can be paid in full!");
        }else{
            carLoanAmount = loanAmount;
            loanLength = loanLengthInYears;
            interestRate = interestRateInPercentage;
            downPayment = downPaymentp;

            int remainingBalance = carLoanAmount - downPaymentp;
            int months = loanLength * 12;

            //monthly amount without interest
            int monthlyBalance = remainingBalance / months;

            //interest on monthlybalbance
            int interest = monthlyBalance * interestRate /100;

            //total amount each month
            int monthlyPayment = monthlyBalance + interest;

            //displaying monthly payment
            System.out.println(monthlyPayment);
        }
    }

    public static void main(String[] args){

        //creating a carloan instance called bugati

        CarLoan bugati = new CarLoan(100000, 3, 5, 10000);

        CarLoan test = new CarLoan(10000, 3, 5, 2000);
    }
}
