package inheritance;

public class Tester extends Person{

public Tester(){

}
public Tester(String fName, String lName, int age, String gender) {
    super(fName, lName, age, gender);
}
   /*
   this.fName = fName;
    this.lName = lName;
    this.age = age;
    this.gender = gender; */

    public void code() {
        System.out.println("Tester codes");
    }


}
