package com.secil.repository.view;

import com.secil.repository.entity.Kitap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IKitapRepository extends JpaRepository<Kitap,Long> {
    Optional<Kitap> findOptionalByAdIgnoreCase(String ad);
    @Query(value="select * from tblkitap as k\n" +
            "inner join tblturkitap as tk on  k.id=tk.kitapid \n" +
            "inner join tbltur as t on  t.id=tk.turid \n" +
            "where t.id=?1",nativeQuery = true)
    List<Kitap> findKitapByTur(Long turid);


}
