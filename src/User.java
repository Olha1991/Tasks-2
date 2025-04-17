public class User {
    private String login;
    private String password;
    private String confirmPassword;

    public User(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    static boolean checkUser(String login, String password,String confirmPassword) {
        boolean loginMustBe = login.matches("^[a-zA-Z0-9_]+$");
        boolean passwordMustBe = password.matches("^[a-zA-Z0-9_]+$");
        boolean confirmPasswordMustBe = confirmPassword.equals(password);
        if (!loginMustBe || login.length() > 20) {
            try {
                throw new WrongLoginException();
            } catch (WrongLoginException e) {
                System.out.println("Incorrect login!");
            }
        } else if (!passwordMustBe || password.length() > 20) {
            try {
                throw new WrongPasswordException();
            } catch (WrongPasswordException e) {
                System.out.println("Incorrect password!");
            }
        } else if (!confirmPasswordMustBe) {
            try {
                throw new WrongPasswordException();
            } catch (WrongPasswordException e) {
                System.out.println("Confirm password and password do not match!");
            }
        } else System.out.println("User registered!");
        return true;
    }
}
