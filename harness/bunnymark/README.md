# Bunnymark benchmark/sample

Go in the bunnymark directory and run `gradlew build` to build this sample.  
Open the project in Godot and inspect the root node. 
You can choose between GdScript or Kotlin (also C# if you built the engine with mono enabled), and the benchmark as well.  
You can also run the benchmarks from the commandline:  
Example: `../../../../bin/godot.x11.opt.tools.64.mono --bench=BunnymarkV2 --lang=kt`

![Godot Bunnymark](images/banner.png)

Renders an increasing number of bunny sprites until a stable 60fps is hit.  This is a decent test of real world usage as it combines Godot api usage with raw computation.

## Benchmark Run - Pre-Alpha, February 17, 2021

### BunnymarkV3

V3 is a test where each bunny is its own node with a script updating their positions.  
This benchmark's goal is to measure the cost of calling many small scripts from Godot.

| Language             | Bunnies Rendered |
|----------------------|------------------|
| GDScript             | 8328             |
| Kotlin               | 7056             |
| CSharp               | 8813             |

### BunnymarkV2

Attempts to draw as many sprites as possible using Sprite nodes.  It calls GetChildren() to iterate over a list of Sprites and sets their positions.  It also updates a Label's text once per frame.  This test aims to be a better emulation of real world api usage than the V1 tests.

| Language             | Bunnies Rendered |
|----------------------|------------------|
| GDScript             | 10272            |
| Kotlin               | 10587            |
| CSharp               | 13920            |

### BunnymarkV1 - DrawTexture

Attempts to draw as many sprites to the screen as possible by drawing textures directly with VisualServer.  This test focuses on compute / render performance and avoids making godot api calls.

| Language             | Bunnies Rendered |
|----------------------|------------------|
| GDScript             | 10910            |
| Kotlin               | 24340            |
| CSharp               | 22100            |

### BunnymarkV1 - Sprites

Attempts to draw as many sprites to the screen as possible by adding Sprite nodes.  This test focuses on compute / render performance and avoids making godot api calls.

| Language             | Bunnies Rendered |
|----------------------|------------------|
| GDScript             | 10117            |
| Kotlin               | 18958            |
| CSharp               | 21500            |


### Hardware:

* CPU: Intel(R) Xeon(R) CPU E5-2630 v4 @ 2.20GHz
* GPU: AMD Radeon RX 5700 XT
* RAM: 64GB DDR4 @ 2133 MT/s

### Build Info:
* OS: 5.4.95-1-MANJARO (Arch)
* Godot 3.2 branch (Commit: 7897cf44722a1e4a9a18fb666f819ba19268d6a1), Target: release_debug 
* Kotlin 1.4.30



---

# Old benchmark results from the [Kotlin Native Binding](https://github.com/utopia-rise/godot-kotlin)
Kept here for reference. These numbers below have **NOTHING** to do with the [Godot-Jvm](https://github.com/utopia-rise/godot-jvm/) project!

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

