/*Problem Statement:
Create a class Employee that models an employee with the following properties:
name, age, salary
Use proper getter and setter methods to provide access to the properties.
Validate that age is not negative and salary is within a valid range (e.g., between 1000 and 100000).
*/
public class Employee {
    // Private properties
    private String name;
    private int age;
    private double salary;

    // Constructor without parameters (Default Constructor)
    public Employee() {
        // You can leave this empty or initialize default values
    }

    // Constructor with parameters to initialize Employee object
    public Employee(String name, int age, double salary) {
        this.name = name;  //direclty Assigned to the name parameter
        this.age = age;
        //    setAge(age);         // Using setter to validate age - validate before assignment
        setSalary(salary);   // Using setter to validate salary
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age with validation
    public void setAge(int age) {
    //    if (age > 0) {
            this.age = age;
      //  } else {
        //    System.out.println("Invalid age. Age must be positive.");
        }
   // }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary with validation
    public void setSalary(double salary) {
        if (salary >= 1000 && salary <= 100000) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary. Salary must be between 1000 and 100000.");
        }
    }

    // Method to display Employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);
    }

    // Main method to test the Employee class
    public static void main(String[] args) {
        // Creating an Employee object using default constructor
        Employee emp1 = new Employee();

        // Setting values using setters
        emp1.setName("John Doe");
        emp1.setAge(30);
        emp1.setSalary(50000);

        // Displaying employee details
        emp1.displayEmployeeDetails();

        // Creating another Employee object using parameterized constructor
        Employee emp2 = new Employee("Jane Smith", -28, 75000);

        // Displaying employee details for emp2
        emp2.displayEmployeeDetails();

        // Testing invalid values
        emp1.setAge(-5);      // Invalid age
        emp1.setSalary(200000); // Invalid salary
    }
}

