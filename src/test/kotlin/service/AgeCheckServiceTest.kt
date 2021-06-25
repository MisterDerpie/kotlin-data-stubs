package service

import dto.Customer
import dto.stubFullAgeCustomer
import dto.stubMinorAgeCustomer
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat

class AgeCheckServiceTest {

    @Test
    fun `should return true when customer is of full age`() {
        val customer = Customer.stubFullAgeCustomer()
        assertThat(AgeCheckService.isCustomerOfFullAge(customer)).isEqualTo(true)
    }

    @Test
    fun `should return false when customer is of minor age`() {
        val customer = Customer.stubMinorAgeCustomer()
        assertThat(AgeCheckService.isCustomerOfFullAge(customer)).isEqualTo(false)
    }

}