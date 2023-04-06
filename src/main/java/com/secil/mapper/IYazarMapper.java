package com.secil.mapper;

import com.secil.dto.request.SaveYazarRequestDto;
import com.secil.repository.entity.Yazar;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE,componentModel = "spring")
public interface IYazarMapper {
    IYazarMapper INSTANCE= Mappers.getMapper(IYazarMapper.class);
    Yazar toYazar(final SaveYazarRequestDto dto);
}
