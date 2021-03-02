package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("translate")
public class HomeController {
    String[] vna = {"xin chào","ăn","ngủ","đi","chơi","khải"};
    String[] eng = {"hello","eat","sleep","go","play","beaitiful"};
    @GetMapping("")
    public ModelAndView showForm(){
        ModelAndView modelAndView = new ModelAndView("home");
        return modelAndView;
    }

    @PostMapping()
    public ModelAndView translate(@RequestParam int trans, String input){
        String result = "";
        switch (trans){
            case 1:
                for (int i = 0; i < vna.length; i++) {
                    if(input.equalsIgnoreCase(vna[i])){
                        result = eng[i];
                    }
                }
                break;
            case 2:
                for (int i = 0; i < eng.length; i++) {
                    if(input.equalsIgnoreCase(eng[i])){
                        result = vna[i];
                    }
                }
                break;
        }
        ModelAndView modelAndView = new ModelAndView("home","result",result);
        modelAndView.addObject("input",input);
        return modelAndView;
    }
}
