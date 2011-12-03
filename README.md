# Test Scala REPL

This project is here to show an issue I ran into trying to run the Scala REPL as part of a "fat jar." To run this, follow these steps:

    sbt update assembly
    java -Dusejavacp=true -jar target/myscala-assembly-0.1.jar

The output should show you something like this:

    Welcome to Scala version 2.9.1.final (Java HotSpot(TM) 64-Bit Server VM, Java 1.6.0_29).
    Type in expressions to have them evaluated.
    Type :help for more information.

    scala>
    Failed to initialize compiler: object scala not found.
    ** Note that as of 2.8 scala does not assume use of the java classpath.
    ** For the old behavior pass -usejavacp to scala, or if using a Settings
    ** object programatically, settings.usejavacp.value = true.
