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
Other examples of using ODBC: <http://docs.oracle.com/cd/E16655_01/appdev.121/e17620/adfns_odbc.htm#ADFNS1115>

Windows odbc manager: odbcad32  
With Windows 64 bits: C:\Windows\System32\odbcad32.exe (yes, System32 is for 64 bits systems)  
With Windows 32 bits: C:\Windows\SysWOW64\odbcad32.exe (WOW64 means Windows on Windows 64, so it's for 32 bits systems)  
   
## JDBC architecture  
Laboratory practice: <http://www.tecnun.es/asignaturas/Informat2/Material/Libro/IngSoft/Practica4.pdf>

Oracle tutorial:  <http://docs.oracle.com/javase/tutorial/jdbc/overview/index.html>

Examples:
- [basicJDBC.java](https://github.com/nicolasserrano/CS/blob/master/Java/JDBC/basicJDBC.java)  
- [firstJDBC.java](https://github.com/nicolasserrano/CS/blob/master/Java/JDBC/firstJDBC.java)

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

[Access mdb file](https://aula-virtual.unav.edu/bbcswebdav/pid-427603-dt-content-rid-886758_1/xid-886758_1)  

Lab sessions:
- [Data base (books.mdb)](https://aula-virtual.unav.edu/bbcswebdav/pid-427603-dt-content-rid-886758_1/xid-886758_1)
- [Lab-DDBB](https://aula-virtual.unav.edu/bbcswebdav/pid-427603-dt-content-rid-886759_1/xid-886759_1)
- [Lab-JDBC](https://aula-virtual.unav.edu/bbcswebdav/pid-427603-dt-content-rid-886760_1/xid-886760_1)
JDBC  Files Wildcard characters in MS Access

Lab: <http://www.tecnun.es/asignaturas/Informat2/Material/Libro/IngSoft/Practica5.pdf>

## JDBC and Servlets  

### Servlet structure with JDBC (methods init and doGet)  
- [Presentation](https://www.dropbox.com/s/kbrt9acq38m8py8/ServletsDB.ppt?dl=0), and [example](http://www4.tecnun.es/asignaturas/Informat3/Apoyo_Clases/Ejemplos_Servlets_JDBC/Ejemplo2.html)
- Example: <http://www4.tecnun.es/asignaturas/Informat2/Material/Libro/IngSoft/Practica9.pdf>

### API java.sql  
[API java.sql](http://docs.oracle.com/javase/6/docs/api/index.html?java/sql/package-summary.html)

### Metadate  
- [ResultAppSQL](https://github.com/nicolasserrano/CS/blob/master/Java/JDBC/ResultAppSQL.java)
- [ExecuteSQL.java](https://github.com/nicolasserrano/CS/blob/master/Java/JDBC/ExecuteSQL.java)

###   jdbc:odbc without DSN
ODBC driver in JDBC:
java firstJDBC "Driver={Microsoft Access Driver (*.mdb)};Dbq=Libros.mdb" "Select * from datos" autor titulo

### PreparedStatement  
[PreparedStatement](http://svn.apache.org/repos/asf/db/derby/code/trunk/java/demo/toursdb/insertMaps.java)

### Derby  
```
F:\Java\db-derby-10.9.1.0-bin iniciar.bat
F:
SET JAVA_PC=F:\Java
SET JAVA_HOME=%JAVA_PC%\jdk1.6.0_04
SET PATH=%JAVA_HOME%\bin;%PATH%
set install=%JAVA_PC%\db-derby-10.9.1.0-bin
set classpath=%install%\lib\derbytools.jar;%install%\lib\derby.jar;%install%
cd %install%\demo\programs
java org.apache.derby.tools.ij

Para crear la base de datos Derby:
CONNECT 'jdbc:derby:firstdb;create=true';

Comandos:
ij> connect 'jdbc:derby:dbdetective';
ij> show tables;
ij> select * from user1.employee where Last_name like 'T%';
```

### Squirrel  
```
set path=C:\Java\Squirrel-sql-2.6.5a;%path%
squirrel-sql.bat
```

### Derby in server mode  
set the driver with file: derbynet.jar in CLASSPATH:
```
     set classpath=F:\Java\db-derby-10.9.1.0-bin\lib\derbynet.jar;%classpath%
```
start the server
```
java org.apache.derby.drda.NetworkServerControl start
```
Explianed in http://db.apache.org/derby/integrate/SQuirreL_Derby.html

Example of Squirrel with DerbyNet (server mode):
url:  jdbc:derby://localhost:1527/d:/folderpath//Java/ClientDB;create=true

## Uses of data  

### JS charts and graphs  
- Drawing with JavaScript in a canvas [run](https://nicolasserrano.github.io/CS/JavaScript/graphics/canvas.html) [source](JavaScript/graphics/canvas.html)
- Using Dygraph library [run](https://nicolasserrano.github.io/CS/JavaScript/graphics/newton.html) [source](JavaScript/graphics/newton.html)
- [Google charts](https://developers.google.com/chart/interactive/docs/gallery) [example in SMR](http://smr-project-test.appspot.com/UserPage?PageKey=5677751478517760)
- [Raphael JS](http://dmitrybaranovskiy.github.io/raphael/) [Basic example](https://nicolasserrano.github.io/CS/JavaScript/graphics/basicRaphael.html)

### SOA (Service Oriented Architecture)

### Server Sent Events


---
[Edit](https://github.com/nicolasserrano/CS/edit/master/JDBC.md)
<style>
div.container ul, div.container ol {
    padding-left: 1.4em;
}
</style>
