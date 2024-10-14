package godot.tests.coretypes

import godot.Node
import godot.annotation.GodotMember
import godot.annotation.GodotScript
import godot.core.Vector2
import godot.core.asStringName

@GodotScript
class StringTest : Node() {

    private val _shortString = "Short String"

    /**
     * A string of 511 character a so we obtain a 512 long string, the maximun size of the buffer.
     * Change this value with the default value in LongStringQueue.kt and long_string_queue.cpp
     */
    private val _longestShortString = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"

    /**
    Length of the previous string + 1
    */
    private val _shortestLongString = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"

    private val _longString = """
        I'll pivot the lazy YAML middleware, that should abstraction the DAG virtual DOM!
        
        The HTML stack is down, store the stateless Imagemagick so we can lazy eval the JSON Stack Overflow!
        
        You can't mock the convention without gate-keeping the mobile YAML Kubernetes!
        
        Try to pivot the YAML Slack, maybe it will sort the reliable service worker!
        
        You can't transact the CS degree without gate-keeping the idiosyncratic UX website!
        
        I'll optimize the object-oriented DOM state, that should open source the API abstraction!
        
        So bubble-sorting the Stack Overflow won't do anything, we need to graph the minimum viable FIFO algorithm!
        
        The OOP module is down, configure the behavior-driven context so we can inherit the DOM neck beard!
        
        The SOAP middleware is down, f*** the serverless stream so we can circle back the LGTM constant!
        
        You can't ship the continuous integration without blogging the junior IoT Stack Overflow!
        """.trimIndent()


    @GodotMember
    fun identity(str: String) = str

    @GodotMember
    fun fillTheBuffer(str1: String, str2: String, str3: String, str4: String, str5: String): Boolean {
        return true
    }

    @GodotMember
    fun mixStringAndVariant(i1: Int, str1: String, vec: Vector2, str2: String, f1: Float): Boolean {
        return true
    }

    @GodotMember
    fun getShortString() = _shortString

    @GodotMember
    fun getLongestShortString() = _longestShortString

    @GodotMember
    fun getShortestLongString() = _shortestLongString

    @GodotMember
    fun getLongString() = _longString
  
    @GodotMember
    fun getLength(str: String) = str.length

    @GodotMember
    fun getAsStringName(str: String) = str.asStringName()

}
