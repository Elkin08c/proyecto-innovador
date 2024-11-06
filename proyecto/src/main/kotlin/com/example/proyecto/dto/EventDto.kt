package com.example.proyecto.dto

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

class EventDto {


    @NotNull(message = "Event name is required ")
    @NotBlank(message = "Event name is required")
    var eventName: String? = null

    @NotNull(message = "Description info is required ")
    @NotBlank(message = "Description is required")
    var description: String? = null

    @NotNull(message = "Address is required ")
    @NotBlank(message = "Address is required")
    var address: String? = null
}
