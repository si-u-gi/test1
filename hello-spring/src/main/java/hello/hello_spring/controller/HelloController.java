package hello.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class HelloController {

    @GetMapping("hello")
    // /hello라는 URL로 들어오는 GET 요청을 처리하겠다는 뜻. //
    // @GetMapping 함수 바로 밑에 있는 메서드를 실행해줌. //
    public String hello(Model model) {
        // 요청이 들어오면 실행될 메서드 정의 //
        model.addAttribute("data", "hello!!");
        // hello.html이랑 관련 있음. th문법에서 data이름의 데이터에 hello!!라는 값이 들어가게 됨. 동적으로 html을 작동하는 방법같음. //
        return "hello";
        // 위의 코드가 "hello".html로 작동하게 해줌. return "siugi"면 siugi.html 파일에서 작업을 하게 됨. //
         // hello.html이라는 뷰 템플릿 파일을 찾아서 화면을 실행시켜줌. //
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam(name = "name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello-template";
    }

    @GetMapping("hello-string")
    @ResponseBody
    public String helloString(@RequestParam("name") String name) {
        return "hello " + name;
    }

    @GetMapping("hello-api")
    @ResponseBody

    public Hello helloApi(@RequestParam("name") String name) {
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }

    static class Hello {
        private String name;


        // javaBean 표준 방식??
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
