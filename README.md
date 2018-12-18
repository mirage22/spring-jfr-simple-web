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
