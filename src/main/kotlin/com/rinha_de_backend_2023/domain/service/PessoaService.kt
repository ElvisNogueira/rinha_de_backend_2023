package com.rinha_de_backend_2023.domain.service

import com.rinha_de_backend_2023.domain.dto.CreatePessoaRequestDto
import com.rinha_de_backend_2023.domain.model.Pessoa
import com.rinha_de_backend_2023.domain.repository.PessoaRepository
import org.springframework.stereotype.Service

@Service
class PessoaService(
  val pessoaRepository: PessoaRepository,
) {
  public fun create(createPessoaRequestDto: CreatePessoaRequestDto): Pessoa {
    val pessoa = createPessoaRequestDto.toPessoa()
    return pessoaRepository.save(pessoa)
  }
}