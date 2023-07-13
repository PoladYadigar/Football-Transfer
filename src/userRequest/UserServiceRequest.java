package userRequest;

import bean.Player;
import bean.SoccerTeam;
import bean.SportingDirector;
import util.InputUtil;

public class UserServiceRequest {
    public static Player fillPlayer() {
        Integer id=InputUtil.inputTypeInteger("Enter the ID:");
        String name = InputUtil.inputTypeString("Enter the name:");
        String surname = InputUtil.inputTypeString("Enter the surname:");
        String position = InputUtil.inputTypeString("Enter the position:");
        String experience = InputUtil.inputTypeString("Enter the football experience:");
        String transferValue=InputUtil.inputTypeString("Enter the Transfer Value (Billion $):");
        String gmail = InputUtil.inputTypeString("Enter the gmail:");
        Integer password = InputUtil.inputTypeInteger("Enter the password:");
        return new Player(id,name, surname, position, experience,transferValue, gmail,password);

    }
    public static SportingDirector fillSportingDirector(){
        Integer id=InputUtil.inputTypeInteger("Enter the ID:");
        String name = InputUtil.inputTypeString("Enter the name:");
        String surname = InputUtil.inputTypeString("Enter the surname:");
        String soccerTeam=InputUtil.inputTypeString("Enter the soccerTeam:");
        String gmail = InputUtil.inputTypeString("Enter the gmail:");
        Integer password = InputUtil.inputTypeInteger("Enter the password:");

        return new SportingDirector(id,name,surname,soccerTeam,gmail,password);


    }
    public static SoccerTeam fillSoccerTeam(){
        Integer id=InputUtil.inputTypeInteger("Enter the ID:");
        String soccerName = InputUtil.inputTypeString("Enter the  Soccer Name:");
        String position = InputUtil.inputTypeString("Enter the Position:");
        String requestedExperience=InputUtil.inputTypeString("Enter the Requested Experience:");
        String directorNameSurname=InputUtil.inputTypeString("Enter the Director Name:");
        String gmail = InputUtil.inputTypeString("Enter the gmail:");

        return new SoccerTeam(id,soccerName,position,requestedExperience,directorNameSurname,gmail);
    }
}
