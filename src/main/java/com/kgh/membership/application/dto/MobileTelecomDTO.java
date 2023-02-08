package com.kgh.membership.application.dto;

import com.kgh.membership.domain.model.mobile.MobileTelecom;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class MobileTelecomDTO {
    @NoArgsConstructor
    @Getter
    @AllArgsConstructor
    public static class CreateMobileTelecom {
        private String id;
        private String brdt;
        private String existMobileTelecomDiv;
        private String registerMobileTelecomDiv;
        private String existPhoneNumber;
        private String registerPhoneNumber;
        private String name;
        private String address;
        private String MobileTelecomDiv;
        private String bizNo;
        private String bizNm;
        private String bizDiv;
        private LocalDate createdDate;
        private LocalDate lastModifiedDate;


        public MobileTelecom toEntity(MobileTelecomDTO.CreateMobileTelecom telecom){
            return MobileTelecom.builder()
                    .id(null)
                    .brdt(telecom.getBrdt())
                    .existMobileTelecomDiv(telecom.getExistMobileTelecomDiv())
                    .registerMobileTelecomDiv(telecom.getRegisterMobileTelecomDiv())
                    .existPhoneNumber(telecom.getExistPhoneNumber())
                    .registerPhoneNumber(telecom.getRegisterPhoneNumber())
                    .name(telecom.getName())
                    .address(telecom.getAddress())
                    .MobileTelecomDiv(telecom.getMobileTelecomDiv())
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
    public static class MobileTelecomResponse{
        private Long id;
        private String brdt;
        private String existMobileTelecomDiv;
        private String registerMobileTelecomDiv;
        private String existPhoneNumber;
        private String registerPhoneNumber;
        private String name;
        private String address;
        private String MobileTelecomDiv;
        private String bizNo;
        private String bizNm;
        private String bizDiv;
        private LocalDate createdDate;
        private LocalDate lastModifiedDate;

        public static MobileTelecomResponse from(MobileTelecom telecom){
            return MobileTelecomResponse.builder()
                    .id(telecom.getId())
                    .brdt(telecom.getBrdt())
                    .existMobileTelecomDiv(telecom.getExistMobileTelecomDiv())
                    .registerMobileTelecomDiv(telecom.getRegisterMobileTelecomDiv())
                    .existPhoneNumber(telecom.getExistPhoneNumber())
                    .registerPhoneNumber(telecom.getRegisterPhoneNumber())
                    .name(telecom.getName())
                    .address(telecom.getAddress())
                    .MobileTelecomDiv(telecom.getMobileTelecomDiv())
                    .bizNo(telecom.getBizNo())
                    .bizNm(telecom.getBizNm())
                    .bizDiv(telecom.getBizDiv())
                    .createdDate(telecom.getCreatedDate())
                    .createdDate(telecom.getLastModifiedDate())
                    .build();
        }
        public static List<MobileTelecomResponse> listFrom(List<MobileTelecom> telecomList) {
            return telecomList.stream().map(telecom -> MobileTelecomResponse.builder()
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
