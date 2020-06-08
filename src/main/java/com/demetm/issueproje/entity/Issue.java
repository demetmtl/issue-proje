package com.demetm.issueproje.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by temelt on 3.02.2019.
 */
@Entity //tabloya karşılık gelir
@Table(name = "issue") //tablo özelliklerini belirtme
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Issue extends BaseEntity {//kalıtım yoluyla 5 kolon eklenmiş oldu

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)//id nin otomotik oluşturulması
    private Long id;//primary key

    @Column(name = "description", length = 1000)
    private String description;//açıklama

    @Column(name = "details", length = 4000)
    private String details;

    @Column(name = "date")
    private Date date;//tarih

    @Column(name = "issue_status")
    @Enumerated(EnumType.STRING)
    private IssueStatus issueStatus;//durum - bunu için ayrı bir enum açıldı

    @JoinColumn(name = "assignee_user_id")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)//tablolar arası ilişkilendirme
    private User assignee;//birçok ısue classı bir tane user ile ilişkilendirilebilir

    @JoinColumn(name = "project_id")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private Project project;


}
