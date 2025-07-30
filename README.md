# Minesweeper

Sample Java application with JavaFX. Demonstration application used in the book [Introduction to Software Design with Java](https://link.springer.com/book/10.1007/978-3-030-24094-3).

The goal of this project is to help illustrate various design decisions related to abstraction, encapsulation, and information hiding, in the context of a complete working application. The rest of the code has been left to a minimum. Common best practices not implemented here would include externalizing strings and using icons in the UI.

This application was also designed to be simple enough to be realizable without the help of the Observer pattern. Although using the Observer as part of this design would make a sense, the idea here was to have a code base that could be used for discussion without knowing about the Observer pattern.

![Screenshot of the Minesweeper application](Minesweeper.png)

## Building this application

This repository is a hybrid classic-java/maven project.

### Classic java

This repository is configured to build automatically in Eclipse with Java 21 and JavaFX 21.

However, when first imported, the project will show a compilation error because the JavaFX dependency is missing.

To add JavaFX:

1. Download [JavaFX 21](https://jdk.java.net/javafx21/);
2. Create a new `User Library` under `Eclipse -> Window -> Preferences -> Java -> Build Path -> User Libraries -> New`. Name it `JavaFX21` and include the jars under the `lib` folder from the location where you extracted the JavaFX download.

The project should then build properly.

### Maven

* Compiling: `mvn clean compile`
* Testing: `mvn clean test`
* Packaging: `mvn clean package`
 > Packaging creates a JAR-with-all-dependencies in `target/Minesweeper.jar`. Can be started with `java -jar target/Minesweeper.jar`
* Building an OS-native app: `mvn clean package -Pnative`

## Running

The project can be started from eclipse or using maven

### Running this application from the Eclipse Workspace

* Right-click on the project and select `Run As -> Java Application`. Select `Minesweeper` from the list. 
* To run the tests, select `Run As - > JUnit Test`.
* **MacOs Users**: When you run the application, from the run configuration, make sure the checkbox "Use the -XstartOnFirstThread argument when launching with SWT" is _not_ checked. 

### Maven

Simply run: `mvn clean javafx:run@run`
