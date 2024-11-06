package com.example.proyecto.service

import com.example.proyecto.dto.EventDto
import com.example.proyecto.entity.Event
import com.example.proyecto.mapper.EventMapper
import com.example.proyecto.repository.EventRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import org.springframework.stereotype.Service


@Service
class EventService {

    @Autowired
    lateinit var eventRepository: EventRepository

    fun getEvents(): List<Event> {
        return eventRepository.findAll()
    }

    fun save(eventDto: EventDto): Event {
        val event = EventMapper.toEntity(eventDto)
        return eventRepository.save(event)
    }
}