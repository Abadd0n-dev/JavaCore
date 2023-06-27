public class Wages extends Employee {
    public static void salaryUpAll(Employee[] employees, int increaseSize) {
        for (Employee employee : employees) {
            if (!(employee instanceof Wages)) {
                employee.setSalary(employee.getSalary() + increaseSize);
            }
        }
    }

    public Wages(String lastName, String firstName, int age, int salary, String phone) {
        super(lastName, firstName, age, firstName, salary, phone);
        this.job = "Руководитель";
    }
}
