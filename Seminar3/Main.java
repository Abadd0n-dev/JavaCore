public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Фесташкин", "Александр", 24, "Сотрудник", 30000, "+798254648");
        Employee employee2 = new Employee("Тимофеев", "Антон", 21, "Сотрудник", 35000, "+782682548");
        Employee employee3 = new Employee("Самойлов", "Федор", 25, "Сотрудник", 30000, "+725254652");
        Employee employee4 = new Employee("Галицкий", "Иван", 19, "Сотрудник", 20000, "+728625478");
        Employee employee5 = new Employee("Никифоров", "Андрей", 20, "Сотрудник", 20000, "+725642868");

        Employee[] employees = new Employee[] {employee1, employee2, employee3, employee4, employee5};

        Wages.salaryUpAll(employees, 5000);

        System.out.println("Информация о всех сотрудниках:");
        for (Employee e : employees) {
            System.out.println(e.toString());
        }
    }
}
