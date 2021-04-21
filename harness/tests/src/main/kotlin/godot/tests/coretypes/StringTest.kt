package godot.tests.coretypes

import godot.Reference
import godot.annotation.RegisterClass
import godot.annotation.RegisterFunction

@RegisterClass
class StringTest : Reference() {

    @RegisterFunction
    fun identity(str: String) = str

    @RegisterFunction
    fun fillTheBuffer(str1: String, str2: String, str3: String, str4: String, str5: String): Boolean{
        return true
    }

    @RegisterFunction
    fun getShortString() = "Short String"


    @RegisterFunction
    fun getLongString() = "I'll pivot the lazy YAML middleware, that should abstraction the DAG virtual DOM!\n" +
        "\n" +
        "The HTML stack is down, store the stateless Imagemagick so we can lazy eval the JSON Stack Overflow!\n" +
        "\n" +
        "You can't mock the convention without gate-keeping the mobile YAML Kubernetes!\n" +
        "\n" +
        "Try to pivot the YAML Slack, maybe it will sort the reliable service worker!\n" +
        "\n" +
        "You can't transact the CS degree without gate-keeping the idiosyncratic UX website!\n" +
        "\n" +
        "I'll optimize the object-oriented DOM state, that should open source the API abstraction!\n" +
        "\n" +
        "So bubble-sorting the Stack Overflow won't do anything, we need to graph the minimum viable FIFO algorithm!\n" +
        "\n" +
        "The OOP module is down, configure the behavior-driven context so we can inherit the DOM neck beard!\n" +
        "\n" +
        "The SOAP middleware is down, f*** the serverless stream so we can circle back the LGTM constant!\n" +
        "\n" +
        "You can't ship the continuous integration without blogging the junior IoT Stack Overflow!"
}
