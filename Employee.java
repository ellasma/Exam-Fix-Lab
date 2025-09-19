/**
 * Consider this incomplete Employee class to answer some questions of your exam
 *
 * @author Tassia
 * @version 0.1
 */
public class Employee{
    private String fullname;
    private int yearOfBirth;
    private boolean onLeave;
    private double hourlyWage;
    private double unpaidHours;
    //Get variables for yearOfBirth
    //Set variables to yearOfBirth

    public Employee(String fullname, int yearOfBirth, double hourlyWage){
        this.fullname = fullname;
        this.yearOfBirth = yearOfBirth;
        this.hourlyWage = hourlyWage;
        onLeave = false;
        unpaidHours = 0.0;
    }
    
    /**
     * Returns true is an employee is above 16 years old
     */
    private int calculateAge(int currentYear){
        return (currentYear - yearOfBirth);
    }

    /**
     * Returns true is an employee is above 16 years old
     */
    public boolean canDrive(){
        int age = calculateAge(2025);
        if(age>16){//Output: employee can drive
            System.out.println("Employee can drive");
            return true;
        }
        else {
            System.out.println("Employee can't drive");
            return false;
        }
    }
}
    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    private double calculatePay(){
        // to be completed
        // Get variables for unpaidHours and hourlyWage
        // Set hourlyWage x hours worked=Pay
        // Set tax to 30%
        // Set pay-tax=net pay
        // print net pay
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(){
        // to be completed
        fullname="John Deere";
        // print="John Deere has received a wire transfer of 70 CAD.";
        // reset unpaidHours=0;
    }
}