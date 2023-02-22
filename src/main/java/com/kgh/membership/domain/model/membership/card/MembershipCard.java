package com.kgh.membership.domain.model.membership.card;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDate;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@Entity
@Builder
public class MembershipCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String mobileTelecomId;

    private String registerEmail;

    private String cardNo;

    private String address;

    private String phoneNumber;

    private String name;

    @CreatedDate
    @Column(updatable = false, nullable = false)
    private LocalDate createdDate;

    @LastModifiedDate
    private LocalDate lastModifiedDate;

    public boolean isMembershipCardIdNotEqual(Long membershipCardId) {
        return !this.id.equals(membershipCardId);
    }
}
