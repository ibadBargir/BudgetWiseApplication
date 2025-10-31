package budgetWise.com.MySql;

import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.SQLException;
@Component
public class Callingclass {

    public  static  void callProcedure(){
        System.out.println(" Calling Database");

        // Connection kare ge
    Connection connection =   ConnectionDriver.getConnection();
    }
    public static void main(String[] args) throws SQLException {

        System.out.println("Hello how are you ");
        callProcedure();
    }
}
