package com.secil.repository.view;

import com.secil.repository.entity.TurKitap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITurKitapRepository extends JpaRepository<TurKitap,Long> {
}
