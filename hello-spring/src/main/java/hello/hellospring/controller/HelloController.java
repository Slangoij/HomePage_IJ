package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello!!");
        return "hello";
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model){
        model.addAttribute("name", name);
        return "hello-template";
    }

    @GetMapping("hello-string")
    @ResponseBody
    //이 문자가 그대로 들어감, 여기서 Body부는 html의 바디가 아니라
    //http의 body를 의미. 여기서 return값이 그대로 html의 소스로 들어감.
    public String helloString(@RequestParam("name") String name){
        return "Hello! " + name + "<a href=\"/index.html\">backtohome</a>"; //"hello spring"
    }

    @GetMapping("hello-api")
    @ResponseBody
    //responsebody 어노테이션만 있으면 그대로 넘기지만 여기서
    // 객체를 변수로 받으면 json으로 변환해서 넘겨줌.
    public Hello helloApi(@RequestParam("name") String name){
        Hello hello = new Hello();
        hello.setName(name);
        System.out.println(hello.getName());
        return hello;
    }

    static class Hello{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name){
            this.name = name;
        }
    }

    @GetMapping("ijij")
    public String statictest(Model model){
        model.addAttribute("name1", "hihi");
        return "ijtest";
    }
}
