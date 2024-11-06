package com.example.proyecto.repository

import com.example.proyecto.entity.Organizer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface OrganizerRepository : JpaRepository<Organizer, Long>
