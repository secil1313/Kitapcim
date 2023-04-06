package com.secil.service;

import com.secil.repository.entity.Tur;
import com.secil.repository.view.ITurRepository;
import com.secil.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TurService extends ServiceManager<Tur,Long> {
    private final ITurRepository repository;
    public TurService(ITurRepository repository) {
        super(repository);
        this.repository=repository;
    }

    /**
     * Tur adı benzersiz olmalı uygulama için,
     * @param turAdi
     */
    public void save(String turAdi){
        Optional<Tur> tur=repository.findOptionalByAdIgnoreCase(turAdi);//var olan türün tekrardan yazılmasını engellemek için yaptığımız bir şey.
        if(tur.isEmpty())
            save(Tur.builder().ad(turAdi).build());//service managerdan gelen save.
    }
    public Tur findOptionalByAdIgnoreCase(String ad){
        Tur tur=repository.findOptionalByAdIgnoreCase(ad).get();
        return tur;
    }
}
