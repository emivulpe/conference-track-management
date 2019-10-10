package model

import java.time.LocalTime

sealed class Session(
        val startTime: LocalTime,
        val minDurationInMinutes: Int,
        val maxDurationInMinutes: Int
) {

    private val slots = emptyList<Slot>()

    abstract fun addTalk(talk: Talk)
    abstract fun display()
}

class MorningSession: Session(LocalTime.of(9, 0), 0, 3) {
    override fun display() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun addTalk(talk: Talk) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

class AfternoonSession: Session(LocalTime.of(1, 0), 4, 4) {
    override fun display() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun addTalk(talk: Talk) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}