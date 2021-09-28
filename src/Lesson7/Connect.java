package Lesson7;



import com.sun.nio.sctp.SctpSocketOption;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


    public class Connect {
        String database;
        Connect(String database){
            this.database=database;
        }

        Connection getConnection() throws SQLException {
            String url = "jdbc:sqlite:" + database;
            // create a connection to the database
            return DriverManager.getConnection(url);
        }


        public  void connect(String dbname) {
            Connection conn = null;
            try {
                // db parameters
                String url = "jdbc:sqlite:" + dbname;
                // create a connection to the database
                conn = DriverManager.getConnection(url);

                System.out.println("Connection to SQLite has been established.");

            } catch (SQLException e) {
                System.out.println(e.getMessage());
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


        public void createDatadase() {
            Connection conn = null;
            try {
              conn=this.getConnection();
                var statement = conn.createStatement();
                statement.execute("Create table if not exists weather(" +
                        "id integer primary key AUTOINCREMENT  not null," +
                        "weather text not null," +
                        "temperature double not null," +
                        "weatherdate datetime not null" +
                        ");");

                System.out.println("Connection to SQLite has been established.");

            } catch (SQLException e) {
                System.out.println(e.getMessage());
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

        public void ensureDatabaseExists() {
            File f = new File(database);
            if(f.exists() && !f.isDirectory()) {
                this.createDatadase();
            }
        }
    }


