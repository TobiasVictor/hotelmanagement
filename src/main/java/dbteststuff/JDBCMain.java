package dbteststuff;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCMain {
    public static void main(String[] args) {

        Connection connection = newConnection("localhost", "5432", "test", "postgres", "naruto143", "postgresql");
        try{
            connection.setAutoCommit(false);

        }catch (SQLException e){
            e.printStackTrace();
        }
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("insert into");
        } catch (SQLException e) {
            e.printStackTrace();
        }

            try {
              //  PreparedStatement preparedStatement = connection.prepareStatement("create table authors (id int, name varchar(64))");
                //preparedStatement.execute();
                connection.commit();

                PreparedStatement preparedStatement1 = connection.prepareStatement("insert into authors (id, name) values (1, 'abc')");
                preparedStatement1.execute();

                connection.commit();

            //    PreparedStatement preparedStatement2
                //    = connection.prepareStatement("delete from authors where id = ?");

              //  preparedStatement2.setInt(1,1);
                //preparedStatement2.execute();
                //connection.commit();
                PreparedStatement preparedStatement3 =
                        connection.prepareStatement("update authors set id = ?, name  = ? where id = ?");
                preparedStatement3.setInt(1,10);
                preparedStatement3.setString(2,"cde");
                preparedStatement3.setInt(3,1);

                preparedStatement3.execute();
                connection.commit();

                Statement statement =
                        connection.createStatement();
                ResultSet resultSet = statement.executeQuery("select * from authors");
                System.out.println(resultSet);
                List<Author>authorList = new ArrayList();
                while (resultSet.next()){
                    Author author = new Author();
                    author.setId(resultSet.getInt("id"));
                    author.setName(resultSet.getString("name"));

                    authorList.add(author);

                }
                authorList.forEach(System.out::println);

            }catch (SQLException e) {
                e.printStackTrace();

            }



    }

    private static Connection newConnection(String host, String port, String dbName, String user, String password, String type) {
        loadDriver();

        String url = "jdbc:" + type + "://" + host + ":" + port + "/" + dbName + "?user=" + user + "&password=" + password;
        System.out.println(url);
        try {
            return DriverManager.getConnection(url);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }

    private static void loadDriver() {
        try {
            Class.forName("org.postgresql.Driver").newInstance();

        } catch (IllegalAccessException | InstantiationException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
