package challenges;

public class NameSurnameAge {

    public String solution(String name, String surname, int age) {
        StringBuilder sb = new StringBuilder();
        sb.append(name.substring(0, 2));
        sb.append(surname.substring(0, 2));
        sb.append(age);

        return sb.toString();
    }
}
