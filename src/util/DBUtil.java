package util;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * Created by g8.
 * User: tuananh
 * Date: 8/6/13
 * Time: 10:53 PM
 */
public class DBUtil implements Runnable {
    private static Properties properties;

    static {
        try {
            properties = new Properties();
            properties.load(DBUtil.class.getResourceAsStream("/config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Connection connectToDB() {
        Connection connection = null;
        try {
            Class.forName(properties.getProperty("driver")).newInstance();
            connection = DriverManager.getConnection(properties.getProperty("url") + properties.getProperty("dbName"), properties.getProperty("userName"), properties.getProperty("password"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    @Override
    public void run() {
        /*try {

        } catch (Exception e) {
            e.printStackTrace();
        }*/
    }

    public static long getUserId(final String userName, final String token) throws SQLException{
        Connection connection = connectToDB();
        connection.setAutoCommit(false);
        PreparedStatement loadConfig = connection.prepareStatement("SELECT Id, token FROM `user` where userName = ?");
        loadConfig.setString(1, userName);
        ResultSet rs = loadConfig.executeQuery();
        if(rs == null){
            System.out.println("No Data");
            return -1;
        }
        if (rs.next()) {
            System.out.println(rs.getString("token") + "|" + token);
            if(token.equals(rs.getString("token"))) {
                return rs.getLong("Id");
            }
        }
        return -1;
    }

    public static void updateAvatar(final long userId, final String url) throws Exception{

        Connection connection = connectToDB();
        connection.setAutoCommit(true);
        PreparedStatement loadConfig = connection.prepareStatement("UPDATE `user` SET avatar = ? WHERE id= ?");
        loadConfig.setString(1, url);
        loadConfig.setLong(2, userId);
        loadConfig.executeUpdate();
    }
}
