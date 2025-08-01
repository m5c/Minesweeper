# Minesweeper

Sample Java application with JavaFX. Demonstration application used in the
book [Introduction to Software Design with Java](https://link.springer.com/book/10.1007/978-3-030-24094-3).

The goal of this project is to help illustrate various design decisions related to abstraction, encapsulation, and
information hiding, in the context of a complete working application. The rest of the code has been left to a minimum.
Common best practices not implemented here would include externalizing strings and using icons in the UI.

This application was also designed to be simple enough to be realizable without the help of the Observer pattern.
Although using the Observer as part of this design would make a sense, the idea here was to have a code base that could
be used for discussion without knowing about the Observer pattern.

![Screenshot of the Minesweeper application](Minesweeper.png)

## Building this application

This repository is a hybrid classic-java/maven project.

### Classic java

This repository is configured to build automatically in Eclipse with Java 21 and JavaFX 21.

However, when first imported, the project will show a compilation error because the JavaFX dependency is missing.

To add JavaFX:

1. Download [JavaFX 21](https://jdk.java.net/javafx21/);
2. Create a new `User Library` under `Eclipse -> Window -> Preferences -> Java -> Build Path -> User Libraries -> New`.
   Name it `JavaFX21` and include the jars under the `lib` folder from the location where you extracted the JavaFX
   download.

The project should then build properly.

### Maven

* Compiling: `mvn clean compile`
* Testing: `mvn clean test`

#### Slim JAR

Building a slim JAR will *not* include transitive dependencies.  
To build a slim JAR, use: `mvn clean package`

* The jar will be smaller
* You have to manually place javafx on the classpath, for the jar to run


> Building the slim JAR is the **default
** packaging behaviour. If no further profiles specified, you will obtain a slim JAR.

#### Fat JAR

Building a fat JAR will include transitive dependencies.  
To build a slim JAR, use: `mvn clean package -Pfat`

* The jar will be larger
* You can run the JAR as-is, with: `java jar target/Minesweeper.jar`

#### OS native

Building an OS native binary will include the JRE and all transitive dependencies. It will also implicitly build a fat
JAR as part of the process.  
To build a slim JAR, use: `mvn clean package -Pnative`

* The native application will be significantly larger (~100MB)
* You can run the application, like any other app on your computer.

> Note: On MacOS the software is unsigned, i.e. you cannot transfer and run the software on other computers unless ["System Integrity Protection" is manually disabled](https://developer.apple.com/documentation/security/disabling-and-enabling-system-integrity-protection).

## Running

The project can be started from eclipse or using maven

### Running this application from the Eclipse Workspace

* Right-click on the project and select `Run As -> Java Application`. Select `Minesweeper` from the list.
* To run the tests, select `Run As - > JUnit Test`.
* **MacOs Users**: When you run the application, from the run configuration, make sure the checkbox "Use the
  -XstartOnFirstThread argument when launching with SWT" is _not_ checked.

### Maven

* Running from sources: `mvn clean javafx:run@run`
* Running fat JAR: `java -jar target/Minesweeper.jar`
* Running slim JAR:
    * [Download JavaFX](https://jdk.java.net/javafx21/) and extract it somewhere, e.g. to `/tmp`
    * Run: `java --module-path /tmp/javafx-sdk-21.0.2/lib --add-modules javafx.controls,javafx.fxml -cp "/tmp/javafx/lib/*:target/Minesweeper.jar" ca.mcgill.cs.swevo.minesweeper.Minesweeper`
