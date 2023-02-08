package com.kgh.membership.acceptance;

import com.kgh.membership.domain.model.mobile.MobileTelecom;
import com.kgh.membership.domain.model.mobile.MobileTelecomRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;


@Slf4j
public class MobileTelecomAcceptanceTest extends AcceptanceTest {
    @Autowired
    private MobileTelecomRepository telecomRepository;

    @BeforeEach
    void init(){
        super.init();
    }

    @Test
    void 통신사_멤버_가입한다(){
        log.info("통신사 멤버 가입");
        MobileTelecom telecom = telecomRepository.save(new MobileTelecom(
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
                () -> assertThat(telecom.getId()).isEqualTo(2L),
                () -> assertThat(telecom.getBrdt()).isEqualTo("940525"),
                () -> assertThat(telecom.getMobileTelecomDiv()).isEqualTo("1"),
                () -> assertThat(telecom.getExistMobileTelecomDiv()).isEqualTo("1"),
                () -> assertThat(telecom.getRegisterMobileTelecomDiv()).isEqualTo("1"),
                () -> assertThat(telecom.getName()).isEqualTo("gwanhyeon"),
                () -> assertThat(telecom.getBizDiv()).isEqualTo("1"),
                () -> assertThat(telecom.getCreatedDate()).isNotNull(),
                () -> assertThat(telecom.getCreatedDate()).isEqualTo(LocalDate.now()),
                () -> assertThat(telecom.getLastModifiedDate()).isNotNull(),
                () -> assertThat(telecom.getLastModifiedDate()).isEqualTo(LocalDate.now())
        );
    }
    @Test
    void 통신사_멤버_개별_조회한다(){
        통신사_멤버_가입한다();
        Optional<MobileTelecom> response = telecomRepository.findById(1L);
        MobileTelecom telecom = response.orElseGet(null);

        assertAll(
                () -> assertThat(telecom.getId()).isEqualTo(1L),
                () -> assertThat(telecom.getMobileTelecomDiv()).isEqualTo("1"),
                () -> assertThat(telecom.getName()).isEqualTo("gwanhyeon"),
                () -> assertThat(telecom.getBizNm()).isNotNull(),
                () -> assertThat(telecom.getBrdt()).isEqualTo("940525"),
                () -> assertThat(telecom.getCreatedDate()).isEqualTo(LocalDate.now()),
                () -> assertThat(telecom.getLastModifiedDate()).isEqualTo(LocalDate.now())
        );
    }
    @Test
    void 통신사_멤버_전체_조회한다(){
        List<MobileTelecom> telecoms = telecomRepository.findAll();
        assertAll(
                () -> assertThat(telecoms.get(0).getId()).isEqualTo(1L)
        );
    }


}
