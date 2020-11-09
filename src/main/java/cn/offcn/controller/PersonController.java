package cn.offcn.controller;

import cn.offcn.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.print.Book;

@Controller
public class PersonController {

    @RequestMapping("/add")
    public ModelAndView addPerson(){
        System.out.println("执行了PersonController-addPerson-method");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message","添加成功");
        modelAndView.setViewName("result");
        return modelAndView;
    }
    @RequestMapping("/register")
    public ModelAndView registerUser(String username,String password,String name,String gender,String age){
        System.out.println("username="+username);
        System.out.println("password="+password);
        System.out.println("name="+name);
        System.out.println("gender="+gender);
        System.out.println("age="+age);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("result");
        modelAndView.addObject("message","添加成功");
        return modelAndView;
    }
    @RequestMapping("/register2")
    public ModelAndView registerUser2(User user){
        System.out.println(user);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("result");
        modelAndView.addObject("message","添加成功");
        return modelAndView;
    }
    @RequestMapping("/register3")
    public ModelAndView registerUser3(User user){
        System.out.println(user);
        for (Book book : user.getBooks()) {
            System.out.println(book);
        }
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("result");
        modelAndView.addObject("message","添加成功");
        return modelAndView;
    }
    @RequestMapping("/register4")
    public ModelAndView registerUser4(User user){
        System.out.println(user);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("result");
        modelAndView.addObject("message","添加成功");
        return modelAndView;
    }
    @RequestMapping("/register5")
    public ModelAndView registerUser5(HttpServletRequest request, HttpServletResponse response, HttpSession session){

        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("result");
        modelAndView.addObject("message","添加成功");
        return  modelAndView;
    }
    @RequestMapping("/register6")
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws  Exception{

        String username=request.getParameter("username");
        System.out.println(username);
        request.setAttribute("message","注册成功");
        request.getRequestDispatcher("/page/result.jsp").forward(request,response);

    }
    @RequestMapping("/register7")
    public String register7(HttpServletRequest request, HttpServletResponse response)throws  Exception{

        String username=request.getParameter("username");
        System.out.println(username);
        request.setAttribute("message","注册成功");

        return "result/result";

    }
    //关于重定向
    @RequestMapping("/register8")
    public ModelAndView register8()throws  Exception{


        System.out.println("register8");
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("redirect:/page/result/result.jsp");

        return modelAndView;

    }
    @RequestMapping("/register9")
    public String register9()throws  Exception{


        System.out.println("register9");
        return "redirect:/page/result/result.jsp";

    }
}
