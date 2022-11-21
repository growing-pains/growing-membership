package com.kgh.membership.application;

import com.kgh.membership.application.dto.MobileCarrierDTO;
import com.kgh.membership.application.verifier.MobileCarrierVerifier;
import com.kgh.membership.domain.model.mobile.MobileCarrier;
import com.kgh.membership.domain.model.mobile.MobileCarrierRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MobileCarrierService {
    private final MobileCarrierVerifier mobileCarrierVerifier;
    private final MobileCarrierRepository mobileCarrierRepository;
    public MobileCarrierDTO.MobileCarrierResponse create(MobileCarrierDTO.CreateMobileCarrier request) {
        MobileCarrier mobileCarrier = mobileCarrierVerifier.toEntity(request);
        MobileCarrier saved = mobileCarrierRepository.save(mobileCarrier);
        return MobileCarrierDTO.MobileCarrierResponse.from(saved);
    }
}
