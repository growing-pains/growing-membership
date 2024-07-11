package com.kgh.membership.application.dto;

import com.kgh.membership.domain.model.membership.card.MembershipCard;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class MembershipCardDTO {

    @NoArgsConstructor
    @Getter
    @AllArgsConstructor
    public static class CreateMembershipCard{
        private Long id;
        private String mobileTelecomId;
        private String registerEmail;
        private String cardNo;
        private String address;
        private String phoneNumber;
        private String name;
        private LocalDate createdDate;
        private LocalDate lastModifiedDate;

        public static MembershipCard toEntity(MembershipCardDTO.CreateMembershipCard createMembershipCard){
            return MembershipCard.builder()
                    .id(null)
                    .mobileTelecomId(createMembershipCard.getMobileTelecomId())
                    .registerEmail(createMembershipCard.getRegisterEmail())
                    .cardNo(createMembershipCard.getCardNo())
                    .address(createMembershipCard.getAddress())
                    .phoneNumber(createMembershipCard.getPhoneNumber())
                    .name(createMembershipCard.getName())
                    .createdDate(createMembershipCard.getCreatedDate())
                    .lastModifiedDate(createMembershipCard.getLastModifiedDate())
                    .build();
        }

    }
    @NoArgsConstructor
    @Getter
    @AllArgsConstructor
    @Builder
    public static class MembershipCardResponse{
        private Long id;
        private String mobileTelecomId;
        private String registerEmail;
        private String cardNo;
        private String address;
        private String phoneNumber;
        private String name;
        private LocalDate createdDate;
        private LocalDate lastModifiedDate;
        public static MembershipCardResponse from(MembershipCard membershipCard){
            return MembershipCardResponse.builder()
                    .id(membershipCard.getId())
                    .mobileTelecomId(membershipCard.getMobileTelecomId())
                    .registerEmail(membershipCard.getRegisterEmail())
                    .cardNo(membershipCard.getCardNo())
                    .address(membershipCard.getAddress())
                    .phoneNumber(membershipCard.getPhoneNumber())
                    .name(membershipCard.getName())
                    .createdDate(membershipCard.getCreatedDate())
                    .lastModifiedDate(membershipCard.getLastModifiedDate())
                    .build();
        }
        public static List<MembershipCardResponse> listForm(List<MembershipCard> membershipCards){
            return membershipCards.stream().map(membershipCard -> MembershipCardResponse.builder()
                    .id(membershipCard.getId())
                    .mobileTelecomId(membershipCard.getMobileTelecomId())
                    .registerEmail(membershipCard.getRegisterEmail())
                    .cardNo(membershipCard.getCardNo())
                    .address(membershipCard.getAddress())
                    .name(membershipCard.getName())
                    .createdDate(membershipCard.getCreatedDate())
                    .lastModifiedDate(membershipCard.getLastModifiedDate())
                    .build()).collect(Collectors.toList());
        }
    }

}
