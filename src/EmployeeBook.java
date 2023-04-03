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
            if (employee == null) {
                continue;
            }
            System.out.println(all);

        }
    }

    public double payAllForMonth(Employee[] employee) {
        double sum = 0;
        for (Employee value : this.employee) {
            if(value != null) {
                sum += value.getSalary();
            }
        }
        return sum;
    }

    public void minSalary(Employee[] employee) {
        double minSalary = Integer.MAX_VALUE;
        int target = 0;
        for (int i = 0; i < this.employee.length; i++) {
            if (employee == null) {
                continue;
            }
            if (this.employee[i].getSalary() < minSalary) {
                minSalary = this.employee[i].getSalary();
                target = i;
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой - " + this.employee[target].getFio());
    }

    public void maxSalary(Employee[] employee) {
        double maxSalary = Integer.MIN_VALUE;
        int target = 0;
        for (int i = 0; i < this.employee.length; i++) {
            if (employee == null) {
                continue;
            }
            if (this.employee[i].getSalary() > maxSalary) {
                maxSalary = this.employee[i].getSalary();
                target = i;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой - " + this.employee[target].getFio());
    }

    public double averagePayAllForMonth(Employee[] employee) {
        double i;

        i = payAllForMonth(getEmployee()) / this.employee.length;
        return i;
    }

    public void nameEmployee(Employee[] employee) {
        System.out.println("Список сотрудников:");
        for (int i = 1; i < this.employee.length + 1; i++) {
            if (employee == null) {
                continue;
            }
            System.out.println(i + ") " + this.employee[i - 1].getFio());
        }
    }
}
