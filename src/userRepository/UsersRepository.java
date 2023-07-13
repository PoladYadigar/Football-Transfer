package userRepository;

import bean.Player;
import bean.SoccerTeam;
import bean.SportingDirector;

import java.util.List;

public interface UsersRepository {

    boolean addPlayer(Player player);

     boolean addSportingDirector(SportingDirector sportingDirector);

    List<Player> showAllPlayers();

     List<SoccerTeam> showSoccerTeam();
    List<Player> showGoalkeeperPlayer();
    List<Player> showDefenderPlayer();
    List<Player> showForwardPlayer();
    List<SportingDirector> showSportingDirector();
    boolean addSoccerTeam(SoccerTeam soccerTeam);
    boolean matchData();



}
