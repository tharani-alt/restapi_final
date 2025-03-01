package com.example.demo.Repository;

import com.example.demo.Entity.User;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT u FROM User u WHERE u.lastName = :lastName")
    List<User> findByLastName(@Param("lastName") String lastName);
}
