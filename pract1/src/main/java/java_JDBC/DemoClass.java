package java_JDBC;
import java.sql.*;
//java database connectivity


/*follow the seven steps
 * import package---java.sql.jar*;
 * load and register the driver--forName com.mysql.jdbc.Driver
 * establish the connection---connection object but connection is an interface so you need to search for the
 * method that will give you instance of connection
 * driver manager is a class
 * create the statement
 * execute the query
 * process the results
 * close connection and statement
 * 
 */
public class DemoClass {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	final String url="";
	final String user="";
	final 	String password="";
	
	
Class.forName("com.mysql.jdbc.Driver");//class forName telusko
Connection con=DriverManager.getConnection(url, user, password);
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("");
while(rs.next()) {
	System.out.println(rs.getInt(1)+""+rs.getString(2));
	
}
st.close();
con.close();
	}

}
