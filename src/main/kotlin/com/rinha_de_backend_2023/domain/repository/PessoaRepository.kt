package com.rinha_de_backend_2023.domain.repository

import com.rinha_de_backend_2023.domain.model.Pessoa
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface PessoaRepository : JpaRepository<Pessoa, UUID>