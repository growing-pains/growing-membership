package com.kgh.membership.domain.model.mobile;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@Entity
public class MobileCarrier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String existPhoneNumber;

    @Column(nullable = false)
    private String registerPhoneNumber;

    @Column(nullable = false)
    private String name;

    private String address;

    @Column(nullable = false)
    private String carrierDiv;

    @Column(nullable = false)
    private String bizNo;

    @Column(nullable = false)
    private String bizNm;

    @Column(nullable = false)
    private String bizDiv;

    @CreatedDate
    private LocalDateTime createdDate;

    @LastModifiedDate
    private LocalDateTime lastModifiedDate;

}
