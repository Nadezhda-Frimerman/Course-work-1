public class Main {

    public static void main(String[] args) {
        int n = 10;

        Employee[] employee = new Employee[n];
        employee[0] = new Employee("Карманова", "Ольга", "Валерьевна", 3, 51200);
        employee[1] = new Employee("Аронова", "Наталья", "Павловна", 1, 32800);
        employee[2] = new Employee("Пиков", "Антон", "Дмитриевич", 5, 37200);
        employee[3] = new Employee("Омутов", "Илья", "Олегович", 2, 43600);
        employee[4] = new Employee("Туманова", "Марина", "Олеговна", 1, 21100);
        employee[5] = new Employee("Петров", "Алексей", "Александрович", 4, 72300);
        employee[6] = new Employee("Сватов", "Александр", "Анатольевич", 3, 54200);
        employee[7] = new Employee("Тунец", "Оксана", "Владимировна", 1, 41200);
        employee[8] = new Employee("Капустин", "Роман", "Иванович", 5, 47300);
        employee[9] = new Employee("Малых", "Вадим", "Петрович", 2, 49100);
        EmployeeBook employeeBook = new EmployeeBook(n);
        employeeBook.addAll(employee);

        employeeBook.printAllEmployees();

        System.out.printf("Сумма затрат на ЗП в месяц: %.2f.%n", employeeBook.sumSalary());
        System.out.printf("Сотрудник с минимальной зарплатой: %s%n", employeeBook.findMinSalaryEmployee());
        System.out.printf("Сотрудник с максимальной зарплатой: %s%n", employeeBook.findMaxSalaryEmployee());
        System.out.printf("Среднее значение ЗП в месяц: %.2f.%n", employeeBook.findAverageSalary());
        employeeBook.printPersonsList();
        int index = 10;
        employeeBook.indexingSalary(index);
        System.out.printf("Индексирование зарплаты на %s процентов.%n", index);
        employeeBook.printAllEmployees();
        int numberOfDepartment = 3;
        System.out.println("Информация по отделу " + numberOfDepartment);
        System.out.printf("Сотрудник с минимальной зарплатой в отделе %s:%n%s%n", numberOfDepartment, employeeBook.findMinSalaryDepartment(numberOfDepartment));
        System.out.printf("Сотрудник с максимальной зарплатой в отделе %s:%n%s%n", numberOfDepartment, employeeBook.findMaxSalaryDepartment(numberOfDepartment));
        System.out.printf("Сумма затрат на ЗП в месяц в отделе %s: %.2f рублей.%n", numberOfDepartment, employeeBook.sumSalaryDepartment(numberOfDepartment));
        System.out.printf("Среднее значение ЗП в месяц в отделе %s: %.2f рублей.%n", numberOfDepartment, employeeBook.findAverageSalaryDepartment(numberOfDepartment));
        int indexDepartment = 5;
        System.out.printf("Индексирование зарплаты отдела %s на %s процентов.%n", numberOfDepartment, indexDepartment);
        employeeBook.indexingSalaryDepartment(indexDepartment, numberOfDepartment);
        employeeBook.printPersonsListDepartment(numberOfDepartment);
        int fixSalary = 50000;
        System.out.printf("Сотрудники, зарплата которых меньше %s %n", fixSalary);
        employeeBook.printEmployeesSalaryLess(fixSalary);
        System.out.printf("Сотрудники, зарплата которых больше %s %n", fixSalary);
        employeeBook.printEmployeesSalaryMore(fixSalary);
        int id = 8;
        System.out.printf("Искомый сотрудник: %s%n", employeeBook.findEmployeeById(id));

    }
}

