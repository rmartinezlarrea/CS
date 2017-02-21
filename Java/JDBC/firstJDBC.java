import java.sql.*;

class firstJDBC {
public static void main(String args[]) throws ClassNotFoundException, SQLException {

    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
    String url = "jdbc:odbc:" + args[0];

    Connection connection = DriverManager.getConnection(url);

    Statement statement = connection.createStatement();

    String sql = args[1];
    ResultSet result = statement.executeQuery(sql);

    while( result.next() ) {
        for (int i=2;i<args.length;++i) {
            if (i<args.length-1) {
                System.out.print(result.getString(args[i])+"|");
            } else {
                System.out.println(result.getString(args[i]));
            }
        }
    }

    connection.close();
    }
}
