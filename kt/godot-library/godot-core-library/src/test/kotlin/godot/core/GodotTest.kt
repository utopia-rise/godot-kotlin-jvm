@file:Suppress("NOTHING_TO_INLINE")

package godot.core

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue

inline fun checkTrue(value: Boolean) {
    assertTrue(value)
}

inline fun checkFalse(value: Boolean) {
    assertFalse(value)
}

inline fun checkMessage(value: Boolean, lazyMessage: () -> String) {
    assertTrue(lazyMessage(), value)
}

inline fun checkFalseMessage(value: Boolean, lazyMessage: () -> String) {
    assertFalse(lazyMessage(), value)
}
