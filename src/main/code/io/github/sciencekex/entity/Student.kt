package io.github.sciencekex.entity

import lombok.AllArgsConstructor


data class Student(
    val id: Int,
    val name: String,
    val gender: String,
    val age: Int
)