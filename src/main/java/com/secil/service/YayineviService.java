package com.secil.service;

import com.secil.dto.request.SaveYayineviRequestDto;
import com.secil.mapper.IYayineviMapper;
import com.secil.repository.view.IYayineviRepository;
import com.secil.repository.entity.Yayinevi;
import com.secil.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class YayineviService  extends ServiceManager<Yayinevi,Long> {
    private final IYayineviRepository yayineviRepository;
    public YayineviService(IYayineviRepository yayineviRepository) {
        super(yayineviRepository);
        this.yayineviRepository=yayineviRepository;
    }
    public void save(SaveYayineviRequestDto dto) {

            save(IYayineviMapper.INSTANCE.toYayinevi(dto));
    }
}
