package com.kgh.membership.application.verifier;

import com.kgh.membership.application.dto.TelecomDTO;
import com.kgh.membership.domain.model.mobile.Telecom;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class TelecomVerifier {

    public Telecom toEntity(TelecomDTO.CreateTelecom request){
        return Telecom.builder()
                .id(null)
                .brdt(request.getBrdt())
                .existTelecomDiv(request.getExistTelecomDiv())
                .registerTelecomDiv(request.getRegisterTelecomDiv())
                .existPhoneNumber(request.getExistPhoneNumber())
                .registerPhoneNumber(request.getRegisterPhoneNumber())
                .name(request.getName())
                .address(request.getAddress())
                .TelecomDiv(request.getTelecomDiv())
                .bizNo(request.getBizNo())
                .bizNm(request.getBizNm())
                .bizDiv(request.getBizDiv())
                .createdDate(null)
                .lastModifiedDate(null)
                .build();
    }
}
