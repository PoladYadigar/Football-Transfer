package bean;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
public class Player {
    Integer id;
    String name;
    String surname;
    String position;
    String experience;
    String transferValue;
    String gmail;
    @ToString.Exclude
    Integer password;
    public Player(String name, String surname, Integer password) {

    }

    public void showGoalKeeper() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Position: " + position);
        System.out.println("Experience: " + experience);
        System.out.println("Transfer Value: " + transferValue);
        System.out.println("Gmail: " + gmail);
        System.out.println();
    }
}
