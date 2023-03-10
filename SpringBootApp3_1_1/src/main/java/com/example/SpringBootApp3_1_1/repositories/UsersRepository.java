package com.example.SpringBootApp3_1_1.repositories;

import com.example.SpringBootApp3_1_1.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<User, Integer> {
}
