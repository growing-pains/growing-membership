package com.kgh.membership.domain.model.mobile;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@Entity
@Builder
public class Telecom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brdt;

    private String existTelecomDiv;

    private String registerTelecomDiv;

    private String existPhoneNumber;

    @Column(nullable = false)
    private String registerPhoneNumber;

    @Column(nullable = false)
    private String name;

    private String address;

    @Column(nullable = false)
    private String TelecomDiv;

    @Column(nullable = false)
    private String bizNo;

    @Column(nullable = false)
    private String bizNm;

    @Column(nullable = false)
    private String bizDiv;

    @CreatedDate
    @Column(updatable = false, nullable = false)
    private LocalDate createdDate;

    @LastModifiedDate
    private LocalDate lastModifiedDate;

}