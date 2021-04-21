package godot.core

import java.util.*

internal object LongStringQueue {

    // If changed, remember to change also max_string_size in long_string_queue.cpp and the StringTest.kt
    var stringMaxSize = 512

    private val stringQueue = ThreadLocal.withInitial {
        ArrayDeque<String>(5)
    }

    fun queueString(str: String) {
        stringQueue.get().addLast(str)
    }

    fun pollString(): String {
        return stringQueue.get().pollFirst()
    }

    external fun sendStringToCPP(str: String)
}
