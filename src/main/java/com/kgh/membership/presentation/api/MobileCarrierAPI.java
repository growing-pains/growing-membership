package com.kgh.membership.presentation.api;

import com.kgh.membership.application.dto.MobileCarrierDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface MobileCarrierAPI {

    @PostMapping
    ResponseEntity<MobileCarrierDTO.MobileCarrierResponse> create(@RequestBody MobileCarrierDTO.CreateMobileCarrier request);
}
