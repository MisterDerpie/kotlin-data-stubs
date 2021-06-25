package dto

import java.util.UUID

data class Customer(
    val id: UUID,
    val name: String,
    val age: Int) {
    companion object {}
}
