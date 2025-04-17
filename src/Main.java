public class Main {
    public static void main(String[] args) {

        User user = new User("Gamma_1234", "Myfreand_1234", "Myfreand_1234");
        System.out.println(User.checkUser(user.getLogin(), user.getPassword(), user.getConfirmPassword()));
    }
}