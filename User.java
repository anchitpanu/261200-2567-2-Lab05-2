import java.time.LocalDate;

public class User {
    protected String name;
    protected LocalDate dob;

    public User() {}

//    public User(String name, LocalDate dob) {
//        this.name = name;
//        this.dob = LocalDate.now();
//    }

    public User(String name, int year, int month, int day) {
        this.name = name;
        this.dob = LocalDate.of(year, month, day);
    }

//    public String getName(){
//        return name;
//    }
//
//    public void setName() {
//        this.name = name;
//    }
//
//    public LocalDate getDob() {
//        return dob;
//    }
//
//    public void setDob(LocalDate dob) {
//        this.dob = dob;
//    }

    public void displayDetails(){
        System.out.println("User Name: " + name);
        System.out.println("User birthday: " + dob);
    }

    public boolean isBirthday(){
        if (dob.getMonth() == LocalDate.now().getMonth() && dob.getDayOfMonth() == LocalDate.now().getDayOfMonth()) {
            return true;
        } else {
            return false;
        }
    }

    public void displayHappyBirthday() {
        if(isBirthday())
            System.out.println("Happy birthday " + this.name + "!");
    }
}
