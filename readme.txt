github에 적용하는 법: commit창에 뭐든 입력하고 commit 누른 후에 점 3개 눌러서 push까지 하면 적용됨.
github 특정 커밋으로 되돌아가는 법: git log 한 후 엔터 눌러서 log 확인 후, 
    git reset --hard (commit hash)
    위의 명령어 입력.

pull 후 push하기: 왜냐하면 원격 저장소와 github 일반 저장소 사이의 괴리가 생기면 골치아픔.

이상한 짓 해서 환경 이상하게 만들지 말 것!

빌드, 실행하는 법
./gradlew build
cd build/libs
java -jar hello-spring-0.0.1-SNAPSHOT.jar
실행 확인

실행 종료하는 법
(실행중인 터미널에서) Ctrl + C


***********중요***********
    자동완성이 작동하지 않으면 Ctrl + Space를 누를 것.
    Standard 모드가 아니더라도 source action을 사용할 수 있음.
    Map cannot be resolved to a typeJava(16777218) 이런 오류가 발생하면 source action에서 import ~~ 하면 대부분 해결됨.
    자바 터미널이 켜져야함 이상한 몽키스패너 누르셈
        ex) a376f265 Validate documents [Done]
            150402c1 Building [Done]
            51892ebd Publish Diagnostics [Done]
            037c7c93 Send Classpath Notifications [Done]
            27ba2180 Building [Done]
            c4015e9e Validate documents [Done]
            5b94d328 Publish Diagnostics [Done]
            f440176e Publish Diagnostics [Done]

H2 DB 실행 방법
h2.sh 통합터미널 열기
./h2.sh
JDBC URL: jdbc:h2:tcp://localhost/~/test


