package com.kgh.membership.application.verifier;

import com.kgh.membership.application.dto.MobileTelecomDTO;
import com.kgh.membership.domain.model.mobile.MobileTelecom;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class MobileTelecomVerifier {

    public MobileTelecom toEntity(MobileTelecomDTO.CreateMobileTelecom request){
        return MobileTelecom.builder()
                .id(null)
                .brdt(request.getBrdt())
                .existMobileTelecomDiv(request.getExistMobileTelecomDiv())
                .registerMobileTelecomDiv(request.getRegisterMobileTelecomDiv())
                .existPhoneNumber(request.getExistPhoneNumber())
                .registerPhoneNumber(request.getRegisterPhoneNumber())
                .name(request.getName())
                .address(request.getAddress())
                .MobileTelecomDiv(request.getMobileTelecomDiv())
                .bizNo(request.getBizNo())
                .bizNm(request.getBizNm())
                .bizDiv(request.getBizDiv())
                .createdDate(null)
                .lastModifiedDate(null)
                .build();
    }
}
