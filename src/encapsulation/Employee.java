package encapsulation;

public class Employee {

    // default constructor

    public Employee(){


    }

    // instance variables

    private final static int totalEmployee = 10; // final- no one can change it. Private - only accessible in class. Static can not be called

    public static int getTotalEmployee(){
        return totalEmployee;
    }

    /*
    Define information below and Encapsulate them
    fullName
    age
    address
    phone
     */

    private String fullName;
    private int age;
    private String address;
    private String phone;


    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getPhone(){
        return phone;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName ='" + fullName + '\'' +
                ", age ='" + age +
                ", address ='" + address + '\'' +
                ", phone ='" + phone + '\'' +
                '}';
    }
}
