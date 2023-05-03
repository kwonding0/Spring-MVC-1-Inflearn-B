package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller //view이름이 반환되서 viewResolver 과정이 되는데,
@Slf4j //아래 로그 선언을 롬복이 대신 해주는 annotation
@RestController //(Rest API의 Rest) 문자를 반환하면 view를 찾는게 아니라 그 문자가 바로 반환이 됨 그래서 현재 log-test 호출하면 return 값 "ok"가 바로 화면에 표시됨
public class LogTestContoller {
    //private final Logger log = LoggerFactory.getLogger(getClass()); //로그 선언

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        System.out.println("name = " + name);

        log.trace("trace log=" + name); //연산이 일어나면서 매모리, cpu 리소스를 잡아먹음 (로그 레벨을 debug까지로 해서 trace가 나오지도 않는데)

        log.trace("trace log={}", name);
        log.debug("debug log={}", name); //디버그(개발)를 할때
        log.info("info log={}", name); //정보
        log.warn("warn log={}", name); //경고
        log.error("error log={}", name); //에러
        //2023-04-12 21:04:32.987  INFO 3164(프로세스아이디) --- [nio-8082-exec-1](스레드) hello.springmvc.basic.LogTestContoller(컨트롤러 이름)   : info log=Spring(메세지)

        return "ok";
    }
}
