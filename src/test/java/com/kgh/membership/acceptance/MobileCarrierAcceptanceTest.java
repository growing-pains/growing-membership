package com.kgh.membership.acceptance;

import com.kgh.membership.domain.model.mobile.MobileCarrier;
import com.kgh.membership.domain.model.mobile.MobileCarrierRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
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
        mobileCarrierRepository.save(new MobileCarrier(
                null,
                "1",
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

    }
    @Test
    void 통신사_멤버_개별_조회한다(){
        log.info("통신사 멤버 개별 조회");

    }
    @Test
    void 통신사_멤버_전체_조회한다(){
        log.info("통신사 멤버 전체 조회");
    }

}
