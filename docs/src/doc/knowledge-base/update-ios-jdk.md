In order to update the JDK for iOS, you will need to follow the next steps:

- Create a repo similar to [ios-graal-jdk-21](https://github.com/utopia-rise/ios-graal-jdk-21).  
This repo should contain `labs-openjdk` repo from GraalVM for the corresponding JDK version as a submodule.  
It should also contain graal repo as a submodule, using release tag for the GraalVM version associated to the desired 
JVM version.  
You may need to update the git patch in this repo.  
You may need to update xcode projects in this repo.  
Once done and compiled, create a new release and upload new built static libraries to this release.  
- Update CAP (C Annotation Processor) cache in [cap-cache-generator](https://github.com/utopia-rise/cap-cache-generator).  
To do so, change your `GRAALVM_HOME` environment variable to point to the new GraalVM you're updating for.  
Then tag a new release and upload new CAP files in it.  
- Change iOS JDK versions and CAP cache versions in `libs.versions.toml` of this project. 