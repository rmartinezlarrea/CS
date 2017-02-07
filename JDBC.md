# JDBC

## Printer manager
Menu -> Print -> Print using system dialog...
- Application
- Printer manager
- Printer driver
- Printer

## ODBC (Open Database Connectivity)
ODBC is an API for accessing DBMS (Database Management Systems)
- Application
- ODBC driver manager
- ODBC driver
- DBMS

Example with DB2 (IBM): <http://os2ports.os2site.com/docs/db2/db2l0/db2l0244.htm#FIGFGINTA>

Other examples of using ODBC: 
http://docs.oracle.com/cd/E16655_01/appdev.121/e17620/adfns_odbc.htm#ADFNS1115
Windows odbc manager: odbcad32
   
## JDBC architecture

Laboratory practice: <http://www.tecnun.es/asignaturas/Informat2/Material/Libro/IngSoft/Practica4.pdf>

Oracle tutorial:  <http://docs.oracle.com/javase/tutorial/jdbc/overview/index.html>

Examples:
[basicJDBC.java](https://dl.dropboxusercontent.com/u/17192680/Tecnun/asignaturas/SoftEng/basicJDBC.html)
[ExecuteSQL.java](https://dl.dropboxusercontent.com/u/17192680/Tecnun/asignaturas/SoftEng/ExecuteSQL.html)
[firstJDBC.java](https://dl.dropboxusercontent.com/u/17192680/Tecnun/asignaturas/SoftEng/firstJDBC.html)

### File ResultAppSQL.java

```
import java.sql.*;
class basicJDBC {
    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection connection = DriverManager.getConnection("jdbc:odbc:basic");
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery("Select titulo, autor from datos");
        while(result.next()) {
            System.out.print(  result.getString("titulo")+", ");
            System.out.println(result.getString("autor"));
        }
        connection.close();
    }
}
```

ODBC driver in JDBC:
java firstJDBC "Driver={Microsoft Access Driver (*.mdb)};Dbq=Libros.mdb" "Select * from datos" autor titulo

More examples: firstJDBC, ResultAppSQL  file firstJDBC(1).java
Lab sessions: books.mdb  Lab-DDBB Lab-JDBC
JDBC  Files Wildcard characters in MS Access

Lab: <http://www.tecnun.es/asignaturas/Informat2/Material/Libro/IngSoft/Practica5.pdf>

[API java.sql](http://docs.oracle.com/javase/6/docs/api/index.html?java/sql/package-summary.html)

[PreparedStatement](http://svn.apache.org/repos/asf/db/derby/code/trunk/java/demo/toursdb/insertMaps.java)
