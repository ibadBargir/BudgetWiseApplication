package budgetWise.com.MySql;

import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
@Component
public class ConnectionDriver {

   public static Connection connection;


   public static Connection getConnection(){

       try {

           if (connection == null){
         connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "");
       }
       } catch (Exception e){
           e.printStackTrace();
       }
       return connection;
   }
}
