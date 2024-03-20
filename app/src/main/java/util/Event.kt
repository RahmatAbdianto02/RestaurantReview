package util

open class Event<out T>(private val content: T){
    @Suppress("MemberVisibiltyCanBePrivate")
    var hassBeenHandled = false
        private set

    fun getContentIfNotHandled(): T? {
        return if (hassBeenHandled){
            null
        } else {
            hassBeenHandled = true
            content
        }
    }
    fun peekContent(): T = content
}