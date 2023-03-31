public class EmployeeBook {
    private Employee[] employee;

    public EmployeeBook() {
        this.employee = new Employee[10];
        employee[0] = new Employee("Антонов Андрей Игоревич", 1, 55000);
        employee[1] = new Employee("Иванов Сергей Андреевич", 2, 50000);
        employee[2] = new Employee("Андрианов Владимир Максимыч", 3, 45000);
        employee[3] = new Employee("Антропов Александр Сергеевич", 4, 20000);
        employee[4] = new Employee("Антипов Игорь Николаевич", 5, 40000);
        employee[5] = new Employee("Иванов Семен Борисович", 2, 35000);
        employee[6] = new Employee("Попов Денис Сергеевич", 3, 46000);
        employee[7] = new Employee("Носова Александра Сергеевна", 4, 43600);
        employee[8] = new Employee("Андреева Надежда Игоревна", 3, 67000);
        employee[9] = new Employee("Сидоров Александр Сергеевич", 3, 34700);
    }

    public Employee[] getEmployee() {
        return employee;
    }

    public void printAllEmployees() {
        for (Employee all : employee) {
            System.out.println(all);
        }
    }

    public double payAllForMonth(Employee[] employees) {
        double sum = 0;
        for (Employee value : employees) {
            sum += value.getSalary();
        }
        return sum;
    }

    public void minSalary(Employee[] employees) {
        double minSalary = Integer.MAX_VALUE;
        int target = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                target = i;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой - " + employees[target].getFio());
    }

    public void maxSalary(Employee[] employees) {
        double maxSalary = Integer.MIN_VALUE;
        int target = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                target = i;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой - " + employees[target].getFio());
    }

    public double averagePayAllForMonth(Employee[] employees) {
        double i;
        i = payAllForMonth(getEmployee()) / employees.length;
        return i;
    }

    public void nameEmployee(Employee[] employees) {
        System.out.println("Список сотрудников:");
        for (int i = 1; i < employee.length + 1; i++) {
            System.out.println(i + ") " + employees[i - 1].getFio());
        }
    }
}
