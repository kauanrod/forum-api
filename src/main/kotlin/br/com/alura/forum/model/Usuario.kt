package br.com.alura.forum.model

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
data class Usuario(
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  val id: Long? = null,
  val nome: String,
  val email: String,
  val password: String
)
