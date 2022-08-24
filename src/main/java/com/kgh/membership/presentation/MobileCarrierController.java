package com.kgh.membership.presentation;

import com.kgh.membership.application.MobileCarrierService;
import com.kgh.membership.application.dto.MobileCarrierDTO;
import com.kgh.membership.presentation.api.MobileCarrierAPI;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.URI;

@RequiredArgsConstructor
@RequestMapping(MobileCarrierController.API_MOBILE_CARRIER)
public class MobileCarrierController implements MobileCarrierAPI {
    public static final String API_MOBILE_CARRIER = "/api/carrier";

    private final MobileCarrierService mobileCarrierService;
    @Override
    public ResponseEntity<MobileCarrierDTO.MobileCarrierResponse> create(MobileCarrierDTO.CreateMobileCarrier request) {
        MobileCarrierDTO.MobileCarrierResponse response = mobileCarrierService.create(request);
        return ResponseEntity.created(URI.create(API_MOBILE_CARRIER + "/" + response.getId())).body(response);

    }
}
