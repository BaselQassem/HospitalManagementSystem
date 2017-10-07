package se.humanus.hospital;

public class Staff extends Person{
    private String rolls;
    private String department;

    // Getter and Setter

    public String getRolls() {
        return rolls;
    }

    public void setRolls(String rolls) {

        this.rolls = rolls;
    }

    public String getDepartment() {

        return department;
    }

    public void setDepartment(String department) {

        this.department = department;
    }
}
interface EmployeeDAO {

   /* List <Staff> findAll();
    List<Staff> findById();
    List<Staff> findByName();
    boolean insertEmployee(Staff employee);
    boolean updateEmployee(Staff employee);
    boolean deleteEmployee(Staff employee);
*/
}