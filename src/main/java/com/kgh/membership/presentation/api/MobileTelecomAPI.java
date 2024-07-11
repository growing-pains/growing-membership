package com.kgh.membership.presentation.api;

import com.kgh.membership.application.dto.MobileTelecomDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface MobileTelecomAPI {

    @PostMapping
    ResponseEntity<MobileTelecomDTO.MobileTelecomResponse> create(@RequestBody MobileTelecomDTO.CreateMobileTelecom request);

    @GetMapping
    ResponseEntity<MobileTelecomDTO.MobileTelecomResponse> findById(Long mobileTelecomId);

    @GetMapping
    ResponseEntity<List<MobileTelecomDTO.MobileTelecomResponse>> findAll();

    @DeleteMapping
    ResponseEntity<Void> delete(Long mobileTelecomId);

}
