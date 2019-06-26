package dbteststuff;

import hotel.Hotel;

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
                /* when we turn AutoCommit to false we need to commit changes mannualy
                if we had a block of updates for an example and the last one
                is misspelled we have the ability to rollback and so there will be no updates from that block and the information in the table will remain unchanged
                 when we let AutoCommit to run free if we take the example from above first updates that are written will change our table and last one will not and it's a major posibility there is a great possibility for the developer to get confused
               */
               /* transactional flow -> block of updates for data that needs to be updated
                non trasactional flow -> fields like : name address that usually don't need to be updated
*/
                /*PreparedStatement preparedStatement=
                        connection.prepareStatement("create table hotels (id int, name varchar(64),date date,luxurious boolean)");
                        preparedStatement.execute();
                        connection.commit();*/

               /* PreparedStatement preparedStatement1 = connection.prepareStatement("insert into hotels (id,name) values (1,'LosToreros')");
                preparedStatement1.execute();
                */
                /*PreparedStatement preparedStatement3 = connection.prepareStatement("insert into hotels (id,name) values (3,'Balcanic')");
                preparedStatement3.execute();
               */
                /*PreparedStatement preparedStatement2 = connection.prepareStatement("insert into hotels(id,name,date,luxurious) values(2,'Agigea','1923-02-23','true')");
                preparedStatement2.execute();
                */
               /* PreparedStatement preparedStatement4 = connection.prepareStatement("delete from hotels where id = ? ");
                preparedStatement4.setInt(1,1);
                preparedStatement4.execute();
               */
               /*PreparedStatement preparedStatement5 = connection.prepareStatement("update hotels set id = ?, name = ?, date = ?, luxurious = ? where id = ?");
               preparedStatement5.setInt(1,2);
               preparedStatement5.setString(2,"CBC");
               preparedStatement5.setDate(3, Date.valueOf("2019-02-23"));
               preparedStatement5.setBoolean(4, Boolean.parseBoolean("false"));
               preparedStatement5.setInt(5,2);
               preparedStatement5.execute();
                connection.commit();
*/
            List<Hotels> hotelsList = new ArrayList<>();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select id,date from hotels");
                System.out.println(resultSet);


            ResultSet resultSet1=statement.executeQuery("select * from hotels");

                while (resultSet1.next()){
                    Hotels hotels = new Hotels();
                    hotels.setId(resultSet1.getInt("id"));
                    hotels.setName(resultSet1.getString("name"));
                    hotels.setDate(resultSet1.getDate("date"));
                    hotels.setLuxurious(resultSet1.getBoolean("luxurious"));
                    hotelsList.add(hotels);
                }
                hotelsList.forEach(System.out::println);
            } catch (SQLException e) {
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
