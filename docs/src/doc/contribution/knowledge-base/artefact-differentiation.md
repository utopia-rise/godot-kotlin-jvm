This document describes what the individual artefacts are for and how they are used.

## godot-runtime
### Overview
The `godot-runtime` contains runtime specific implementations which enables the jvm and the cpp code to interact.  
It contains stuff like our own Garbage Collector and TransferContext. Also the core types are located here. The reason 
being that the core types are needed inside your GC. Hence they cannot go inside `godot-library`.

### Usage
The `godot-runtime` should not be used by the user directly. `godot-library` has a transitive dependency on it so the 
user can access the core types.  
This artefact is published to mavenCentral (so the transitive part works) and is also used as a dependency by 
`godot-bootstrap` and hence present in the shadowJar `godot-bootstrap.jar` which gets shipped alongside the engine 
executable. In there it handles loading and reloading as well as cpp/jvm interactions.

## godot-library
### Overview
The `godot-library` contains the godot api as kotlin classes as well as registration code. It is automatically added as
a dependency to the users code by the `godot-gradle-plugin`. Hence it is deployed to mavenCentral.  
It is also used as a dependency by `godot-bootstrap` and thus present in the `godot-bootstrap.jar` which gets shipped
alongside the engine.

### Usage
The `godot-library` is mainly used by the end user implicitly. Implicitly because he does not add it by himself. The 
`godot-gradle-plugin` does that.  
But it is also used by the `godot-bootstrap.jar` for initial loading and usage in the editor. Important is, that during 
runtime, only the version that was added as a dependency to the users code through the `godot-gradle-plugin` is used.
The version inside `godot-bootstrap` is only used for the editor.

## godot-bootstrap
### Overview
The `godot-bootstrap` is a shadowJar (also known as fat jar) which contains `godot-runtime` and `godot-library` as well
as all the dependencies the user has defined recursively. This is needed so they and all dependencies and the
dependencies of the dependencies are present at runtime.

### Usage
The `godot-bootstrap` is shipped alongside the engine for editor use and is bundled together with the game executable 
during export. It is never used by the user directly nor added as a dependency anywhere.

## main
### Overview
The `main.jar` is built when the user builds his code. It is a shadowJar containing only the users code and all 
dependencies.

### Usage
This jar is bundled together with the game executable during export and executed through the `godot-bootstrap` during 
runtime. It is nowhere else used.