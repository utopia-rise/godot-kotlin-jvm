package godot.core

import java.util.ArrayDeque

internal object LongStringQueue {

    // If changed, remember to change also max_string_size in long_string_queue.cpp
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
