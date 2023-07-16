Godot Kotlin Jvm libraries are basically the equivalent of Godot Addons but specifically for the use in other Godot Kotlin Jvm projects like Games or Applications.

!!!Relevance
    If you build a library which does not register any classes to godot, you can just create a regular jvm library, and you will have no need for this documentation.

# Overview
A Godot Kotlin Jvm library is just a regular jvm library with additional metadata annotations for registered classes. For registered classes in a library registration files are generated and provided to the consumer, so they can be used in the consuming project.