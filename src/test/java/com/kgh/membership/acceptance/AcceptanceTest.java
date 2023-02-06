package com.kgh.membership.acceptance;

import com.kgh.membership.domain.model.mobile.MobileCarrier;
import com.kgh.membership.domain.model.mobile.MobileCarrierRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

/**
 * 모든 테스트 호출 로직을 진행한다.
 * 테스트시 전체적인 로그인 혹은 세션처리를 모두 함께 진행한다.
 * 각각의 기능별 테스트는 하나의 TEST 클래스로 분리하여 처리한다.
 * Given-When-Then 패턴에 따른다.
 */
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
@Slf4j
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AcceptanceTest {

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext context;

    @Autowired
    private MobileCarrierRepository mobileCarrierRepository;

    @BeforeEach
    void init(){
        mockMvc = MockMvcBuilders.webAppContextSetup(context)
                .addFilter(new CharacterEncodingFilter("UTF-8", true))
                .alwaysDo(print())
                .build();
        signUp();
    }
    protected MobileCarrier signUp(){
        return mobileCarrierRepository.save(
                new MobileCarrier(
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
                )
        );
    }
    protected void 통신사_회원_생성(){

    }
    protected void 통신사_회원_조회(){

    }


}
