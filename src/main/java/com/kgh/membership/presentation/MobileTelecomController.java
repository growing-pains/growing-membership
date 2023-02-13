package com.kgh.membership.presentation;

import com.kgh.membership.application.MobileTelecomService;
import com.kgh.membership.application.dto.MobileTelecomDTO;
import com.kgh.membership.presentation.api.MobileTelecomAPI;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RequiredArgsConstructor
@RequestMapping(MobileTelecomController.API_MOBILE_TELECOM)
@RestController
public class MobileTelecomController implements MobileTelecomAPI {
    public static final String API_MOBILE_TELECOM = "/api/mobileTelecom";


    private final MobileTelecomService mobileTelecomService;
    @Override
    @PostMapping
    public ResponseEntity<MobileTelecomDTO.MobileTelecomResponse> create(@RequestBody MobileTelecomDTO.CreateMobileTelecom request) {
        MobileTelecomDTO.MobileTelecomResponse response = mobileTelecomService.create(request);
        return ResponseEntity.created(URI.create(API_MOBILE_TELECOM + "/" + response.getId())).body(response);
    }

    @Override
    @GetMapping
    public ResponseEntity<List<MobileTelecomDTO.MobileTelecomResponse>> findAll() {
        List<MobileTelecomDTO.MobileTelecomResponse> allMobileTelecoms = mobileTelecomService.findAll();
        return ResponseEntity.ok(allMobileTelecoms);
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<MobileTelecomDTO.MobileTelecomResponse> findById(@PathVariable Long id) {
        MobileTelecomDTO.MobileTelecomResponse MobileTelecomResponse = mobileTelecomService.findByMobileTelecomId(id);
        return ResponseEntity.ok(MobileTelecomResponse);
    }

    @Override
    @DeleteMapping("/{mobileTelecomId}")
    public ResponseEntity<Void> delete(@PathVariable Long mobileTelecomId) {
        mobileTelecomService.delete(mobileTelecomId);
        return ResponseEntity.noContent().build();
    }


}
