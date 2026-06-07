package com.gani.ExampleCustomerService.repo;

import com.gani.ExampleCustomerService.entity.AccountDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<AccountDetails,Long> {
}
