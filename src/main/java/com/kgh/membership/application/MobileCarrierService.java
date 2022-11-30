package com.kgh.membership.application;

import com.kgh.membership.application.dto.MobileCarrierDTO;
import com.kgh.membership.application.verifier.MobileCarrierVerifier;
import com.kgh.membership.domain.model.mobile.MobileCarrier;
import com.kgh.membership.domain.model.mobile.MobileCarrierRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;


@RequiredArgsConstructor
@Service
public class MobileCarrierService {
    private final MobileCarrierVerifier mobileCarrierVerifier;
    private final MobileCarrierRepository mobileCarrierRepository;
    public MobileCarrierDTO.MobileCarrierResponse create(MobileCarrierDTO.CreateMobileCarrier request) {
        MobileCarrier mobileCarrier = mobileCarrierVerifier.toEntity(request);
        MobileCarrier saved = mobileCarrierRepository.save(mobileCarrier);
        return MobileCarrierDTO.MobileCarrierResponse.from(saved);
    }

    public List<MobileCarrierDTO.MobileCarrierResponse> findAll() {
        List<MobileCarrier> allById = mobileCarrierRepository.findAll();
        return MobileCarrierDTO.MobileCarrierResponse.listFrom(allById);
    }

    public MobileCarrierDTO.MobileCarrierResponse findByCarrierId(Long carrierId){
        MobileCarrier mobileCarrier = mobileCarrierRepository.findById(carrierId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 아이디 정보입니다. " + carrierId + " / "));
        return MobileCarrierDTO.MobileCarrierResponse.from(mobileCarrier);

    }
}
