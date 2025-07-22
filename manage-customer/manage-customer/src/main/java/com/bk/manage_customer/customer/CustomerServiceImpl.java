package com.bk.manage_customer.customer;

import com.bk.manage_customer.customer.dto.AddressDto;
import com.bk.manage_customer.customer.dto.Contact_DetailsDto;
import com.bk.manage_customer.customer.dto.CustomerDto;
import com.bk.manage_customer.customer.repository.AddressRepository;
import com.bk.manage_customer.customer.repository.ContactDetailsRepository;
import com.bk.manage_customer.customer.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;
    private AddressRepository addressRepository;
    private ContactDetailsRepository contactDetailsRepository;

   private static List<Customer> customerList = new ArrayList<>();
   private static long customerCount;

    static {
        customerList.add(new Customer(++customerCount,"Buti", "Komana","Male", new Address(23,"Albert", "Johannesburg", "Gauteng", 2001),new ContactDetails("0724445555", "buti@mail.com")));
        customerList.add(new Customer( ++customerCount,"Lero", "Lane","Female", new Address(200,"Relly", "Pretoria", "Gauteng", 2002),new ContactDetails("0724446666", "lanei@mail.com")));
        customerList.add(new Customer(++customerCount,"Jade", "June","Male", new Address(200,"White", "Pretoria", "Gauteng", 2002),new ContactDetails("061222333", "lanei@mail.com")));
    }

    public CustomerServiceImpl(CustomerRepository customerRepository, AddressRepository addressRepository, ContactDetailsRepository contactDetailsRepository) {
        this.customerRepository = customerRepository;
        this.addressRepository = addressRepository;
        this.contactDetailsRepository = contactDetailsRepository;
    }

    public List<Customer> findAll() {
           return customerList;
    }

    public CustomerDto getCustomerById(long id) {
       // Predicate<? super Customer> predicate = customer -> customer.getId() == id;
        //return customerList.stream().filter(predicate).findFirst().orElse(null);
        Address address = addressRepository.findById(id).orElseThrow();
        ContactDetails contactDetails = contactDetailsRepository.findById(id).orElseThrow();
       Customer customer = customerRepository.findById(id).orElseThrow();

        return new CustomerDto(customer.getId(), customer.getFirstname(), customer.getLastname(), customer.getGender(), new AddressDto(address.getAddressId(),address.getStreetNumber(), address.getStreetName(),address.getCity(), address.getProvince(), address.getCode()), new Contact_DetailsDto(contactDetails.getContactId(),contactDetails.getCell(), contactDetails.getEmail()) );
    }

    public void deleteById(long id){
        Predicate<? super Customer> predicate = customer -> customer.getId() == id;
        customerList.removeIf(predicate);
    }

    public Customer save(Customer customer) {
        customer.setId(++customerCount);
        customerList.add(customer);
        return customer;
    }


}