package com.example.proyecto.controller

import com.example.proyecto.dto.EventDto
import com.example.proyecto.entity.Event
import com.example.proyecto.service.EventService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/events")
class EventController {

    @Autowired
    lateinit var eventService: EventService

    @GetMapping
    fun getEvents() = eventService.getEvents()

    @PostMapping
    fun save (@RequestBody @Valid eventDto: EventDto): Event {
        return eventService.save(eventDto)
    }
}