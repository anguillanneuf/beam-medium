The four examples in this directory are used in ["Quick and easy coders for POJOs in Apache Beam"](https://medium.com/google-cloud/quick-and-easy-coders-for-pojos-in-your-beam-pipeline-5d8e16994c1f) on Medium.

1. `BrokenPlayerExample`
    ```none
    mvn compile exec:java \
      -Dexec.mainClass=BrokenPlayerExample
    ```
   This example will throw:
   ```none
   An exception occured while executing the Java
   class. Unable to infer a coder and no Coder was
   specified. Please set a coder by invoking
   Create.withCoder() explicitly  or a schema by
   invoking Create.withSchema().: Unable to provide
   a Coder for BrokenPlayerExample$Player.
   ```
1. `SerializablePlayerExample` 
    ```none
    mvn compile exec:java \
      -Dexec.mainClass=SerializablePlayerExample
    ```
   This example runs on Beam's DirectRunner and will output the players in any order:
   ```none
   owl: 22
   kestrel: 100
   finch: 95
   ```
1. `AvroPlayerExample`
    ```none
    mvn compile exec:java \
      -Dexec.mainClass=AvroPlayerExample
    ```
   This example runs on Beam's DirectRunner and will output the players in any order:
   ```none
   kestrel: 100
   finch: 95
   owl: 22
   ```
1. `ProtoPlayerExample`
    ```none
    mvn compile exec:java \
      -Dexec.mainClass=ProtoPlayerExample
    ```
   This example runs on Beam's DirectRunner and will output the players in any order:
   ```none
   kestrel: 100
   owl: 22
   finch: 95
   ```
