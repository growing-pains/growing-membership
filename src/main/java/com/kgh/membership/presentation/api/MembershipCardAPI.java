package com.kgh.membership.presentation.api;

import com.kgh.membership.application.dto.MembershipCardDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface MembershipCardAPI {

    @PostMapping
    ResponseEntity<MembershipCardDTO.MembershipCardResponse> create(@RequestBody MembershipCardDTO.CreateMembershipCard request);

    @GetMapping
    ResponseEntity<MembershipCardDTO.MembershipCardResponse> findById(Long membershipCardId);

    @GetMapping
    ResponseEntity<List<MembershipCardDTO.MembershipCardResponse>> findAll();

    @DeleteMapping
    ResponseEntity<Void> delete(Long membershipCardId);

}
