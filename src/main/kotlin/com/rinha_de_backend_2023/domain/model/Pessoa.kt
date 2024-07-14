package com.rinha_de_backend_2023.domain.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.util.*

@Entity(name = "pessoa")
data class Pessoa(
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private val id: UUID?,
  private val apelido: String,
  private val nome: String,
  private val nascimento: String,
  private val stack: Set<String>?,
)
