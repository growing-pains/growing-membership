package com.kgh.membership.presentation;

import com.kgh.membership.application.MobileCarrierService;
import com.kgh.membership.application.dto.MobileCarrierDTO;
import com.kgh.membership.presentation.api.MobileCarrierAPI;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RequiredArgsConstructor
@RequestMapping(MobileCarrierController.API_MOBILE_CARRIER)
@RestController
public class MobileCarrierController implements MobileCarrierAPI {
    public static final String API_MOBILE_CARRIER = "/api/carrier";


    private final MobileCarrierService mobileCarrierService;
    @Override
    @PostMapping
    public ResponseEntity<MobileCarrierDTO.MobileCarrierResponse> create(@RequestBody MobileCarrierDTO.CreateMobileCarrier request) {
        MobileCarrierDTO.MobileCarrierResponse response = mobileCarrierService.create(request);
        return ResponseEntity.created(URI.create(API_MOBILE_CARRIER + "/" + response.getId())).body(response);
    }

    @Override
    @GetMapping
    public ResponseEntity<List<MobileCarrierDTO.MobileCarrierResponse>> findAll() {
        List<MobileCarrierDTO.MobileCarrierResponse> allMobileCarriers = mobileCarrierService.findAll();
        return ResponseEntity.ok(allMobileCarriers);
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<MobileCarrierDTO.MobileCarrierResponse> findById(@CarrierId @PathVariable Long id) {
        MobileCarrierDTO.MobileCarrierResponse mobileCarrierResponse = mobileCarrierService.findByCarrierId(id);
        return ResponseEntity.ok(mobileCarrierResponse);
    }


}
