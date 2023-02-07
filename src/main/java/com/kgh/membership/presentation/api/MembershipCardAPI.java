package com.kgh.membership.presentation.api;

import com.kgh.membership.domain.model.mobile.MembershipCard;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface MembershipAPI {

    @PostMapping
    ResponseEntity<MembershipCard> create(@RequestBody MembershipCard membership);

    @GetMapping
    ResponseEntity<MembershipCard> findById(Long id);


}
