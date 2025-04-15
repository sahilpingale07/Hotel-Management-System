package Hotel.Management.System;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
public class con {
    Connection connection;
    Statement statement;
    con(){
        try{
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/HotelMS" ,"root","sproot");
            statement=connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
