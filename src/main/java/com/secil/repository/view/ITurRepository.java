package com.secil.repository.view;

import com.secil.repository.entity.Tur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ITurRepository extends JpaRepository<Tur,Long> {
    /**
     * Tür adının sorgulanarak veritabanında olup olmadığına bakılır.
     * @param ad->
     * @return->Optional olarak bulunan tür adı döndürülür.
     */
    Optional<Tur> findOptionalByAdIgnoreCase(String ad);
}
