# Shared buffer

## General
The classical way of making the JVM and C++ code to interact with each other is to to use JNI. JNI works well, but its overhead is too high when you wish to make a lot of small calls, specially when you wish to call a method with a lot of parameters.
A way to bypass that is to create a buffer that will be shared between the two languages so we only have to write and read fromt that buffer to exchange data.

## Marshalls
The only data written in that buffer are the usual Godot types: primitives, strings, coreTypes and objects. We don't need a generic way of serialize data like protobuff. We tried that solution at first, but it was too slow for an interprocess job.
Writing data to the buffer is quite simple in C++, we just use the Marshalls utiliy of the Godot Engine. On the kotlin side we just reimplement them from scratch.

## Memory
To avoid unnecessary locks, we create one buffer for each thread that work with both C++ and the JVM. That way, one thread doesn't need to wait for another to finish its job with the buffer.
The buffer currently has a size of 2.5 KB by default. The reason for that is that we allow strings up to 512 bytes in size and only 5 parameters for a registered Kotlin function.

## String
String are a special case because they have a dynamic size so they can potentially have any size. We set a maximum size allowed in the buffer. 
If we go above it, it switches to a regular JNI call. When it's done that way. The string is stored in a queue so we can retrieve the strings from it instead of reading the buffer.
In most cases, you would rarely reach that maximum size in a video game.
Other dynamic type like Array and Dictionnary are not an issue as only their pointer is sent to the JVM.

## Buffer structure

The first value of the buffer is always an Int that indicates the number of variable to read. 
Each variable starts with another Int that indicates its type then followed by the relevant data of that type.

 Type | ordinal | content |
| Nil | 0 | X |
| Bool | 1 | Bool: 4 Bytes |
| Int | 2 | Long: 8 Bytes |
| Real | 3 | Double: 8 Bytes |
| String | 4 | Bool: 4Bytes, Dynamic: 512 Bytes at most (if Bool is set to true, empty otherwise) |
| Vector2 | 5 | x: Float: 4 Bytes, y: Float: 4 Bytes |
| Rect2 | 6 | position : Vector2: 8 Bytes, size : Vector2: 8 Bytes |
| Vector3 | 7 | x: Float: 4 Bytes, y: Float: 4 Bytes, z: Float: 4 Bytes |
| Transform2D | 8 | x: Vector2: 8 Bytes, y: Vector2: 8 Bytes, origin: Vector2: 8 Bytes |
| Plane | 9 | normal: Vector3: 12 Bytes, d: Float: 4 Bytes |
| Quat | 10 |  x: Float: 4 Bytes, y: Float: 4 Bytes, z: Float: 4 Bytes, w: Float: 4 Bytes |
| AABB | 11 | position : Vector3: 12 Bytes, size : Vector3: 12 Bytes |
| Basis | 12 | x : Vector3: 12 Bytes, y : Vector3: 12 Bytes, z : Vector3: 12 Bytes |
| Transform | 13 | basis: Basis: 36 Bytes, origin: Vector3: 12 Bytes |
| Color | 14 |  red: Float: 4 Bytes, green: Float: 4 Bytes, blue: Float: 4 Bytes, alpha: Float: 4 Bytes  |
| NodePath | 15 | pointer: ptr: 8 Bytes |
| RID | 16 | pointer: ptr: 8 Bytes |
| Object | 17 | pointer: ptr: 8 Bytes, JVM_constructor_index: Int: 4 Bytes, isReference: Bool: 4 Bytes, object_id: Long: 8 Bytes |
| Dictionnary | 18 | pointer: ptr: 8 Bytes |
| Array | 19 | pointer: ptr: 8 Bytes |
| PoolXArray | 20 to 27 | ---|
