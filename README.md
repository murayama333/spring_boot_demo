# Spring boot

## 動かし方

```
% git clone https://github.com/murayama333/spring_boot_demo.git
% cd spring_boot_demo.git
% ./gradlew build && java -jar build/libs/spring_boot_demo-0.1.0.jar
:compileJava
:processResources UP-TO-DATE
:classes
:run

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v1.1.8.RELEASE)

...
> Building 75% > :run
```

てなったらブラウザからアクセスする

```
% curl http://localhost:8080/
Hello World!%
```
