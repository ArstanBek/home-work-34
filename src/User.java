import java.util.Objects;

public class User {
    private String username;
    private String password;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void registerUser(String name, String password) {
        if (name.trim().isEmpty() || password.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя пользователя и пароль не должно быть пустым или содержать пробелы");
        }

        String[] credSplit = (password + name).split("");

        for (String str:credSplit) {
            if (Objects.equals(str, " ")) {
                throw new IllegalArgumentException("Имя пользователя и пароль не должно быть пустым или содержать пробелы");
            }
        }

        if (password.length() < 8) {
            throw new IllegalArgumentException("Пароль должен содержать не менее 8 символов");
        }

        System.out.println("Успешно зарегистрирован");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
