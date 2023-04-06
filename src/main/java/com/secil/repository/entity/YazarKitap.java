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
@Table(name = "tblyazarkitap")
public class YazarKitap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//idyi otomatik arttırıyordu.

    Long id;
Long kitapid;
Long yazarid;

}
