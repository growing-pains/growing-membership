package com.kgh.membership.presentation.api;

import com.kgh.membership.application.dto.MobileCarrierDTO;
import com.kgh.membership.presentation.CarrierId;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface MobileCarrierAPI {

    @PostMapping
    ResponseEntity<MobileCarrierDTO.MobileCarrierResponse> create(@RequestBody MobileCarrierDTO.CreateMobileCarrier request);


    @GetMapping
    ResponseEntity<List<MobileCarrierDTO.MobileCarrierResponse>> findAll();

    @GetMapping
    ResponseEntity<MobileCarrierDTO.MobileCarrierResponse> findById(@CarrierId Long carrierId);
}
