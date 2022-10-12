public class EmployeeBook {

    private static final Employee[] database = new Employee[10];

    public static void main(String[] args) {


        database[0] = new Employee("Иванов", "Иван", "Иванович", 1, 150000);
        database[1] = new Employee("Сергеев", "Сергей", "Сергеевич", 4, 218863);
        database[2] = new Employee("Плотников", "Алексей", "Игоревич", 2, 179502);
        database[3] = new Employee("Сергеенко", "Сергей", "Сергеевич", 3, 137556);
        database[4] = new Employee("Калашников", "Илья", "Иванович", 5, 95000);
        database[5] = new Employee("Грегиенко", "Васисий", "Андреевич", 5, 88666);
        database[6] = new Employee("Лебедев", "Максим", "Иванович", 1, 55666);
        database[7] = new Employee("Братенков", "Андрей", "Иванович", 1, 234234);
        database[8] = new Employee("Герасимов", "Валентин", "Германович", 2, 234242);
        database[9] = new Employee("Баранов", "Эдуард", "Михайлович", 4, 15500);

        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("Сумма затрат на зарплаты в месяц: " + costs());
        System.out.println("Среднее значение зарплат: " + averageSalary());
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.printf("Сотрудник с минимальной зарплатой:\n%s", minSalary());
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.printf("Сотрудник с максимальной зарплатой:\n%s", maxSalary());
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        fullNameAllEmployee();
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("Инфо обо всех сотрудниках:");
        database();



    }

    private static void database() {
        for (Employee employee : database) {
            if (employee != null) {
                System.out.println(employee);
            }

        }

    }

    public static int costs() {
        int costsPerMonth = 0;
        for (Employee employee : database) {
            if (employee != null) {
                costsPerMonth += employee.getSalary();
            }
        }
        return costsPerMonth;
    }

    public static Employee minSalary() {
        Employee employeeMinSalary = null;
        int minSalary = Integer.MAX_VALUE;
        for (Employee employee : database) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                employeeMinSalary = employee;
            }
        }
        return employeeMinSalary;
    }

    public static Employee maxSalary() {
        int maxSalary = 0;
        Employee employeeMaxSalary = null;
        for (Employee employee : database) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                employeeMaxSalary = employee;
            }
        }
        return employeeMaxSalary;
    }

    public static Integer averageSalary() {

        int costsPerMonth = 0;
        for (Employee employee : database) {

            costsPerMonth += employee.getSalary();
        }
        costsPerMonth = costsPerMonth / database.length;
        return costsPerMonth;
    }


    private static void fullNameAllEmployee() {
        System.out.println("Имена всех сотрудников: ");
        for (Employee employee : EmployeeBook.database) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }

}