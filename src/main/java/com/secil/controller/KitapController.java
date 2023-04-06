package com.secil.controller;

import com.secil.dto.request.SaveKitapRequestDto;
import com.secil.dto.response.FindByYazarAdiResponseDto;
import com.secil.repository.entity.Kitap;
import com.secil.service.KitapService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static com.secil.constants.EndPointList.*;
@RestController
@RequestMapping(KITAP)
@RequiredArgsConstructor
public class KitapController {
    private final KitapService kitapService;

    /**
     * Aşağıdaki methodu onun altındakine mapper sayesinde dtolu döndürdük kısaldı ve esneklesti.

    @GetMapping(SAVE)
    public ResponseEntity<Kitap> saveKitap(String ad,String yazar,String yayinevi){
        Kitap kitap=kitapService.save(Kitap.builder()
                .ad(ad)
                .yayinevi(yayinevi)
                .yazar(yazar).build());
        return ResponseEntity.ok(kitap);
    }*/
    @PostMapping(SAVE)
    public ResponseEntity<Kitap> saveKitap(@Valid SaveKitapRequestDto dto){
        return ResponseEntity.ok(kitapService.save(dto));
    }

    @GetMapping(FIND_ALL)
    public ResponseEntity<List<Kitap>> findAll(){

        return ResponseEntity.ok(kitapService.findAll());
    }


    /**
     *
     * Controller katmanında alınan ve iletilen tüm datalar
     * DTO(Data Transfer Object) olarak kullanılmalıdır.
     * RequestDTO ve ResponseDTO
     *
     * Repository ile bir veritabanından bilgi çekiliyor ise bu çekilen bilgilerde entity dışında bellir bir özellikle
     * bütünü olarak çekilecek ise View kullanılmalıdır.
     */
    //kitabın adını verince yazar listesi gelsin
    //tür vercem türe ait hangi kitaplar olduğunu bul
    @GetMapping(FIND_BY_YAZARADI)
    public ResponseEntity<List<FindByYazarAdiResponseDto>> findByYazarAdi(String yazarAdi){
        List<FindByYazarAdiResponseDto> result = kitapService.findByYazarAdi(yazarAdi);
        return ResponseEntity.ok(result);
    }
}
