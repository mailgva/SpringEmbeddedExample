package com.gorbatenko.embed.repository;

import com.gorbatenko.embed.model.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface PhoneRepository extends JpaRepository<Phone, Integer> {
}
