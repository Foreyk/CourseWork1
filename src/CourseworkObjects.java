import java.util.Arrays;
import java.util.stream.Stream;

public class CourseworkObjects {
    public static void database(Employee[] qwerty) {
        for (Employee employee : qwerty) {
            System.out.println(employee);
        }
    }

    public static void costs(Employee[] database) {
        int costsPerMonth = 0;
        for (Employee employee : database) {

            costsPerMonth = costsPerMonth + employee.getSalary();
        }

        System.out.println("Сумма затрат на зарплаты в месяц: " + costsPerMonth);

    }

    private static void minSalary(Employee[] database) {
        Employee employeeMinSalary = null;
        int minSalary = Integer.MAX_VALUE;
        for (Employee employee : database) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                employeeMinSalary = employee;
            }
        }
        System.out.printf("Сотрудник с минимальной зарплатой: \n%s:\n", employeeMinSalary, minSalary);
        //        System.out.println(Arrays.stream(database).map(Employee::getSalary).min(Integer::compareTo).get());


    }

    private static void maxSalary(Employee[] database) {
        int maxSalary = 0;
        Employee employeeMaxSalary = null;
        for (Employee employee : database) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                employeeMaxSalary = employee;
            }
        }
        System.out.printf("Сотрудник с максимальной зарплатой: \n%s:\n", employeeMaxSalary, maxSalary);
//                System.out.println(Arrays.stream(database).map(Employee::getSalary).max(Integer::compareTo).get());
    }


    private static void averageSalary(Employee[] database) {

        int costsPerMonth = 0;
        for (Employee employee : database) {

            costsPerMonth = costsPerMonth + employee.getSalary();
        }

        System.out.println("Среднее значение зарплат: " + costsPerMonth / database.length);

    }

    private static void fullNameAllEmployee(Employee[] database) {
        System.out.println("Имена всех сотрудников: ");
        for (Employee employee : database) {
            System.out.println(employee.getFullName());
        }

    }

    public static void main(String[] args) {


        Employee[] database = new Employee[10];
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

//        database(database);
//        costs(database);
//        minSalary(database);
//        maxSalary(database);
//        averageSalary(database);
//        fullNameAllEmployee(database);


    }


}