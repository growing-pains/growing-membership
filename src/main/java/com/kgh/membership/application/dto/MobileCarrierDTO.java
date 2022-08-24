package com.kgh.membership.application.dto;

import com.kgh.membership.domain.model.mobile.MobileCarrier;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

public class MobileCarrierDTO {

    @NoArgsConstructor
    @Getter
    @AllArgsConstructor
    public static class CreateMobileCarrier {
        private String brdt;
        private String existCarrierDiv;
        private String registerCarrierDiv;
        private String existPhoneNumber;
        private String registerPhoneNumber;
        private String name;
        private String address;
        private String carrierDiv;
        private String bizNo;
        private String bizNm;
        private String bizDiv;
        private LocalDateTime createdDate;
        private LocalDateTime lastModifiedDate;


        public MobileCarrier toEntity(MobileCarrierDTO.CreateMobileCarrier mobileCarrier){
            return MobileCarrier.builder()
                    .id(null)
                    .existCarrierDiv(mobileCarrier.getExistCarrierDiv())
                    .registerCarrierDiv(mobileCarrier.getRegisterCarrierDiv())
                    .existPhoneNumber(mobileCarrier.getExistPhoneNumber())
                    .registerPhoneNumber(mobileCarrier.getRegisterPhoneNumber())
                    .name(mobileCarrier.getName())
                    .address(mobileCarrier.getAddress())
                    .carrierDiv(mobileCarrier.getCarrierDiv())
                    .bizNo(mobileCarrier.getBizNo())
                    .bizNm(mobileCarrier.getBizNm())
                    .bizDiv(mobileCarrier.getBizDiv())
                    .createdDate(null)
                    .createdDate(null)
                    .build();
        }
    }

    @NoArgsConstructor
    @Getter
    @AllArgsConstructor
    @Builder
    public static class MobileCarrierResponse{
        private Long id;
        private String brdt;
        private String existCarrierDiv;
        private String registerCarrierDiv;
        private String existPhoneNumber;
        private String registerPhoneNumber;
        private String name;
        private String address;
        private String carrierDiv;
        private String bizNo;
        private String bizNm;
        private String bizDiv;
        private LocalDateTime createdDate;
        private LocalDateTime lastModifiedDate;

        public static MobileCarrierResponse from(MobileCarrier mobileCarrier){
            return MobileCarrierResponse.builder()
                    .id(mobileCarrier.getId())
                    .existCarrierDiv(mobileCarrier.getExistCarrierDiv())
                    .registerCarrierDiv(mobileCarrier.getRegisterCarrierDiv())
                    .existPhoneNumber(mobileCarrier.getExistPhoneNumber())
                    .registerPhoneNumber(mobileCarrier.getRegisterPhoneNumber())
                    .name(mobileCarrier.getName())
                    .address(mobileCarrier.getAddress())
                    .carrierDiv(mobileCarrier.getCarrierDiv())
                    .bizNo(mobileCarrier.getBizNo())
                    .bizNm(mobileCarrier.getBizNm())
                    .bizDiv(mobileCarrier.getBizDiv())
                    .createdDate(mobileCarrier.getCreatedDate())
                    .createdDate(mobileCarrier.getLastModifiedDate())
                    .build();
        }

    }


}
