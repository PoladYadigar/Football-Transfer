package bean;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString

public class SoccerTeam {
    Integer id;
    String soccerName;
    String position;
    String requestedExperience;
    String directorNameSurname;
    String gmail;

}
