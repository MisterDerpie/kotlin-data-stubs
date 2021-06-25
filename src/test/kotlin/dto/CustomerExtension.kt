package dto

import java.util.UUID

fun Customer.Companion.stubFullAgeCustomer(): Customer {
    return Customer(UUID.nameUUIDFromBytes("This is some string for UUID".toByteArray()), "MisterDerpie", 24)
}

fun Customer.Companion.stubMinorAgeCustomer(): Customer {
    return Customer(UUID.nameUUIDFromBytes("This is another UUID string".toByteArray()), "MinorPerson", 17)
}