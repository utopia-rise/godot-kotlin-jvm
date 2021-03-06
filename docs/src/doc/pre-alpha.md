**Please note:** This is a Pre-Alpha. It is by no means production ready. Please only use it if you want to help with the development by testing or if you want to have a sneak peak at what's coming. 
At the moment the whole setup process is quite tedious, not simple and more geard towards users familiar with godot and gradle.   
Expect breaking changes for every commit we publish.

# Artefacts
For the Pre-Alpha, no artefacts are deployed and we do not provide a pre built engine yet.  
If you want to try the binding at it's current state, you will have to build the binding and the engine yourself. See the section [setup](#setup) and [build](#build).

# Setup
1. Clone godot repo with 3.2 branch. `git clone git@github.com:godotengine/godot.git -b 3.2 --recursive`
2. In `godot/`, run the following command: `git submodule add git@github.com:utopia-rise/godot-kotlin-jvm.git modules/kotlin_jvm`
3. Pull the submodules of our project: 
    - `cd modules/kotlin_jvm`
    - `git submodule update --init --recursive`
   
# Build
**Note:** this needs to be done each time you pull the latest changes from this project until we ship a pre-built engine.

1. From the godot root folder build the engine with: `scons -j$(nproc) platform=x11 # your platform`
2. Build `godot-bootstrap.jar`
   - navigate to `kt/`
   - `./gradlew build`

# Documentation
The documentation is currently not deployed. Once you have set up the project (see [setup](#setup)), you can launch the documentation in a local webserver. Just run the `run.sh` script in the `docs` folder.

## Requirements
To run the documentation locally you need:

- Phython 3 installed
- `pip install mkdocs`
- `pip install mkdocs-material`

# Setup your project
At this state it's highly recommended to just put you project in the `harness` folder so you can more or less copy the gradle configuration from our sample projects.

Most important is the configuration inside the `settings.gradle.kts` file as it includes the necessary build includes as long as we don't provide published artefacts.

Just copy the one from the `tests` project and change the project name.

Once you have done that, and set up the rest of the gradle project, you can open your project in intellij and all godot-jvm dependencies should be built for you. The first build can take a while.

# Run your project
Just run the engine executable you built in the [build](#build) section. It is in the `bin` folder of the root godot folder.

# Rebuilding
When you create new classes, you need to rebuild your project for godot to see your new classes.  
If you rebuild while the editor is open, it should automatically reload your classes.

# Exporting
To export projects you should first build Godot exports like described [here](https://docs.godotengine.org/fr/stable/development/compiling/compiling_for_windows.html#creating-windows-export-templates) for Windows. Same Doc apply for other platforms.  
Then you can export your project as you would do for usual Godot projects.

# Intellij plugin
We recommend you build and install our intellij plugin located in `kt/plugins/godot-intellij-plugin` as it provides many code insight features to verify your registration code.

# What's not working:
The items in this list are explicitly mentioned here as these will be implemented in future versions. Also consider the [Api differences](api-differences.md) section for general differences and limitations which will not be or cannot be adressed in the near forseable future or ever.

- Each registered constructor must have a unique number of arguments. Constructor overloading is not yet supported
- No networking functionality (Rpc annotations do exist but they do not work yet)
- No tool mode (you can set it already in the `@RegisterClass` annotation but it has no effect yet)
- No plugin support -> You cannot use Godot Kotlin/JVM to write plugins and addons yet
- No export support (but as mentioned in the [export](#export) section, it is generally already possible)
- Only desktop OS are supported for now (Linux, MacOS, Windows)

# Bug reporting and Questions
If you find bugs, please report an [issue on github](https://github.com/utopia-rise/godot-kotlin-jvm/issues). But check for duplicates first.  
If you have questions or need help, you can ask on [discord](https://discord.gg/qSU2EQs) in the channels `questions` and `help` respectively.  
If you don't have discord or don't want to use it, make a issue on github.
