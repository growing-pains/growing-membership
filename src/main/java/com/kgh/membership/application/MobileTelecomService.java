package com.kgh.membership.application;

import com.kgh.membership.application.dto.MobileTelecomDTO;
import com.kgh.membership.application.verifier.MobileTelecomVerifier;
import com.kgh.membership.domain.model.mobile.MobileTelecom;
import com.kgh.membership.domain.model.mobile.MobileTelecomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Service
public class MobileTelecomService {
    private final MobileTelecomVerifier telecomVerifier;
    private final MobileTelecomRepository telecomRepository;
    public MobileTelecomDTO.MobileTelecomResponse create(MobileTelecomDTO.CreateMobileTelecom request) {
        MobileTelecom MobileTelecom = telecomVerifier.toEntity(request);
        MobileTelecom saved = telecomRepository.save(MobileTelecom);
        return MobileTelecomDTO.MobileTelecomResponse.from(saved);
    }
    public List<MobileTelecomDTO.MobileTelecomResponse> findAll() {
        List<MobileTelecom> allById = telecomRepository.findAll();
        return MobileTelecomDTO.MobileTelecomResponse.listFrom(allById);
    }

    public MobileTelecomDTO.MobileTelecomResponse findByMobileTelecomId(Long MobileTelecomId){
        MobileTelecom MobileTelecom = telecomRepository.findById(MobileTelecomId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 아이디 정보입니다. " + MobileTelecomId + " / "));
        return MobileTelecomDTO.MobileTelecomResponse.from(MobileTelecom);

    }
}
