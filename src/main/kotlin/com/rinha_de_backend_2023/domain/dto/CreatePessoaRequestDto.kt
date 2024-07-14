package com.rinha_de_backend_2023.domain.dto

import com.rinha_de_backend_2023.domain.model.Pessoa

data class CreatePessoaRequestDto(
  private val apelido: String,
  private val nome: String,
  private val nascimento: String,
  private val stack: Set<String>?,
) {
  public fun toPessoa(): Pessoa =
    Pessoa(
      id = null,
      apelido = this.apelido,
      nome = this.nome,
      nascimento = this.nascimento,
      stack = this.stack,
    )
}