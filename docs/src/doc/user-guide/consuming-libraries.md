# Regular jvm libraries
Regular jvm libraries can be used the same way as for regular Gradle projects:

```koltin
//build.gradle.kts

dependencies {
    implementation("some.library:some-artifact:<some_version>")
}
```

# Godot Kotlin Jvm libraries
Can also be used the same way as for regular Gradle projects:

```koltin
//build.gradle.kts

dependencies {
    implementation("some.library:some-artifact:<some_version>")
}
```

But during compilation registration files for the registered classes in these libraries are generated for you, so you can use those and attach them to nodes in the Godot Editor. These registration files for those libraries are generated to a directory called `dependencies` inside your configured root directory for registration files:

```
[registrationFileBaseDir]/
├── dependencies/
│   ├── libraryA/
│   │   └── ClassFromLibraryA.gdj
│   └── libraryB/
│       └── ClassFromLibraryB.gdj
└── // your own registration files
```

The folder structure configuration is the same as you configured for your own project (just inside the `dependencies/<library_name>` folder). Have a look at the available options in the [classes user-guide](classes.md#registration-files)