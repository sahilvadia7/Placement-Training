package com.bank.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo extends JpaRepository<Account, Long> {
    // Define any custom query methods here if needed
}
