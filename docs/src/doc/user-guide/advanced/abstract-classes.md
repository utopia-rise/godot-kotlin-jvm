You can define and derive from any abstract class you define, as long as any of your superclasses is a Godot class.

This allows you to define default functions for your inheriting classes and override them in some, but not all subclasses if you want.

You can define a abstract class and register it's members the same way as you do for normal classes.

Under the hood, we only register your normal classes, and let them register all members your abstract class defines.

!!! info
    For this reason, the `@RegisterClass` annotation is optional for abstract classes.

!!! warning
    As in Kotlin, you cannot instantiate abstract classes directly from any other scripting language like GDScript! In fact, godot does not even know (or care) that your abstract class exists.

# Example

Abstract class definition:

```kotlin
// register class annotation is optional for abstract classes
abstract class AbstractClassInheritanceParent: Node() {

    @Export
    @RegisterProperty
    var registeredExportedPropertyInAbstractClass = false

    @RegisterSignal
    val signalInAbstractClass by signal<String>("blubb")

    @RegisterFunction
    fun functionInAbstractClassWithDefaultImplementation() {
        // some implementation
    }

    @RegisterFunction
    abstract fun abstractFunction()
}
```

Child class definition:

```kotlin
@RegisterClass
class AbstractClassInheritanceChild: AbstractClassInheritanceParent() {
    @RegisterFunction
    override fun abstractFunction() {
        // some implementation
    }
}
```

!!! warning "Registration of overridden members"
    As you can see in the example; you need to explicitly register any member in the child class which you override from the abstract parent class. Otherwise they will not be registered and thus are not known to godot.