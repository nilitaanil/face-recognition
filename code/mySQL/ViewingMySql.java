import java.sql.*;
public class ViewingMySql {
public static void main(String[] args) {
Connection con;
Statement stmt;
ResultSet rs;
try{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con = DriverManager.getConnection("jdbc:odbc:face","root","root");
stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
rs = stmt.executeQuery("SELECT * FROM Humans");
while(rs.next()){
System.out.println(rs.getInt("ID") + " " + rs.getString("LastName") + " " + rs.getString("FirstName"));
}
}catch(Exception e){
System.err.println(e);
}
}
}
