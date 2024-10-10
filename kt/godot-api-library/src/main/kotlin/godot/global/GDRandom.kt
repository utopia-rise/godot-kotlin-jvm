package godot.api

import godot.RandomNumberGenerator

internal interface GDRandom {
    /** Global RandomNumberGenerator for all the rand functions, it should have the same behaviour as GdScript.*/
    /** Must be a nullable because we have to set it to null to have the reference collected when the JVM is closing*/
    val rng: RandomNumberGenerator

    /** Returns a random floating-point value between 0.0 and 1.0 (inclusive). */
    fun randf() = rng.randf()

    /**
     * Returns a [normally-distributed](https://en.wikipedia.org/wiki/Normal_distribution) pseudo-random number, using Box-Muller transform with the specified [mean] and a standard [deviation]. This is also called Gaussian distribution.
     */
    fun randfn(mean: Float = 0.0f, deviation: Float = 1.0f) = rng.randfn(mean, deviation)

    /** Random range, any floating point value between from and to. */
    fun randfRange(from: Float, to: Float) = rng.randfRange(from, to)

    /** Returns a random unsigned 32-bit integer. Use remainder to obtain a random value in the interval [0, N - 1] (where N is smaller than 2^32). */
    fun randi() = rng.randi()

    /** Random range, any integer value between from and to. */
    fun randiRange(from: Int, to: Int) = rng.randiRange(from, to)

    /**
     * Given a seed, returns a PackedInt64Array of size 2, where its first element is the randomized int value, and the second element is the same as seed. Passing the same seed consistently returns the same array.
     * Note: "Seed" here refers to the internal state of the pseudo random number generator, currently implemented as a 64 bit integer.
     */
    fun randFromSeed(seed: Long): Pair<Long, Long> {
        rng.seed = seed
        //Call to randi() should change the value of the seed, that's why we retrieve it again in the return statement
        val randomValue = rng.randi()
        return Pair(randomValue, rng.seed)
    }

    /** Randomizes the seed (or the internal state) of the random number generator. Current implementation reseeds using a number based on time. */
    fun randomize() = rng.randomize()

    /** Set the value of the seed **/
    fun seed(seed: Long) {
        rng.seed = seed
    }
}
