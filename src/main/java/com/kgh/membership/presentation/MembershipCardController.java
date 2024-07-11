package com.kgh.membership.presentation;

import com.kgh.membership.application.MembershipCardService;
import com.kgh.membership.application.dto.MembershipCardDTO;
import com.kgh.membership.presentation.api.MembershipCardAPI;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RequiredArgsConstructor
@RequestMapping(MembershipCardController.API_MEMBERSHIP_CARD)
@RestController
public class MembershipCardController implements MembershipCardAPI {
    public static final String API_MEMBERSHIP_CARD = "/api/membership-card";
    private final MembershipCardService memberShipCardService;

    @Override
    @PostMapping
    public ResponseEntity<MembershipCardDTO.MembershipCardResponse> create(@RequestBody MembershipCardDTO.CreateMembershipCard request) {
        MembershipCardDTO.MembershipCardResponse response = memberShipCardService.create(request);
        return ResponseEntity.created(URI.create(API_MEMBERSHIP_CARD + "/" + response.getId())).body(response);
    }

    @Override
    @GetMapping("/{membershipCardId}")
    public ResponseEntity<MembershipCardDTO.MembershipCardResponse> findById(@PathVariable Long membershipCardId) {
        MembershipCardDTO.MembershipCardResponse response = memberShipCardService.findByMembershipCardId(membershipCardId);
        return ResponseEntity.ok(response);
    }

    @Override
    @GetMapping
    public ResponseEntity<List<MembershipCardDTO.MembershipCardResponse>> findAll() {
        List<MembershipCardDTO.MembershipCardResponse> response = memberShipCardService.findAll();
        return ResponseEntity.ok(response);
    }

    @Override
    @DeleteMapping("/{membershipCardId}")
    public ResponseEntity<Void> delete(@PathVariable Long membershipCardId) {
        memberShipCardService.delete(membershipCardId);
        return ResponseEntity.noContent().build();
    }
}
