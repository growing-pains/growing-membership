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


        public Telecom toEntity(TelecomDTO.CreateTelecom Telecom){
            return Telecom.builder()
                    .id(null)
                    .brdt(Telecom.getBrdt())
                    .existTelecomDiv(Telecom.getExistTelecomDiv())
                    .registerTelecomDiv(Telecom.getRegisterTelecomDiv())
                    .existPhoneNumber(Telecom.getExistPhoneNumber())
                    .registerPhoneNumber(Telecom.getRegisterPhoneNumber())
                    .name(Telecom.getName())
                    .address(Telecom.getAddress())
                    .TelecomDiv(Telecom.getTelecomDiv())
                    .bizNo(Telecom.getBizNo())
                    .bizNm(Telecom.getBizNm())
                    .bizDiv(Telecom.getBizDiv())
                    .createdDate(null)
                    .createdDate(null)
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

        public static TelecomResponse from(Telecom Telecom){
            return TelecomResponse.builder()
                    .id(Telecom.getId())
                    .brdt(Telecom.getBrdt())
                    .existTelecomDiv(Telecom.getExistTelecomDiv())
                    .registerTelecomDiv(Telecom.getRegisterTelecomDiv())
                    .existPhoneNumber(Telecom.getExistPhoneNumber())
                    .registerPhoneNumber(Telecom.getRegisterPhoneNumber())
                    .name(Telecom.getName())
                    .address(Telecom.getAddress())
                    .TelecomDiv(Telecom.getTelecomDiv())
                    .bizNo(Telecom.getBizNo())
                    .bizNm(Telecom.getBizNm())
                    .bizDiv(Telecom.getBizDiv())
                    .createdDate(Telecom.getCreatedDate())
                    .createdDate(Telecom.getLastModifiedDate())
                    .build();
        }
        public static List<TelecomResponse> listFrom(List<Telecom> TelecomList) {
            return TelecomList.stream().map(Telecom -> TelecomResponse.builder()
                    .id(Telecom.getId())
                    .name(Telecom.getBrdt())
                    .address(Telecom.getAddress())
                    .registerPhoneNumber(Telecom.getRegisterPhoneNumber())
                    .createdDate(Telecom.getCreatedDate())
                    .lastModifiedDate(Telecom.getLastModifiedDate())
                    .build()).collect(Collectors.toList());
        }
    }


}
