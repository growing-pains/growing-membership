package com.kgh.membership.application.verifier;

import com.kgh.membership.application.dto.MobileCarrierDTO;
import com.kgh.membership.domain.model.mobile.MobileCarrier;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class MobileCarrierVerifier {

    public MobileCarrier toEntity(MobileCarrierDTO.CreateMobileCarrier request){
        return MobileCarrier.builder()
                .id(null)
                .brdt(request.getBrdt())
                .existCarrierDiv(request.getExistCarrierDiv())
                .registerCarrierDiv(request.getRegisterCarrierDiv())
                .existPhoneNumber(request.getExistPhoneNumber())
                .registerPhoneNumber(request.getRegisterPhoneNumber())
                .name(request.getName())
                .address(request.getAddress())
                .carrierDiv(request.getCarrierDiv())
                .bizNo(request.getBizNo())
                .bizNm(request.getBizNm())
                .bizDiv(request.getBizDiv())
                .createdDate(null)
                .lastModifiedDate(null)
                .build();
    }
}
