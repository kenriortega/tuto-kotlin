package interoperability.services

import interoperability.initials

class CustomerFacade(customerService: CustomerService) {

    init {
        val customer = customerService.customerFromSocial("@exampleUsername")
        customer.name.initials()
        val customers = customerService.processCustomers()
    }
}