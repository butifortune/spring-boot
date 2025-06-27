package com.bk.manage_customer.customer;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class CustomerService {

   private static List<Customer> customerList = new ArrayList<>();
   private static long customerCount;

    static {
        customerList.add(new Customer(++customerCount,"Buti", "Komana","Male", new Address(23,"Albert", "Johannesburg", "Gauteng", 2001),new ContactDetails("0724445555", "buti@mail.com")));
        customerList.add(new Customer( ++customerCount,"Lero", "Lane","Female", new Address(200,"Relly", "Pretoria", "Gauteng", 2002),new ContactDetails("0724446666", "lanei@mail.com")));
        customerList.add(new Customer(++customerCount,"Jade", "June","Male", new Address(200,"White", "Pretoria", "Gauteng", 2002),new ContactDetails("061222333", "lanei@mail.com")));
    }

    public List<Customer> findAll() {
           return customerList;
    }

    public Customer findById(long id) {
        Predicate<? super Customer> predicate = customer -> customer.getId() == id;
        return customerList.stream().filter(predicate).findFirst().orElse(null);
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