import java.sql.*;

class ResultAppSQL {
  public static void main(String args[]) {
    try {
      Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    } 
    catch(ClassNotFoundException ex) {
      System.out.println("Error de ClassNotFoundException" + ex);
      System.exit(0);
    }

    String url = "jdbc:odbc:" + args[0];
    try {
      Connection connection = DriverManager.getConnection(url);
      
      Statement statement = connection.createStatement();
      String sql = args[1];
      ResultSet result = statement.executeQuery(sql);

      ResultSetMetaData rmeta = result.getMetaData();
      int numColumns = rmeta.getColumnCount();
      for(int i=1;i<=numColumns;++i) {
        if(i<numColumns) System.out.print(rmeta.getColumnName(i)+"|");
        else System.out.println(rmeta.getColumnName(i));
      }

      while( result.next() ) {
        for(int i=1;i<=numColumns;++i) {
          if(i<numColumns) System.out.print(result.getString(rmeta.getColumnName(i))+"|");
          else System.out.println(result.getString(rmeta.getColumnName(i)));
        }
      }

      connection.close();
    } catch(SQLException ex) {
      System.out.println("Error de SQLException:" + ex);
      System.exit(0);
    }
  }
}
