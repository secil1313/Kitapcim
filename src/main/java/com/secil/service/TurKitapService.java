package com.secil.service;

import com.secil.repository.entity.TurKitap;
import com.secil.repository.view.ITurKitapRepository;
import com.secil.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class TurKitapService extends ServiceManager<TurKitap,Long> {
    private final ITurKitapRepository repository;
    public TurKitapService(ITurKitapRepository repository){
        super(repository);
        this.repository=repository;
    }
    public void save(Long turId,Long kitapId){
        save(TurKitap.builder()
                .turid(turId)
                .kitapid(kitapId)
                .build());
    }
}
