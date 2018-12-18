## Spring JFR simple web 
[UNDER CONSTRUCTION]

**spring-jfr-simple-web** is a simple spring boot rest application that shows how to use opentracing 
**java-jfr-tracer**  together with spring cloud libraries. The Application Tracer is automatically by default setup. 
By default is used Jaeger Tracer.

```groovy
dependencies {
    ***
    compile "io.opentracing.contrib:opentracing-jfr-tracer:0.0.4-SNAPSHOT"
    compile "io.opentracing.contrib:opentracing-jfr-tracer-spring-autoconfigure:0.0.4-SNAPSHOT"
    
    compile "io.opentracing.contrib:opentracing-spring-jaeger-cloud-starter:1.0.1"
    ***
}
```
To enable zipkin tracer it's necessary to uncomment add
```groovy
compile "io.opentracing.contrib:opentracing-spring-zipkin-cloud-starter:0.2.0"
```
into the **gradle.build** dependencies and comment out jaeger tracer. 

Both **Tracer** are using spring-cloud implementations with default auto-configure feature.


### OpenJDK Mission Control / Flight Recorder
By default the Flight Recorder is enabled and traces are delegated to running it.
To disable jfr-tracer set property
```bash
opentracing.jfr-tracer.enabled=false
```
### Java Versions
project may run on Oracle JDK 8+ (except Oracle JDK 9 and 10) and OpenJDK 11+.

### Running application 
```bash
$ ./gradlew bootRun
```

### References
* [opentracing:java-jfr-tracer](https://github.com/opentracing-contrib/java-jfr-tracer)  
* [spring-profile-logging](https://github.com/mirage22/spring-profile-logging) : The demo does contain multiple 
services. The demo is based on spring-boot libraries.
