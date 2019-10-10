package model

import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import java.time.LocalTime

class SlotTest {

    @Test
    fun `should display name of slot`() {
        val slot = Slot(LocalTime.of(9,0), Talk("Emilia test talk", 5))

        val expectedDisplayName = "09:00AM Emilia test talk lightning"
        assert(slot.displayName() == expectedDisplayName)
    }

    @Nested
    inner class EventTest {

        @Test
        fun `should print talk name and duration in minutes`(){
            val talk = Talk("Emilia test talk", 30)

            val expectedDisplayName = "Emilia test talk 30min"
            assert(talk.displayName() == expectedDisplayName)
        }

        @Test
        fun `should print talk name and lighting for lightning talks`(){
            val talk = Talk("Emilia test talk", 5)

            val expectedDisplayName = "Emilia test talk lightning"
            assert(talk.displayName() == expectedDisplayName)
        }

        @Test
        fun `should display name of lunch`() {
            val lunch = Lunch

            val expectedDisplayName = "Lunch"
            assert(lunch.displayName() == expectedDisplayName)
        }

        @Test
        fun `should display name of networking event`() {
            val networkingEvent = NetworkingEvent

            val expectedDisplayName = "Networking Event"
            assert(networkingEvent.displayName() == expectedDisplayName)
        }

    }
}