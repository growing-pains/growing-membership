package com.kgh.membership.presentation.api;

import com.kgh.membership.application.dto.TelecomDTO;
import com.kgh.membership.presentation.TelecomId;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface TelecomAPI {

    @PostMapping
    ResponseEntity<TelecomDTO.TelecomResponse> create(@RequestBody TelecomDTO.CreateTelecom request);

    @GetMapping
    ResponseEntity<List<TelecomDTO.TelecomResponse>> findAll();

    @GetMapping
    ResponseEntity<TelecomDTO.TelecomResponse> findById(@TelecomId Long TelecomId);

}
