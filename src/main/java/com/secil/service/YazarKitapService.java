package com.secil.service;

import com.secil.repository.entity.YazarKitap;
import com.secil.repository.view.IYazarKitapRepository;
import com.secil.utility.ServiceManager;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class YazarKitapService  extends ServiceManager<YazarKitap,Long> {
    private final IYazarKitapRepository repository;
    public YazarKitapService(IYazarKitapRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public void save(Long yazarId,Long kitapId){
        save(YazarKitap.builder()
                .yazarid(yazarId)
                .kitapid(kitapId)
                .build());
    }

    public List<Long> getAllByYazarid(Long yazarid){
        return repository.getAllByYazarid(yazarid);
    }
}

