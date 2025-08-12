class Employee {
    private String empCode;
    private String name;
    private String designation;
    private double basicPay;    
    public Employee(String empCode, String name, String designation, double basicPay) {
        this.empCode = empCode;
        this.name = name;
        this.designation = designation;
        this.basicPay = basicPay;
    } 
    public void calculateAndPrint() {
        double hra = basicPay * 0.10;
        double da = basicPay * 0.45;
        double totalPay = basicPay + hra + da;        
        System.out.println("Employee Code: " + empCode);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Total Pay: " + totalPay);
        System.out.println("-------------------------------------");
    }
}
public class Practical8 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("E001", "Lucky Panchal", "Manager", 50000);
        Employee emp2 = new Employee("E002", "Tanya Panchal", "Developer", 40000);
        Employee emp3 = new Employee("E003", "Kirtan Panchal", "Analyst", 35000);        
        emp1.calculateAndPrint();
        emp2.calculateAndPrint();
        emp3.calculateAndPrint();
    }
}