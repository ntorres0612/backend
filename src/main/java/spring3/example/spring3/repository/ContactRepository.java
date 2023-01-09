package spring3.example.spring3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring3.example.spring3.entity.Customer;

@Repository
public interface ContactRepository extends JpaRepository<Customer, Integer> {
}
