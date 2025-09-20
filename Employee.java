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

    /*
     * Returns the net pay for the outstanding unpaid hours
     * @return net pay
     */
    private double calculatePay(){
        double grossPay = hourlyWage * unpaidHours;
        double tax = grossPay * 0.30;
        double netPay = grossPay - tax;
        
        System.out.println("Net pay: $" + netPay);
        return netPay;
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(){
        double netPay = calculatePay();
        System.out.println(fullname + " has received a wire transfer of $ " + netPay + "CAD.");
        unpaidHours=0.0;
    }
    
    public void addUnpaidHours(double hours){
        if (hours > 0){
            unpaidHours += hours;
        }
    }
    
    
    public static void main(String[] args){
        Employee emp = new Employee("John Deere",2000,20.5);
        emp.canDrive();
        emp.addUnpaidHours(10);
        emp.paySalary();
    }
}