public class Main {
    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.printAllEmployees();
        System.out.println("Месячная выплата всем сотрудникам = " + employeeBook.payAllForMonth(employeeBook.getEmployee()));
        employeeBook.minSalary(employeeBook.getEmployee());
        employeeBook.maxSalary(employeeBook.getEmployee());
        System.out.println("Среднее зарплат всех сотрудников = " + employeeBook.averagePayAllForMonth(employeeBook.getEmployee()));
        employeeBook.nameEmployee(employeeBook.getEmployee());
    }
}

