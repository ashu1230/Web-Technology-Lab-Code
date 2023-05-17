import java.sql.*;  
class Test {  
  public static void main(String args[]){  
    try{  
      Class.forName("com.mysql.jdbc.Driver");  
      Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","mysql");  
      //here sonoo is database name, root is username and password  
      Statement stmt=con.createStatement();  

      String query1 = "INSERT INTO ashutosh: " + "VALUES (1, 'ashutosh', 'cse')";
      stmt.executeUpdate(query1);

      ResultSet rs=stmt.executeQuery("select * from ashutosh"); 
     
      while(rs.next())  
      System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
      con.close();  
    }
    catch(Exception e){ System.out.println(e);}  
  }  
}  