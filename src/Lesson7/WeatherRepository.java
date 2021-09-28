package Lesson7;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

public class WeatherRepository {
    Connect connector;

    WeatherRepository(Connect connector) {
        this.connector = connector;
    }

    public ArrayList<WeatherRow> getAllRecords(){
        var result = new ArrayList<WeatherRow>();
        Connection conn = null;
        try {
            conn = connector.getConnection();
            var statement = conn.createStatement();

          var rs=  statement.executeQuery("select * from weather;");
            while (rs.next()) {
                var r= new WeatherRow();
                r.id=rs.getInt("id");
                r.weather = rs.getString("weather");
                r.weatherdate = rs.getDate("weatherdate");
                r.temperature = rs.getDouble("temperature");
                result.add(r);
            }

        } catch (SQLException e) {
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return result;
    }

    public void addWeatherRecord(String weather, Date date, Double temp) {
        Connection conn = null;
        try {
            conn = connector.getConnection();
            var statement = conn.prepareStatement("insert into weather(weather,weatherdate,temperature)" +
                    "values(?,?,?);");
            statement.setString(1, weather);
            statement.setDate(2, new java.sql.Date(date.getTime()));
            statement.setDouble(3, temp);
            statement.execute();
        } catch (SQLException e) {
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
