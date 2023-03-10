package com.example.filhanterare.repo;

import com.example.filhanterare.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    Optional<AppUser> findAppUserByUsername(String username);
    Optional<AppUser> findAppUserById(long id);
    List<AppUser> findAll();
    Boolean existsAppUserByUsername(String username);
    Boolean existsAppUserByEmail(String email);
}
