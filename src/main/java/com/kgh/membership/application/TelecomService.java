package com.kgh.membership.application;

import com.kgh.membership.application.dto.TelecomDTO;
import com.kgh.membership.application.verifier.TelecomVerifier;
import com.kgh.membership.domain.model.mobile.Telecom;
import com.kgh.membership.domain.model.mobile.TelecomRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;


@RequiredArgsConstructor
@Service
public class TelecomService {
    private final TelecomVerifier telecomVerifier;
    private final TelecomRepository telecomRepository;
    public TelecomDTO.TelecomResponse create(TelecomDTO.CreateTelecom request) {
        Telecom Telecom = telecomVerifier.toEntity(request);
        Telecom saved = telecomRepository.save(Telecom);
        return TelecomDTO.TelecomResponse.from(saved);
    }
    public List<TelecomDTO.TelecomResponse> findAll() {
        List<Telecom> allById = telecomRepository.findAll();
        return TelecomDTO.TelecomResponse.listFrom(allById);
    }

    public TelecomDTO.TelecomResponse findByTelecomId(Long TelecomId){
        Telecom Telecom = telecomRepository.findById(TelecomId)
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 아이디 정보입니다. " + TelecomId + " / "));
        return TelecomDTO.TelecomResponse.from(Telecom);

    }
}
