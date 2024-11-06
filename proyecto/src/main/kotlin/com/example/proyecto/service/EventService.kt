package com.example.proyecto.service

import com.example.proyecto.dto.EventDto
import com.example.proyecto.entity.Event
import com.example.proyecto.mapper.EventMapper
import com.example.proyecto.repository.EventRepository
import com.example.proyecto.repository.OrganizerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class EventService {

    @Autowired
    lateinit var eventRepository: EventRepository

    @Autowired
    lateinit var organizerRepository: OrganizerRepository

    fun getEvents(): List<Event> {
        return eventRepository.findAll()
    }

    fun save(eventDto: EventDto): Event {
        val organizer = eventDto.organizerId?.let { organizerRepository.findById(it).orElse(null) }
        val event = EventMapper.toEntity(eventDto, organizer)
        return eventRepository.save(event)
    }
}
