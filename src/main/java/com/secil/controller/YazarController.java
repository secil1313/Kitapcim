package com.secil.controller;

import com.secil.dto.request.SaveYazarRequestDto;
import com.secil.repository.entity.Yazar;
import com.secil.service.YazarService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static com.secil.constants.EndPointList.FIND_ALL;
import static com.secil.constants.EndPointList.*;

@RestController
@RequestMapping(YAZAR)
@RequiredArgsConstructor
public class YazarController {
    private final YazarService yazarService;

    @PostMapping(SAVE)
    public ResponseEntity<Void> save(@RequestBody @Valid SaveYazarRequestDto dto){
        yazarService.save(dto);
        return ResponseEntity.ok().build();
    }

    @GetMapping(FIND_ALL)
    public ResponseEntity<List<Yazar>> findAll(){
        return ResponseEntity.ok(yazarService.findAll());
    }
}

