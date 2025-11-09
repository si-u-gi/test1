# Read Me First
The following was discovered as part of building this project:

* The original package name 'hello.hello-spring' is invalid and this project uses 'hello.hello_spring' instead.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/3.4.11/gradle-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.4.11/gradle-plugin/packaging-oci-image.html)
* [Spring Web](https://docs.spring.io/spring-boot/3.4.11/reference/web/servlet.html)
* [Thymeleaf](https://docs.spring.io/spring-boot/3.4.11/reference/web/servlet.html#web.servlet.spring-mvc.template-engines)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)



프로젝트 실행 방법: vscode 메뉴바에 있는 Spring Boot Dashboard를 클릭하고 화살표 누르면 알아서 실행됨.

welcome page 설정 방법: src/main/resources/static/index.html 여기 있는 index.html이 welcome page인데, 경로가 정확히 위와 같아야함. 예를 들어서 static 폴더가 빠져있으면 안됨.

스프링 부트 공식 문서: https://docs.spring.io/spring-boot/docs/2.3.1.RELEASE/reference/html/index.html

thymeleaf 템플릿 엔진
    thymeleaf 공식 사이트: https://www.thymeleaf.org/
    스프링 공식 튜토리얼: https://spring.io/guides/gs/serving-web-content/
    스프링부트 메뉴얼: https://docs.spring.io/spring-boot/docs/2.3.1.RELEASE/reference/html/
    spring-boot-features.
    html#boot-features-spring-mvc-template-engines

MVC: model view controller

정적인 웹 페이지: https://fuzzy-space-goldfish-jjp6qgqw66ggh5jxj-8080.app.github.dev/hello-static.html

hello-static.html처럼 주소 뒤에 파일명.html을 입력하면 정적인 웹 페이지를 보여줌.

MVC: hello-static controller가 있는지 찾은 후, hello-static.html을 반환해줌. controller에서 비즈니스 로직을 다 처리한 후 model에 화면에서 필요한 것들을 담아 view(화면)에 넘겨주는 식으로 작동함.

동적으로 화면을 넘겨주는 방식이 총 2가지임.
- MVC
- API

API: 