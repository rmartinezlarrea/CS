# .BAT File
To execute the Java progrmas from a pendrive follow the next steps:
Copy the Q:\Java folder to your pendrive
Inserte the pendrive into your computer.
See the letter asigned to your pendrive. Example: F
Change to that drive: >F:
Execute the .bat file

The content of the .bat file, for example s.bat must be:  

```
SET DRIVE=%cd:~0,3%
SET JAVA_HOME=%DRIVE%Java\jdk1.6.0_04
SET CATALINA_HOME=%DRIVE%Java\apache-tomcat-5.5.12
SET PATH=%JAVA_HOME%\bin;%CATALINA_HOME%\bin;%PATH%
SET CLASSPATH=%CLASSPATH%;%CATALINA_HOME%\common\lib\servlet-api.jar;%CATALINA_HOME%\common\lib\Jama-1.0.2.jar;.
```


