package com.example.proyecto.mapper

import com.example.proyecto.dto.EventDto
import com.example.proyecto.entity.Event

object EventMapper{

    fun toEntity(eventDto: EventDto): Event  {
        val event = Event()
        event.eventName = eventDto.eventName
        event.description = eventDto.description
        event.address = eventDto.address
        return event
    }
}
