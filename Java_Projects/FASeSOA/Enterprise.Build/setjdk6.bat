set JAVA_HOME=C:\java\jdk1.6.0_05
set ANT_HOME=c:\apache-ant-1.7.1
set PATH=%JAVA_HOME%\bin;%ANT_HOME%\bin;%PATH%
set ANT_OPTS=%ANT_OPTS% -Xms512m -Xmx1024m -XX:MaxPermSize=512m
echo %JAVA_HOME%
java -version