package SOLID;


//https://www.youtube.com/watch?v=XI7zep97c-Y&list=PL6W8uoQQ2c61X_9e6Net0WdYZidm7zooW&index=2&ab_channel=Concept%26%26Coding-byShrayansh
// SRP - SINGLE RESPPONSIBILTY PRINCIPLE 
// CLASS SHOULD HAVE ONLY 1 REASON TO CHANGE


/* 
***********Example not using SRP************

public class Employee {
    private String name;
    private int age;
    private double salary;

    // Methods related to employee information
    public void saveEmployeeInformation() {
        // Code to save employee information to database
    }

    public void updateEmployeeInformation() {
        // Code to update employee information in database
    }

    // Methods related to payroll calculations
    public double calculatePay(double hoursWorked, double hourlyRate) {
        return hoursWorked * hourlyRate;
    }

    public void generatePayrollReport() {
        // Code to generate payroll report
    }
}




DHAYAN SE DEKH ............CALCUALTION OF PAYROLL YAHAN KYA KAR RHA HAI ?
YE CLASS SIRF EMPOYEE KI INFORMATION DENE KE LIYE HONI CHAIYE THEN YYYYY IT IS DOING SOME CALCLUATION
............

seperation of concern ke naam pe hum ek class ko multiple classes mein divide kar denge 

WELL IT WAS A EASY EXAMPLE, BUT HOW CAN I KNOW WHICH CLASS IS NOT FOLLOWING SRP ??????

JAB BHI KOI CLASS EK SE JYADA KAAM KR RHI HO TO USSE MULTIPLE CLASS MEIN BAAT TO DO......

BUT if we are just dividing a class into multiple classes. Are we not increasing the complexity? the inheritance level? is it good good bad for the structural integrity?

IGNORE KRENGE KYUINKI MODULARITY BRATI HAI ....JO KI DEBUG MEIN KAAM AA SKTA ....
*/





// Example using SRP

// Employee information management class
 class EmployeeInformationManager {
    private String name;
    private int age;
    private double salary;

    public void saveEmployeeInformation() {
        // Code to save employee information to database
    }

    public void updateEmployeeInformation() {
        // Code to update employee information in database
    }
}

// Payroll calculation class
class Single_Responsibilty {
    public double calculatePay(double hoursWorked, double hourlyRate) {
        return hoursWorked * hourlyRate;
    }

    public void generatePayrollReport() {
        // Code to generate payroll report
    }
}
