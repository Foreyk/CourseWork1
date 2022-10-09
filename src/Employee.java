public class Employee {

    static int counter = 0;


    private final String firstName;
    private final String lastName;
    private final String middleName;

    private int department;
    private int salary;

    private int id;


    public Employee(String firstName, String lastName, String middleName, int department, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
        counter++;
        this.id = counter;

    }

    public static int getCounter() {
        return counter;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName + " " + this.middleName;

    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public String toString() {
        return "Ф.И.О.: " + this.getFullName() + "\nОтдел: " + this.department + "\nЗарплата: " + this.salary + " руб.\n" + "ID сотрудника: " + this.id + "\n";
    }


}
