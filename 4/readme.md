### Compile:

javac -d target/class/ -cp lib/Calc.jar com/bar/App.java

### Run:

java -cp lib/Calc.jar:target/class/ com.bar.App

### List contents of JAR:
jar tf lib/Calc.jar

### Extract file from JAR:
jar xf lib/Calc.jar META-INF/MANIFEST.MF


