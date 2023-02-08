package com.kgh.membership.application.dto;

import com.kgh.membership.domain.model.mobile.Telecom;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
public class TelecomDTO {
    @NoArgsConstructor
    @Getter
    @AllArgsConstructor
    public static class CreateTelecom {
        private String id;
        private String brdt;
        private String existTelecomDiv;
        private String registerTelecomDiv;
        private String existPhoneNumber;
        private String registerPhoneNumber;
        private String name;
        private String address;
        private String TelecomDiv;
        private String bizNo;
        private String bizNm;
        private String bizDiv;
        private LocalDate createdDate;
        private LocalDate lastModifiedDate;


        public Telecom toEntity(TelecomDTO.CreateTelecom telecom){
            return Telecom.builder()
                    .id(null)
                    .brdt(telecom.getBrdt())
                    .existTelecomDiv(telecom.getExistTelecomDiv())
                    .registerTelecomDiv(telecom.getRegisterTelecomDiv())
                    .existPhoneNumber(telecom.getExistPhoneNumber())
                    .registerPhoneNumber(telecom.getRegisterPhoneNumber())
                    .name(telecom.getName())
                    .address(telecom.getAddress())
                    .TelecomDiv(telecom.getTelecomDiv())
                    .bizNo(telecom.getBizNo())
                    .bizNm(telecom.getBizNm())
                    .bizDiv(telecom.getBizDiv())
                    .createdDate(null)
                    .lastModifiedDate(null)
                    .build();
        }
    }

    @NoArgsConstructor
    @Getter
    @AllArgsConstructor
    @Builder
    public static class TelecomResponse{
        private Long id;
        private String brdt;
        private String existTelecomDiv;
        private String registerTelecomDiv;
        private String existPhoneNumber;
        private String registerPhoneNumber;
        private String name;
        private String address;
        private String TelecomDiv;
        private String bizNo;
        private String bizNm;
        private String bizDiv;
        private LocalDate createdDate;
        private LocalDate lastModifiedDate;

        public static TelecomResponse from(Telecom telecom){
            return TelecomResponse.builder()
                    .id(telecom.getId())
                    .brdt(telecom.getBrdt())
                    .existTelecomDiv(telecom.getExistTelecomDiv())
                    .registerTelecomDiv(telecom.getRegisterTelecomDiv())
                    .existPhoneNumber(telecom.getExistPhoneNumber())
                    .registerPhoneNumber(telecom.getRegisterPhoneNumber())
                    .name(telecom.getName())
                    .address(telecom.getAddress())
                    .TelecomDiv(telecom.getTelecomDiv())
                    .bizNo(telecom.getBizNo())
                    .bizNm(telecom.getBizNm())
                    .bizDiv(telecom.getBizDiv())
                    .createdDate(telecom.getCreatedDate())
                    .createdDate(telecom.getLastModifiedDate())
                    .build();
        }
        public static List<TelecomResponse> listFrom(List<Telecom> telecomList) {
            return telecomList.stream().map(telecom -> TelecomResponse.builder()
                    .id(telecom.getId())
                    .name(telecom.getBrdt())
                    .address(telecom.getAddress())
                    .registerPhoneNumber(telecom.getRegisterPhoneNumber())
                    .createdDate(telecom.getCreatedDate())
                    .lastModifiedDate(telecom.getLastModifiedDate())
                    .build()).collect(Collectors.toList());
        }
    }


}
