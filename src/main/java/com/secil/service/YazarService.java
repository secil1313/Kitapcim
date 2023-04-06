package com.secil.service;

import com.secil.dto.request.SaveYazarRequestDto;
import com.secil.mapper.IYazarMapper;
import com.secil.repository.view.IYazarRepository;
import com.secil.repository.entity.Yazar;
import com.secil.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class YazarService extends ServiceManager<Yazar,Long> {
    private final IYazarRepository repository;
    public YazarService(IYazarRepository repository){
        super(repository);
        this.repository=repository;
    }

    public void save(SaveYazarRequestDto dto){
        Optional<Yazar> yazar = repository.findOptionalByAdIgnoreCase(dto.getAd());
        if(yazar.isEmpty())
            //repository.save(Yazar.builder().ad(dto.getAd()).biyografi(dto.getBiyografi()).build());
            save(IYazarMapper.INSTANCE.toYazar(dto));
    }

    public List<Yazar> findAllByAdContaining(String ad){
        return repository.findAllByAdContaining(ad);
    }
}