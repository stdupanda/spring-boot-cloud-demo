cd /d "%~dp0"
echo %~f0
echo build package
rem 必须使用call，否则 mvn.cmd 会exit
call mvn clean package -DskipTests -e

echo run eureka server, port number is 8080
java -jar target/sc00.jar

pause