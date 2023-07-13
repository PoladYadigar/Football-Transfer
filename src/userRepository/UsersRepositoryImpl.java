package userRepository;

import bean.Player;
import bean.SoccerTeam;
import bean.SportingDirector;
import exception.NotFoundUserException;
import service.ManagementServiceImpl;
import util.InputUtil;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

import static queries.UserQuery.*;
import static userRepository.DBConnection.connection;

public class UsersRepositoryImpl implements UsersRepository {


    @Override
    public boolean addPlayer(Player player) {
        try (Connection connection = connection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(ADD_PLAYER);
            preparedStatement.setInt(1, player.getId());
            preparedStatement.setString(2, player.getName());
            preparedStatement.setString(3, player.getSurname());
            preparedStatement.setString(4, player.getPosition());
            preparedStatement.setString(5, player.getExperience());
            preparedStatement.setString(6, player.getTransferValue());
            preparedStatement.setString(7, player.getGmail());
            preparedStatement.setInt(8, player.getPassword());
            preparedStatement.execute();
//           Execute methodu insert'i aktiv edir


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;

    }


    @Override
    public boolean addSportingDirector(SportingDirector sportingDirector) {
        try (Connection connection = connection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(ADD_SPORTING_DIRECTOR);
            preparedStatement.setInt(1, sportingDirector.getId());
            preparedStatement.setString(2, sportingDirector.getName());
            preparedStatement.setString(3, sportingDirector.getSurname());
            preparedStatement.setString(4, sportingDirector.getSoccerTeam());
            preparedStatement.setString(5, sportingDirector.getGmail());
            preparedStatement.setInt(6, sportingDirector.getPassword());
            preparedStatement.execute();


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public List<Player> showAllPlayers() {
        List<Player> player = new LinkedList<>();

        try (Connection connection = connection()) {
            Statement statement = connection.createStatement();
            statement.execute(SHOW_PLAYER);
            ResultSet resultSet = statement.getResultSet();
            if (resultSet.wasNull()) throw new NotFoundUserException();
            while (resultSet.next()) {
                Integer id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                String position = resultSet.getString("position");
                String experience = resultSet.getString("experience");
                String transferValue = resultSet.getString("transfer_value");
                String gmail = resultSet.getString("gmail");
                Integer password = resultSet.getInt("password");
                player.add(new Player(id, name, surname, position, experience, transferValue, gmail, password));
            }
            return player;


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public List<SoccerTeam> showSoccerTeam() {
        try (Connection connection = connection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(SHOW_SOCCER_TEAM);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<SoccerTeam> soccerTeam = new LinkedList<>();
            while (resultSet.next()) {
                Integer id = resultSet.getInt("id");
                String soccerName = resultSet.getString("soccer_name");
                String position = resultSet.getString("position");
                String requestedExperience = resultSet.getString("requested_experience");
                String directorNameSurname = resultSet.getString("director_name_surname");
                String gmail = resultSet.getString("gmail");
                soccerTeam.add(new SoccerTeam(id, soccerName, position, requestedExperience, directorNameSurname, gmail));


            }
            return soccerTeam;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return null;
    }

    @Override
    public List<Player> showGoalkeeperPlayer() {
        try (Connection connection = connection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(SHOW_GOALKEEPER_PLAYER);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Player> player = new LinkedList<>();
            while (resultSet.next()) {
                Integer id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                String position = resultSet.getString("position");
                String experience = resultSet.getString("experience");
                String transferValue = resultSet.getString("transfer_value");
                String gmail = resultSet.getString("gmail");
                Integer password = resultSet.getInt("password");
                player.add(new Player(id, name, surname, position, experience, transferValue, gmail, password));
            }
            return player;


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public List<Player> showDefenderPlayer() {
        try (Connection connection = connection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(SHOW_DEFENDER_PLAYER);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Player> player = new LinkedList<>();
            while (resultSet.next()) {
                Integer id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                String position = resultSet.getString("position");
                String experience = resultSet.getString("experience");
                String transferValue = resultSet.getString("transfer_value");
                String gmail = resultSet.getString("gmail");
                Integer password = resultSet.getInt("password");
                player.add(new Player(id, name, surname, position, experience, transferValue, gmail, password));
            }
            return player;


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public List<Player> showForwardPlayer() {
        try (Connection connection = connection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(SHOW_FORWARD_PLAYER);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Player> player = new LinkedList<>();
            while (resultSet.next()) {
                Integer id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                String position = resultSet.getString("position");
                String experience = resultSet.getString("experience");
                String transferValue = resultSet.getString("transfer_value");
                String gmail = resultSet.getString("gmail");
                Integer password = resultSet.getInt("password");
                player.add(new Player(id, name, surname, position, experience, transferValue, gmail, password));
            }
            return player;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public List<SportingDirector> showSportingDirector() {
        List<SportingDirector> sportingDirectors = new LinkedList<>();

        try (Connection connection = connection()) {
            Statement statement = connection.createStatement();
            statement.execute(SHOW_SPORTING_DIRECTOR);
            ResultSet resultSet = statement.getResultSet();

//            PreparedStatement preparedStatement = connection.prepareStatement(SHOW_SPORTING_DIRECTOR);
//            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Integer id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                String soccerTeam = resultSet.getString("soccer_team");
                String gmail = resultSet.getString("gmail");
                Integer password = resultSet.getInt("password");

                sportingDirectors.add(new SportingDirector(id, name, surname, soccerTeam, gmail, password));

            }
            return sportingDirectors;


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public boolean addSoccerTeam(SoccerTeam soccerTeam) {
        try (Connection connection = connection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(ADD_SOCCER_TEAM);
            preparedStatement.setInt(1, soccerTeam.getId());
            preparedStatement.setString(2, soccerTeam.getSoccerName());
            preparedStatement.setString(3, soccerTeam.getPosition());
            preparedStatement.setString(4, soccerTeam.getRequestedExperience());
            preparedStatement.setString(5, soccerTeam.getDirectorNameSurname());
            preparedStatement.setString(6, soccerTeam.getGmail());
            int count = preparedStatement.executeUpdate();
            return count > 0;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean matchData() {
        ManagementServiceImpl managementService = new ManagementServiceImpl();
        String name = InputUtil.inputTypeString("Name: ");
        String surname = InputUtil.inputTypeString("Surname: ");
        Integer password = InputUtil.inputTypeInteger("Password: ");
        try (Connection connection = connection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(MATCH_WITH_PLAYER);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, surname);
            preparedStatement.setInt(3, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                System.out.println("Successfully Player Entering !");
                managementService.menuForPlayer();
                return true;
            } else {
                preparedStatement = connection.prepareStatement(MATCH_WITH_SPORTING_DIRECTOR);
                preparedStatement.setString(1, name);
                preparedStatement.setString(2, surname);
                preparedStatement.setInt(3, password);
                resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                    System.out.println("Successfully Director Entering !");
                    managementService.menuForDirector();
                    return true;
                }
            }

            throw new NotFoundUserException();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }


}

