### Compile:

javac -d target/class com/main/App.java

### Run:

java -cp target/class com.main.App

### Make JAR:

jar cvfe Calc.jar com.main.App -C target/class/ .

