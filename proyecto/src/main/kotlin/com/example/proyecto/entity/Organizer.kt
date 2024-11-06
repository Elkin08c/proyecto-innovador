package com.example.proyecto.entity

import jakarta.persistence.*

@Entity
@Table(name = "organizer")
class Organizer {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null

    var name: String? = null
    var contactInfo: String? = null
}
