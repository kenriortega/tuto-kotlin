package interoperability.services;

import interoperability.StringExtensions;
import interoperability.models.Customer;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {

    @NotNull
    public Customer customerFromSocial(String handle) {
        Customer c = new Customer("Bob");
        String initials = StringExtensions.initials(c.getName());
        return c;
    }

    @NotNull
    public List<Customer> processCustomers() {
        return new ArrayList<Customer>();
    }
}

