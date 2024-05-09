public class EmployeeBook {
    private Employee[] employees;

    public EmployeeBook (Employee[] employees) {
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
    }
    public String toString (){
         return employees.toString();
    }
}