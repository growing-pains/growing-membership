package com.kgh.membership.presentation;

import com.kgh.membership.application.TelecomService;
import com.kgh.membership.application.dto.TelecomDTO;
import com.kgh.membership.presentation.api.TelecomAPI;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RequiredArgsConstructor
@RequestMapping(TelecomController.API_MOBILE_CARRIER)
@RestController
public class TelecomController implements TelecomAPI {
    public static final String API_MOBILE_CARRIER = "/api/carrier";


    private final TelecomService TelecomService;
    @Override
    @PostMapping
    public ResponseEntity<TelecomDTO.TelecomResponse> create(@RequestBody TelecomDTO.CreateTelecom request) {
        TelecomDTO.TelecomResponse response = TelecomService.create(request);
        return ResponseEntity.created(URI.create(API_MOBILE_CARRIER + "/" + response.getId())).body(response);
    }

    @Override
    @GetMapping
    public ResponseEntity<List<TelecomDTO.TelecomResponse>> findAll() {
        List<TelecomDTO.TelecomResponse> allTelecoms = TelecomService.findAll();
        return ResponseEntity.ok(allTelecoms);
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<TelecomDTO.TelecomResponse> findById(@CarrierId @PathVariable Long id) {
        TelecomDTO.TelecomResponse TelecomResponse = TelecomService.findByCarrierId(id);
        return ResponseEntity.ok(TelecomResponse);
    }



}
