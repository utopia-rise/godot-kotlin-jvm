package godot.global

import godot.RandomNumberGenerator

internal interface GDRandom {
    /** Global RandomNumberGenerator for all the rand functions, it should have the same behaviour than GdScript.*/
    /** Must be a nullable because we have to set it to null to have the reference collected when the JVM is closing*/
    var rng: RandomNumberGenerator?

    /** Random range, any floating point value between from and to. */
    fun randRange(from: Double, to: Double) = randRange(from.toFloat(), to.toFloat()).toDouble()

    /** Random range, any floating point value between from and to. */
    fun randRange(from: Float, to: Float) = rng!!.randfRange(from, to)

    /** Random range, any integer value between from and to. */
    fun randRange(from: Int, to: Int) = rng!!.randiRange(from, to)

    /** Random range, any long value between from and to. */
    fun randRange(from: Long, to: Long) = rng!!.randiRange(from.toInt(), to.toInt())

    /** Random from seed: pass a seed, and an array with both number and new seed is returned. "Seed" here refers to the internal state of the pseudo random number generator.
     * The internal state of the current implementation is 64 bits. */
    fun randSeed(seed: Long): Pair<Long, Int> {
        rng!!.seed = seed
        //Call to randi() should change the value of the seed, that's why we retrieve it again in the return statement
        val randomValue = rng!!.randi()
        return Pair(rng!!.seed, randomValue)
    }

    /** Returns a random floating point value on the interval [0, 1]. */
    fun randf() = rng!!.randf()

    /** Returns a random signed 32 bit integer. */
    fun randi() = rng!!.randi().toInt()

    /** Returns a random long. */
    fun randl() = rng!!.randi()

    /** Randomizes the seed (or the internal state) of the random number generator. Current implementation reseeds using a number based on time. */
    fun randomize() = rng!!.randomize()

    /** Set the value of the seed **/
    fun seed(seed: Long) {
        rng!!.seed = seed
    }
}
