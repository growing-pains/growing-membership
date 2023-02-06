package com.kgh.membership.acceptance;

import com.kgh.membership.domain.model.mobile.MobileCarrier;
import com.kgh.membership.domain.model.mobile.MobileCarrierRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


@Slf4j
public class MobileCarrierAcceptanceTest extends AcceptanceTest {
    @Autowired
    private MobileCarrierRepository mobileCarrierRepository;

    @BeforeEach
    void init(){
        super.init();
    }

    @Test
    void 통신사_멤버_가입한다(){
        log.info("통신사 멤버 가입");
        MobileCarrier mobileCarrier = mobileCarrierRepository.save(new MobileCarrier(
                null,
                "940525",
                "1",
                "1",
                "01012341234",
                "2",
                "gwanhyeon",
                "in Gwanak-gu, Seoul",
                "1",
                "1234567890",
                "108724231",
                "1",
                null,
                null
        ));
        assertAll (
                () -> assertThat(mobileCarrier.getId()).isEqualTo(2L),
                () -> assertThat(mobileCarrier.getBrdt()).isEqualTo("940525"),
                () -> assertThat(mobileCarrier.getCarrierDiv()).isEqualTo("1"),
                () -> assertThat(mobileCarrier.getExistCarrierDiv()).isEqualTo("1"),
                () -> assertThat(mobileCarrier.getRegisterCarrierDiv()).isEqualTo("1"),
                () -> assertThat(mobileCarrier.getName()).isEqualTo("gwanhyeon"),
                () -> assertThat(mobileCarrier.getBizDiv()).isEqualTo("1"),
                () -> assertThat(mobileCarrier.getCreatedDate()).isNotNull(),
                () -> assertThat(mobileCarrier.getCreatedDate()).isEqualTo(LocalDate.now()),
                () -> assertThat(mobileCarrier.getLastModifiedDate()).isNotNull(),
                () -> assertThat(mobileCarrier.getLastModifiedDate()).isEqualTo(LocalDate.now())
        );
    }
    @Test
    void 통신사_멤버_개별_조회한다(){
        통신사_멤버_가입한다();
        Optional<MobileCarrier> response = mobileCarrierRepository.findById(1L);
        MobileCarrier mobileCarrier = response.orElseGet(null);

        assertAll(
                () -> assertThat(mobileCarrier.getId()).isEqualTo(1L),
                () -> assertThat(mobileCarrier.getCarrierDiv()).isEqualTo("1"),
                () -> assertThat(mobileCarrier.getName()).isEqualTo("gwanhyeon"),
                () -> assertThat(mobileCarrier.getBizNm()).isNotNull(),
                () -> assertThat(mobileCarrier.getBrdt()).isEqualTo("940525"),
                () -> assertThat(mobileCarrier.getCreatedDate()).isEqualTo(LocalDate.now()),
                () -> assertThat(mobileCarrier.getLastModifiedDate()).isEqualTo(LocalDate.now())
        );
    }
    @Test
    void 통신사_멤버_전체_조회한다(){
        List<MobileCarrier> mobileCarriers = mobileCarrierRepository.findAll();
        assertAll(
                () -> assertThat(mobileCarriers.get(0).getId()).isEqualTo(1L)
        );
    }


}
