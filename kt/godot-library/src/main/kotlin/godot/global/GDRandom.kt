package godot.global

import godot.RandomNumberGenerator

internal interface GDRandom {
    /** Global RandomNumberGenerator for all the rand functions, it should have the same behaviour than GdScript.*/
    /** Must be a nullable because we have to set it to null to have the reference collected when the JVM is closing*/
    var rng: RandomNumberGenerator

    /** Random range, any floating point value between from and to. */
    fun randdRange(from: Double, to: Double) = randfRange(from.toFloat(), to.toFloat()).toDouble()

    /** Random range, any floating point value between from and to. */
    fun randfRange(from: Float, to: Float) = rng.randfRange(from, to)

    /** Random range, any integer value between from and to. */
    fun randiRange(from: Int, to: Int) = rng.randiRange(from, to)

    /** Random range, any long value between from and to. */
    fun randlRange(from: Long, to: Long) = rng.randiRange(from.toInt(), to.toInt()).toLong()

    /** Random from seed: pass a seed, and an array with both number and new seed is returned. "Seed" here refers to the internal state of the pseudo random number generator.
     * The internal state of the current implementation is 64 bits. */
    fun randSeed(seed: Long): Pair<Long, Long> {
        rng.seed = seed
        //Call to randi() should change the value of the seed, that's why we retrieve it again in the return statement
        val randomValue = rng.randi()
        return Pair(rng.seed, randomValue)
    }

    /** Returns a random floating point value on the interval [0, 1]. */
    fun randf() = rng.randf()

    /** Returns a random floating point value on the interval [0, 1]. */
    fun randd() = rng.randf().toDouble()

    /** Returns a random signed 32 bit integer. */
    fun randi() = rng.randi().toInt()

    /** Returns a random long. */
    fun randl() = rng.randi()

    /**
     * Returns a [normally-distributed](https://en.wikipedia.org/wiki/Normal_distribution) pseudo-random number, using Box-Muller transform with the specified [mean] and a standard [deviation]. This is also called Gaussian distribution.
     */
    fun randfn(mean: Float = 0.0f, deviation: Float = 1.0f)  = rng.randfn(mean, deviation)

    /**
     * Returns a [normally-distributed](https://en.wikipedia.org/wiki/Normal_distribution) pseudo-random number, using Box-Muller transform with the specified [mean] and a standard [deviation]. This is also called Gaussian distribution.
     */
    fun randdn(mean: Double = 0.0, deviation: Double = 1.0)  = rng.randfn(mean.toFloat(), deviation.toFloat()).toDouble()

    /** Randomizes the seed (or the internal state) of the random number generator. Current implementation reseeds using a number based on time. */
    fun randomize() = rng.randomize()

    /** Set the value of the seed **/
    fun seed(seed: Long) {
        rng.seed = seed
    }
}
