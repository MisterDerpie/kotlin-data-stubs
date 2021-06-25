package service

import dto.Customer

class AgeCheckService {
    companion object {
        fun isCustomerOfFullAge(customer: Customer): Boolean {
            return customer.age >= 18
        }
    }
}