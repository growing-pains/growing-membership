## KGH 통신사 회원 멤버십 프로젝트

- 가상의 KGH 통신사 멤버십 애플리케이션
  
### #1 기획 및 요구사항

> 회원

- 회원은 통신사에 가입되어 있어야 멤버십에 회원가입이 가능하다. (단, 멤버십에 가입하기 위해서는 이메일 or 휴대폰번호 인증을 해야한다.)
- 멤버십에 가입한 유저별 등급이 부여된다.(등급은 그린, 블루, 레드, VIP 총 네가지가 존재한다.)
- 가맹점에서 사용이 가능한 유저별 바코드가 부여된다.
- 회원은 자신의 정보를 수정 가능하다.
  
> 할인

- 멤버십 등급에 따른 할인율 혜택을 제공받는다.
- 멤버십 유저는 3개월마다 한번씩 자신이 선택한 가맹점에 따른 최고의 할인율을 선택할 수 있다.

> 포인트

- 멤버십 등급에 따라 할인 가능한 KGH+ 포인트가 제공된다.
- 가맹점별 멤버십 혜택 이용시 KGH+ 포인트가 적립된다.
- 멤버십 유저는 사용한 KGH+ 포인트 내역을 확인 할 수 있다.

> 쿠폰
> 
- 멤버십 등급별 한달에 한개씩 중복 가능한 쿠폰이 발행된다.
- 멤버십 유저는 쿠폰 발급/사용 내역을 확인할 수 있다.

### #2 개발

- 모든 기능들은 단위테스트 기반으로 진행한다.
- 모든 코드의 기반은 클린코드를 지향한다.
- 아키텍처 구조는 DDD 아키텍처를 적용한다.
- 인증정보는 Spring Security를 적용한다.
- Gradle 기반 빌드 환경을 구성한다.
- Springboot2 JDK11 개발환경에서 진행한다.
- RDBMS MariaDB를 사용한다.
- WAS는 Tomcat 웹서버를 구축한다.
- 개발 관련된 기능을 git-flow에 기반한 이슈 관리를 진행한다.
- 모든 서버 로그파일을 기록할 수 있도록 관리한다.
- 테이블 버전 관리는 EXCEL로 관리되어지고 Major.Minor.Patch 형식으로 버전 표기 및 히스토리를 관리한다. 예) v.1.0.0
