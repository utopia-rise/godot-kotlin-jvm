# Games sample

Go in the kotlin directory and run `gradlew build` to build this sample.
You can add a platform variable inside kotlin/gradle.properties (platform=windows/linux/macos/android/ios)
Open the project in Godot and inspect the root node. 
You can choose between GdScript or Kotlin and the benchmark as well.

![Godot Bunnymark](images/banner.png)

Renders an increasing number of bunny sprites until a stable 60fps is hit.  This is a decent test of real world usage as it combines Godot api usage with raw computation.

## Benchmark Run - March 05, 2020

### BunnymarkV2

Attempts to draw as many sprites as possible using Sprite nodes.  It calls GetChildren() to iterate over a list of Sprites and sets their positions.  It also updates a Label's text once per frame.  This test aims to be a better emulation of real world api usage than the V1 tests.

| Language             | Bunnies Rendered |
|----------------------|------------------|
| Kotlin               | 35               |
| GDScript             | 9600             |

### BunnymarkV1 - DrawTexture

Attempts to draw as many sprites to the screen as possible by drawing textures directly with VisualServer.  This test focuses on compute / render performance and avoids making godot api calls.

| Language             | Bunnies Rendered |
|----------------------|------------------|
| Kotlin               | 1103             |
| GDScript             | 10986            |

### BunnymarkV1 - Sprites

Attempts to draw as many sprites to the screen as possible by adding Sprite nodes.  This test focuses on compute / render performance and avoids making godot api calls.

| Language             | Bunnies Rendered |
|----------------------|------------------|
| Kotlin               | 1564             |
| GDScript             | 9015             |

### Hardware:

* CPU: Intel i5 4690k 3.9GHz
* GPU: Nvidia GeForce GTX 970
* RAM: 16GB DDR3

### Build Info:
* OS: Windows 10
* Official Godot 3.2 release
* Kotlin 1.3


Original work: [@Carter Anderson](https://github.com/cart/godot3-bunnymark). Thanks to him.

