package spicejet_testNG;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import org.testng.annotations.Test;



public class DBConnections {
	public  Connection conn;
	public  Statement stat;
	public  ResultSet rs;
	public void dbconnection() throws Exception
	{
Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
conn=DriverManager.getConnection(
		"jdbc:sqlserver://NAGESH-PC;databasename=Spicejet","SA","sa@123");
stat = conn.createStatement();
rs = stat.executeQuery("select * from EMP where EmpName='Rajesh'");
while(rs.next())
{
	String str=rs.getString("EmpName");
	//System.out.print("EmpId :"+rs.getInt("EmpId"));
	System.out.print(" EmpName :"+str);
	//System.out.print(" EmpSalary :"+rs.getInt("EmpSalary"));
	//System.out.print(" EmpDept :"+rs.getString("EmpDept"));
	System.out.println();
}

}
  @Test
  public void f() throws Exception {
	  dbconnection();
  }
}


//oracle.jdbc.driver.OracleDriver
//connection = DriverManager.getConnection("jdbc:sqlserver://MINDQ-PC;databasename=mq","setAuthentication=true");












