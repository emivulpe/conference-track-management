package model

import java.time.LocalTime
import java.time.format.DateTimeFormatter

data class Slot(
        val time: LocalTime,
        val event: Event
) {
    fun displayName() = "${time.format(DateTimeFormatter.ofPattern("hh:mma"))} ${event.displayName()}"
}

sealed class Event {
    abstract fun displayName(): String
}

class Talk(
        private val title: String,
        private val durationInMunutes: Int
) : Event() {
    override fun displayName() =
            if (durationInMunutes == 5)
                "$title lightning"
            else
                "$title ${durationInMunutes}min"

}

object Lunch : Event() {
    override fun displayName() = "Lunch"
}


object NetworkingEvent : Event() {
    override fun displayName() = "Networking Event"
}

