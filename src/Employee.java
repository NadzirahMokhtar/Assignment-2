/**
 * The type Employee.
 */
public class Employee {

    private String empName;
    private String department;
    private double salary;
    private String email;
    private String  phone;

    /**
     * Instantiates a new Employee.
     *
     * @param empName    the emp name
     * @param department the department
     * @param salary     the salary
     * @param email      the email
     * @param phone      the phone
     */
    public Employee(String empName, String department, double salary, String email, String phone) {
        this.empName = empName;
        this.department = department;
        this.salary = salary;
        this.email = email;
        this.phone = phone;
    }

    /**
     * Gets emp name.
     *
     * @return the emp name
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * Sets emp name.
     *
     * @param empName the emp name
     */
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    /**
     * Gets department.
     *
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets department.
     *
     * @param department the department
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * Gets salary.
     *
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Sets salary.
     *
     * @param salary the salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Gets email.
     *
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets email.
     *
     * @param email the email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets phone.
     *
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets phone.
     *
     * @param phone the phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
}

