package com.secil.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tblkitap")
public class Kitap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//idyi otomatik arttırıyordu.

    Long id;

    String ad;
    //String yazarId;//ManyToMany-->ara tabloya işledik
    //String turId;//ManyToMany-->ara tabloya işledik
    Long yayineviid;//ManyToOne
    Integer sayfasayisi;
    Long basimtarihi;
}
