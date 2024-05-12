public class EmployeeBook {
    private final Employee[] employees;

    public EmployeeBook(int n) {
        this.employees = new Employee[n];
    }

    public boolean addNewEmployee(Employee newEmployee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = newEmployee;
                return true;
            }
        }
        return false;
    }

    public void addAll(Employee[] employee) {
        if (employee.length > employees.length) {
            System.out.printf("В штате нехватает вакансий. " +
                    "Прошу уменьшить количество претендентов до %s.%n", employees.length);
        } else {
            for (int i = 0; i < employee.length; i++) {
                addNewEmployee(employee[i]);
            }
        }
    }

    public void deleteEmployee(int idForDelete) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == idForDelete) {
                employees[i] = null;
            }
        }
    }

    public Employee findEmployeeById(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id && employees[i] != null) {
                return employees[i];
            }
        }
        System.out.printf("Сотрудник с id %s не найден.%n", id);
        return null;
    }

    public void printAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public double sumSalary() {
        double sumSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            sumSalary += employees[i].getSalary();
        }
        return sumSalary;
    }

    public Employee findMinSalaryEmployee() {
        Employee minSalaryEmployee = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() != 0 && employees[i].getSalary() < minSalaryEmployee.getSalary()) {
                minSalaryEmployee = employees[i];
            }
        }
        return minSalaryEmployee;
    }

    public Employee findMaxSalaryEmployee() {
        Employee maxSalaryEmployee = employees[0];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalaryEmployee.getSalary()) {
                maxSalaryEmployee = employees[i];
            }
        }
        return maxSalaryEmployee;
    }

    public double findAverageSalary() {
        return sumSalary() / employees.length;
    }

    public void printPersonsList() {
        System.out.println("Список сотрудников:");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getFirstName() + " " + employees[i].getMiddleName() + " " + employees[i].getLastname());
        }
    }

    public void indexingSalary(int index) {
        for (int i = 0; i < employees.length; i++) {
            double newSalary = (1 + (double) index / 100) * employees[i].getSalary();
            employees[i].setSalary(newSalary);
        }
    }

    public Employee[] sortDepartment(int departmentNumber) {
        if (departmentNumber <= 0 || departmentNumber > 5) {
            throw new IllegalArgumentException("Некорректный ввод номера отдела.");
        } else {
            int departmentAmount = 0;
            for (int i = 0; i < employees.length; i++) {
                if (employees[i].getDepartment() == departmentNumber) {
                    departmentAmount++;
                }
            }
            Employee[] departmentEmployees = new Employee[departmentAmount];
            int d = 0;
            for (int i = 0; i < employees.length; i++) {
                if (employees[i].getDepartment() == departmentNumber) {
                    departmentEmployees[d] = employees[i];
                    d++;
                }
            }
            return departmentEmployees;
        }
    }

    public Employee findMinSalaryDepartment(int departmentNumber) {
        Employee[] departmentEmployees = sortDepartment(departmentNumber);
        Employee minSalaryEmployeeDepartment = departmentEmployees[0];
        for (int i = 0; i < departmentEmployees.length; i++) {
            if (departmentEmployees[i].getSalary() != 0 && departmentEmployees[i].getSalary() < minSalaryEmployeeDepartment.getSalary()) {
                minSalaryEmployeeDepartment = departmentEmployees[i];
            }
        }
        return minSalaryEmployeeDepartment;
    }

    public Employee findMaxSalaryDepartment(int departmentNumber) {
        Employee[] departmentEmployees = sortDepartment(departmentNumber);
        Employee maxSalaryEmployeeDepartment = departmentEmployees[0];
        for (int i = 0; i < departmentEmployees.length; i++) {
            if (departmentEmployees[i].getSalary() > maxSalaryEmployeeDepartment.getSalary()) {
                maxSalaryEmployeeDepartment = departmentEmployees[i];
            }
        }
        return maxSalaryEmployeeDepartment;
    }

    public double sumSalaryDepartment(int departmentNumber) {
        Employee[] departmentEmployees = sortDepartment(departmentNumber);
        double sumSalary = 0;
        for (int i = 0; i < departmentEmployees.length; i++) {
            sumSalary += departmentEmployees[i].getSalary();
        }
        return sumSalary;
    }

    public double findAverageSalaryDepartment(int departmentNumber) {
        Employee[] departmentEmployees = sortDepartment(departmentNumber);
        double sumSalary = 0;
        for (int i = 0; i < departmentEmployees.length; i++) {
            sumSalary += departmentEmployees[i].getSalary();
        }
        return sumSalary / departmentEmployees.length;
    }

    public void indexingSalaryDepartment(int index, int departmentNumber) {
        Employee[] departmentEmployees = sortDepartment(departmentNumber);
        for (int i = 0; i < departmentEmployees.length; i++) {
            double newSalary = (1 + (double) index / 100) * departmentEmployees[i].getSalary();
            departmentEmployees[i].setSalary(newSalary);
        }
    }

    public void printPersonsListDepartment(int departmentNumber) {
        System.out.printf("Список сотрудников отдела %s:%n", departmentNumber);
        Employee[] departmentEmployees = sortDepartment(departmentNumber);
        for (int i = 0; i < departmentEmployees.length; i++) {
            System.out.println(departmentEmployees[i].printPersonWithOutDepartment());
        }
    }

    public void printEmployeesSalaryLess(double salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < salary) {
                System.out.println(employees[i].printPersonWithOutDepartment());
            }
        }
    }

    public void printEmployeesSalaryMore(double salary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > salary) {
                System.out.println(employees[i].printPersonWithOutDepartment());
            }
        }
    }

}


