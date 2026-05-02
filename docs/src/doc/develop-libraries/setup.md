The basic project setup is the same as for regular Godot Kotlin/JVM projects.
Head over to the corresponding [getting started](../getting-started/requirements.md) guide to set up the basics of the project.

## Library specific setup

The following configuration properties for customizing the behaviour of your library are available to you in the `build.gradle.kts` file:

| Property                              | default value             | usage                                                                                                                                                                                                                                                                                                                         |
|---------------------------------------|---------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| `registeredNameMode`                  | `SIMPLE_NAME`             | Controls how default registered class names are computed. Use `FQ_NAME` for fully qualified names, or `PROJECT_PREFIX` to prefix classes coming from external projects with their source project name.                                                                                                                       |
| `registrationFileLayoutMode`          | `FLAT`                    | Controls how `.gdj` files are laid out inside each project directory. `FLAT` writes them directly under the project directory, while `HIERARCHICAL` mirrors the package path.                                                                                                                                               |
| `isRegistrationFileGenerationEnabled` | true                      | Defines whether `gdj` files are generated during the build of your library. Safe to turn off if you don't have any sample projects or tests in your library project which depend on these registration files. Consumer projects still generate their own `.gdj` files from scanned `RegisteredClass` data.                |
