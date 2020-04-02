package model;

public class Angajat {
    private static int totalAnjajati = 0;
    protected String lastName;
    protected String firstName;
    protected String departmentName;
    protected float salary;
    protected int id;
    protected int job_id;

    //functii get
    public int getId(){
        return id;
    }
    public String getLastName() {
        return lastName;
    }
    public float getSalary() {
        return salary;
    }
    public String getFirstName() {
        return firstName;
    }
    public int getJob_id() { return job_id; }
    public String getDepartmentName() { return departmentName; }


    //functii set

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setJob_id(int job_id) { this.job_id = job_id; }
    public void setDepartmentName(String departmentName) { this.departmentName = departmentName; }


    //functie afisare

   // @Override
    public String toStringy(){
        return "Date angajat:\nName: " + firstName + " " + lastName +  "\ndepartment: " + departmentName + "\nid: " + id +  "\nsalary: " + salary + "\njob_id: " + job_id +"\n" + "\n";
    }



    //constructori

    public Angajat(String departmentName, String lastName, float salary, String firstName, int job_id){

        totalAnjajati ++;
        this.departmentName = departmentName;
        this.lastName = lastName;
        this.id = totalAnjajati;
        this.salary = salary;
        this.firstName = firstName;
        this.job_id = job_id;
    }
}
