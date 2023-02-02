### These are the steps for running the examples 
```
./gradlew build
./gradlew build shadowJar
```
Replace the '{{Version}}' with the actual version
```
javac -cp ".:build/libs/togai-java-client-{{version}}.jar" examples/Example.java
java -cp ".:examples:build/libs/togai-java-client-{{version}}-all.jar" Example
```