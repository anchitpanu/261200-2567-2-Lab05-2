public class Main {
    public static void main(String[] args) {
        User user = new User("Sylvester", 1946,7,6 );
        user.displayDetails();
        user.displayHappyBirthday();

        User John = new User("John", 1954,12,25);
        John.displayDetails();
        John.displayHappyBirthday();

        Admin nicolas = new Admin("Nicolas", 1964,12,25);
        nicolas.displayDetails();
        nicolas.displayDetails(true);
        nicolas.displayDetails(false);
        nicolas.displayHappyBirthday();


    }
}