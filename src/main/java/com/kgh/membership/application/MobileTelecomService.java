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
    private final MobileTelecomRepository mobileTelecomRepository;
    public MobileTelecomDTO.MobileTelecomResponse create(MobileTelecomDTO.CreateMobileTelecom request) {
        MobileTelecom MobileTelecom = telecomVerifier.toEntity(request);
        MobileTelecom saved = mobileTelecomRepository.save(MobileTelecom);
        return MobileTelecomDTO.MobileTelecomResponse.from(saved);
    }
    public List<MobileTelecomDTO.MobileTelecomResponse> findAll() {
        List<MobileTelecom> allById = mobileTelecomRepository.findAll();
        return MobileTelecomDTO.MobileTelecomResponse.listFrom(allById);
    }

    public MobileTelecomDTO.MobileTelecomResponse findByMobileTelecomId(Long mobileTelecomId){
        MobileTelecom MobileTelecom = mobileTelecomRepository.findById(mobileTelecomId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 아이디 정보입니다. " + mobileTelecomId + " / "));
        return MobileTelecomDTO.MobileTelecomResponse.from(MobileTelecom);
    }
    public void delete(Long mobileTelecomId){
        MobileTelecom mobileTelecom = mobileTelecomRepository.findById(mobileTelecomId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 mobile telecom id =" + mobileTelecomId));
        if(mobileTelecom.isUserNotEqual(mobileTelecomId)){
            throw new IllegalArgumentException("mobileTelecomId가 일치하지 않습니다. userId = " + mobileTelecomId);
        }
        mobileTelecomRepository.deleteById(mobileTelecomId);
    }


}
