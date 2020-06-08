package com.demetm.issueproje.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Data
@MappedSuperclass //tüm tablolarda kullanılmasını sağlıyor

public abstract class BaseEntity implements Serializable { //her tabloda olmasını istediğim özellikler
    @Temporal(TemporalType.TIMESTAMP)//tarih alanının veri tipi (saniye dakika saat gün ay yıl)
    @Column(name = "created_at") //kolonların özellikler
    private Date createdAt; //kaydı ne zaman ekledi

    @Column(name = "created_by", length = 50)
    private String createdBy; //kaydı kim ekledi

    @Column(name = "updated_at")
    private Date updatedAt;// ne zaman güncelledi

    @Column(name = "updated_by", length = 50)
    private String updatedBy; //kim güncelledi

    @Column(name = "status")
    private Boolean status; //kaydın durumu

}
