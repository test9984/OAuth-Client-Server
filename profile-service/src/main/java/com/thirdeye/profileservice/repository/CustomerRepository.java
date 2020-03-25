package com.thirdeye.profileservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.thirdeye.profileservice.model.Customer;

public interface CustomerRepository  extends JpaRepository<Customer,Integer> {
}
