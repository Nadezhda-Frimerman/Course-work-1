public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Карманова", "Ольга", "Валерьевна", 3, 51200);
        employees[1] = new Employee("Аронова", "Наталья", "Павловна", 1, 32800);
        employees[2] = new Employee("Пиков", "Антон", "Дмитриевич", 5, 37200);
        employees[3] = new Employee("Омутов", "Илья", "Олегович", 2, 43600);
        employees[4] = new Employee("Туманова", "Марина", "Олеговна", 1, 21100);
        employees[5] = new Employee("Петров", "Алексей", "Александрович", 4, 72300);
        employees[6] = new Employee("Сватов", "Александр", "Анатольевич", 3, 54200);
        employees[7] = new Employee("Тунец", "Оксана", "Владимировна", 1, 41200);
        employees[8] = new Employee("Капустин", "Роман", "Иванович", 5, 47300);
        employees[9] = new Employee("Малых", "Вадим", "Петрович", 2, 49100);

        for (int a = 0; a <= employees.length - 1; a++) {
            System.out.println(employees[a]);
        }
        double sumSalary = 0;
        for (int i = 0; i <= employees.length - 1; i++) {
            sumSalary += employees[i].getSalary();
        }
        System.out.printf("Сумма затрат на ЗП в месяц: %.2f.%n", sumSalary);

        double minSalary = employees[0].getSalary();
        int numberMinSalary = 0;

        for (int i = 0; i < employees.length - 1; i++) {
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                numberMinSalary=i;
            }
        }
        System.out.printf("Сотрудник с минимальной зарплатой: %s%n",employees[numberMinSalary].toString());

        double maxSalary = employees[0].getSalary();
        int numberMaxSalary = 0;

        for (int i = 0; i < employees.length - 1; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                numberMaxSalary=i;
            }
        }
        System.out.printf("Сотрудник с максимальной зарплатой: %s%n",employees[numberMaxSalary].toString());

        double middleSalary= sumSalary/employees.length;
        System.out.printf("Среднее значение ЗП в месяц: %.2f.%n", middleSalary);
        System.out.println("Список сотрудников:");
        for (int i = 0; i < employees.length - 1; i++) {
            System.out.println(employees[i].getFirstName()+" "+employees[i].getMiddleName()+" "+employees[i].getLastname());
        }

    }
}

