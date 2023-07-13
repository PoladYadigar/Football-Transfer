package queries;

public class UserQuery {
    public static String ADD_PLAYER = "insert into player  (id,name,surname,position,experience,transfer_value,gmail,password) values (?,?,?,?,?,?,?,?)";
    public static String ADD_SPORTING_DIRECTOR = "insert into sporting_director (id,name,surname,soccer_team,gmail,password) values (?,?,?,?,?,?)";
    public static String SHOW_PLAYER = "select * from player order by player asc ";
    public static String SHOW_GOALKEEPER_PLAYER = "select * from player where position='Goalkeeper' ";
    public static String SHOW_DEFENDER_PLAYER = "select * from player where position='Defender' ";
    public static String SHOW_FORWARD_PLAYER = "select * from player where position='Forward' ";
    public static String ADD_SOCCER_TEAM = "insert into soccer_team (id,soccer_name,position,requested_experience,director_name_surname,gmail) values (?,?,?,?,?,?)";
    public static String SHOW_SOCCER_TEAM = "select * from soccer_team order by soccer_team asc";
    public static String SHOW_SPORTING_DIRECTOR = "select * from sporting_director order by sporting_director asc ";
    public static String MATCH_WITH_PLAYER = "SELECT * FROM player WHERE name = ? AND surname = ? AND password = ?";
    public static String MATCH_WITH_SPORTING_DIRECTOR = "SELECT * FROM sporting_director WHERE name = ? AND surname = ? AND password = ?";

}
