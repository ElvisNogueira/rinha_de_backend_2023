package com.rinha_de_backend_2023.domain.model

import java.util.UUID


data class Pessoa(
  private val id: UUID,
  private val apelido: String,
  private val nome: String,
  private val nascimento: String,
  private val stack: Set<String>,
)
