# Java Design Patterns

GoF 디자인 패턴 23가지를 Java 예제로 직접 구현하며 정리한 학습 저장소입니다.

- 참고 강의: 백기선, 「코딩으로 학습하는 GoF의 디자인 패턴」(인프런). 강의 예제를 따라 구현하며 공부했습니다.
- 기간: 2025.07 ~ 2025.08 (주차별 진행)
- 진행: 23개 중 20개 완료. 전략·템플릿 메서드·방문자는 예정
- 패턴마다 작은 예제를 직접 구현하고, 핵심 개념은 코드 주석으로 남겼습니다.

## 패턴 목록

### 생성 패턴

| # | 패턴 | 예제 |
| :---: | :--- | :--- |
| 01 | [싱글톤](src/main/java/_01_creational_patterns/_01_singleton) | 설정 객체 하나만 유지. 기본형 → `synchronized` → double-checked locking → static inner holder → enum 순서로 다섯 가지 구현 비교 |
| 02 | [팩토리 메서드](src/main/java/_01_creational_patterns/_02_factorymethod) | 배 종류(화이트십·블랙십)마다 생성 팩토리를 나눠, 새 배를 추가해도 기존 코드를 고치지 않게 |
| 03 | [추상 팩토리](src/main/java/_01_creational_patterns/_03_abstract_factory) | 배 부품(닻·바퀴) 묶음을 일반·프로 팩토리로 바꿔 끼우기 |
| 04 | [빌더](src/main/java/_01_creational_patterns/_04_builder) | 여행 계획을 단계별로 만들고, 자주 쓰는 조합은 디렉터로 재사용. Lombok `@Builder` 사용 예시 |
| 05 | [프로토타입](src/main/java/_01_creational_patterns/_05_prototype) | GitHub 이슈 객체를 `clone`으로 복제하고 내부 객체가 공유되는지(얕은 복사) 확인 |

### 구조 패턴

| # | 패턴 | 예제 |
| :---: | :--- | :--- |
| 06 | [어댑터](src/main/java/_02_structural_patterns/_06_Adapter) | 기존 `Account`를 보안 모듈의 `UserDetails` 인터페이스에 맞춰 연결 |
| 07 | [브릿지](src/main/java/_02_structural_patterns/_07_bridge) | 챔피언과 스킨을 분리해 두 축을 따로 확장 |
| 08 | [컴포짓](src/main/java/_02_structural_patterns/_08_composite) | 아이템과 가방(아이템 묶음)의 가격을 같은 방식으로 계산 |
| 09 | [데코레이터](src/main/java/_02_structural_patterns/_09_decorator) | 댓글 서비스에 공백 정리·스팸 필터를 런타임에 겹쳐 붙이기 |
| 10 | [퍼사드](src/main/java/_02_structural_patterns/_10_facade) | 메일 발송의 복잡한 설정(`javax.mail`)을 `EmailSender` 하나 뒤로 숨기기 |
| 11 | [플라이웨이트](src/main/java/_02_structural_patterns/_11_flyweight) | 글자마다 반복되는 폰트 객체를 팩토리에서 캐시해 공유 |
| 12 | [프록시](src/main/java/_02_structural_patterns/_12_proxy) | 게임 서비스 앞에 프록시를 두어 지연 초기화와 실행 시간 측정 |

### 행동 패턴

| # | 패턴 | 예제 |
| :---: | :--- | :--- |
| 13 | [책임 연쇄](src/main/java/_03_behavioral_patterns/_13_chain_of_responsibilities) | 요청을 처리하는 핸들러(로깅 등)를 사슬로 연결 |
| 14 | [커맨드](src/main/java/_03_behavioral_patterns/_14_command) | 버튼이 조명 켜기·끄기, 게임 시작·종료 명령을 실행하고 되돌리기 |
| 15 | [인터프리터](src/main/java/_03_behavioral_patterns/_15_interpreter) | 후위 표기식을 파싱해 식 트리로 만들고 변수 값을 넣어 계산 |
| 16 | [이터레이터](src/main/java/_03_behavioral_patterns/_16_iterator) | 게시판 글을 최신순으로 도는 전용 이터레이터 |
| 17 | [중재자](src/main/java/_03_behavioral_patterns/_17_mediator) | 호텔 손님·식당·청소 서비스가 프런트 데스크를 통해서만 소통 |
| 18 | [메멘토](src/main/java/_03_behavioral_patterns/_18_memento) | 게임의 두 팀 점수를 저장했다가 복원 |
| 19 | [옵저버](src/main/java/_03_behavioral_patterns/_19_observer) | 채팅 서버가 주제를 구독한 사용자에게 메시지 전달 |
| 20 | [상태](src/main/java/_03_behavioral_patterns/_20_state) | 온라인 강의의 공개 상태(초안·공개·비공개)에 따라 수강·리뷰 동작이 바뀜 |

## 실행

IntelliJ에서 `src/main/java`를 소스 루트로 열고, 각 패턴 폴더의 `App` 또는 `Client`의 `main`을 실행합니다. 퍼사드 예제는 `lib/`의 jar(`javax.mail` 등)를 라이브러리로 추가해야 합니다.
