Gradle은 의존관계가 잇는 라이브러리를 함께 다운로드한다.

"스프링 부트 라이브러리"
- spring-boot-starter-web
  - spring-boot-starter-tomcat: 톰캣(웹서버)
  - sprint-webmvc: 스프링 웹 MVC
- spring-boot-starter-thymeleaf: 타임리프 템플릿 엔진(View)
- spring-boot-starter(공통): 스프링 부트 + 스프링 코어 + 로깅
  - spring-boot
    - spring-core
  - spring-boot-starter-logging
    - logback, slf4j

"테스트 라이브러리"
- spring-boot-starter-test
  - junit: 테스트 프레임워크
  - mockito: 목 라이브러리
  - assertj: 테스트 코드를 좀 더 편하게 작성하게 도와주는 라이브럴
  - spring-test: 스프링 통합 테스트 지원

"View 환경설정"

`resources/static/index.html`
```html
<!doctype html>
<html>
<head>
    <title>Hello</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
Hello
<a href="/hello">hello</a>
</body>
</html>
```

- 스프링 부트가 제공하는 Welcome Page 기능
  - `static/index.html`을 올려두면 Welccome page 기능을 제공한다.
  - https://docs.spring.io/spring-boot/docs/2.3.1.RELEASE/reference/html/spring-boot-
    features.html#boot-features-spring-mvc-welcome-page

- gradle을 선택한 이유: maven 대신에?
  - 일단 강사님이 요즘 많이 쓴다고 했었기에...

- 서비스는 기계적으로 데이터를 저장,조회하는 리포지토리와 다르게 실제 비즈니스 상으로
- 사용되는 로직을 구현한다.