public class Employee {

    String lastName;
    String fisrtName;
    int age;
    String job;
    int salary;
    String phone;

    public Employee(String lastName, String firstName, int age, String job, int salary, String phone){
        this.lastName = lastName;
        this.fisrtName = firstName;
        this.age = age;
        this.job = "Сотрудник";
        this.salary = salary;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFisrtName() {
        return fisrtName;
    }
    public void setFisrtName(String fisrtName) {
        this.fisrtName = fisrtName;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return String.format("Lastname: %s Firstname: %s Age: %d Job: %s Salary: %d Phone: %s", this.lastName, this.fisrtName, this.age, this.job, this.salary, this.phone);
    }
}
