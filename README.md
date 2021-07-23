# Beam+Dataflow Examples in Medium

This repo contains code examples in my Medium articles on Apache Beam
and Google Cloud Dataflow.

The directory `word-count-beam/` contains Beam's canonical word count example. It is generated using:

```bash
mvn archetype:generate \
    -DarchetypeGroupId=org.apache.beam \
    -DarchetypeArtifactId=beam-sdks-java-maven-archetypes-examples \
    -DgroupId=org.example \
    -DarchetypeVersion=2.31.0 \
    -DartifactId=word-count-beam \
    -Dversion="0.1" \
    -Dpackage=org.apache.beam.examples \
    -DinteractiveMode=false \
    -DbeamVersion=2.31.0\
    -DflinkArtifactName=beam-runners-flink-1.12   
```

The top level POM files in the other directories are copied from that in `word-count-beam/` with slight variations. 