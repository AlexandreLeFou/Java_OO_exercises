package demo.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


    @Controller
    public class SitesController {
        @GetMapping("/")
        public String index() {
            return "index";
        }

        @GetMapping("/hello")
        public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
            model.addAttribute("name", name);
            return "hello";
        }
        /*@GetMapping("/hello")
        public String namesSintelestwn(Model model, @RequestParam(value="membersOnomata", required=false, defaultValue="A.Gazis, G.Anagnwstakis,K.Beroukas") String membersOnomata) {
            model.addAttribute("membersOnomata", membersOnomata);
            return "namesSintelestwn";
        }*/



        /*
        RequestMapping maps /hello request to hello() method.
        name is a query string parameter of /hello request.

Model object passes value to hello view (hello.ftl).
         */
    }