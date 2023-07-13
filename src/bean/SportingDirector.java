package bean;

import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@Getter
@Setter
//@AllArgsConstructor
public class SportingDirector {
    Integer id;
    String name;
    String surname;
    String soccerTeam;
    String gmail;
    @ToString.Exclude
    Integer password;
}
