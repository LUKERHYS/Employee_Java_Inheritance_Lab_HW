package staff;

public abstract class Employee {

    private String name;
    private String niNumber;
    private int salary;

    public Employee(String name, String niNumber, int salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public void setNiNumber(String niNumber) {
        this.niNumber = niNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int raiseSalary(int raisedAmount){
        return this.salary += raisedAmount;
    }

    public double payBonus(){
        return this.salary * 0.01;
    }
}
