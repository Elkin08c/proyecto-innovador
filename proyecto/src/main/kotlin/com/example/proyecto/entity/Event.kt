package com.example.proyecto.entity

import jakarta.persistence.*

@Entity
@Table(name = "event")
class Event {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null

    var eventName: String? = null
    var description: String? = null
    var address: String? = null

    @ManyToOne
    @JoinColumn(name = "organizer_id")
    var organizer: Organizer? = null  // Relación con Organizer
}
