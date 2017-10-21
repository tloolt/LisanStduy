package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by jihoonlee on 2017. 10. 21..
 */
@Controller
public class HomeController {


    // URL 지정 ==> URL 1개에 메소드 1개가 매핑되어진다.
    @RequestMapping(value = "/", method = {RequestMethod.GET})
    // value="url" , method={RequsetMethod.GET or POST} 전송방식 GET이냐 POST냐
    public String home() { //필요한것만 써주면된다. 세션이 필요하면 세션도 써주고, res 필요없으면 안써줘도 되고~

        // DB 작업은 생략.
        System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");

        return "test"; // 보낼 뷰페이지!
        // 뷰페이지 호출
        // servlet-context.xml 에 정의해둔 접두사,접미사 에 의해 /WEB-INF/views/hello.jsp 파일을 만들어야 한다.

    }



}
