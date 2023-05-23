### These are the steps for running the examples 

```
mvn clean package
```
Then manually install the following JARs:

* `target/togai-java-client-1.0.2.jar`
* `target/lib/*.jar`

```
mvn compile exec:java -Dexec.mainClass="Example"
```