github에 적용하는 법: commit창에 뭐든 입력하고 commit 누른 후에 점 3개 눌러서 push까지 하면 적용됨.
github 특정 커밋으로 되돌아가는 법: git log 한 후 엔터 눌러서 log 확인 후, 
    git reset --hard (commit hash)
    위의 명령어 입력.

pull 후 push하기: 왜냐하면 원격 저장소와 github 일반 저장소 사이의 괴리가 생기면 골치아픔.

이상한 짓 해서 환경 이상하게 만들지 말 것!

Java: Switch to Standard Mode

1. ./gradlew build
2. cd build/libs
3. java -jar hello-spring-0.0.1-SNAPSHOT.jar
4. 실행 확인