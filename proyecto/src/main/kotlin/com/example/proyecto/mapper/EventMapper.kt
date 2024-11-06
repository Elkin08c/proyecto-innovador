package com.example.proyecto.mapper

import com.example.proyecto.dto.EventDto
import com.example.proyecto.entity.Event
import com.example.proyecto.entity.Organizer
import com.example.proyecto.repository.OrganizerRepository

object EventMapper {

    fun toEntity(eventDto: EventDto, organizer: Organizer?): Event {
        val event = Event()
        event.eventName = eventDto.eventName
        event.description = eventDto.description
        event.address = eventDto.address
        event.organizer = organizer
        return event
    }
}
