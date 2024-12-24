import java.time.LocalDate;

class Admin extends User {
    public Admin() {
        super();
    }

    public Admin(String name, int year, int month, int day) {
        super(name, year, month, day);
    }

    public void displayDetails(boolean full) {
        if (full) {
            super.displayDetails();
            System.out.println("User type: admin.");
            System.out.println("Today's Date: " + LocalDate.now());
        } else {
            System.out.println("Admin Name: " + this.name);
        }
    }

    public void displayHappyBirthday() {
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - dob.getYear();
        if(isBirthday()) {
            System.out.println("Happy birthday " + this.name + "! You are " + age + "!");
        }
    }
}