package com.secil.repository.view;

import com.secil.repository.entity.Yayinevi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IYayineviRepository extends JpaRepository<Yayinevi,Long> {
    Optional<Yayinevi> findOptionalByAdIgnoreCase(String ad);
}
