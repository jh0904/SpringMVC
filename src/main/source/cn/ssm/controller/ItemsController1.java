package cn.ssm.controller;

import cn.ssm.pojo.Items;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * cn.ssm.controller
 *
 * @author jh
 * @date 2018/7/18 10:03
 * description:实现Controller接口的处理器
 */
public class ItemsController1 implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        //使用静态数据模拟。
        List<Items> itemsList=new ArrayList ();
        Items items_1 = new Items();
        items_1.setName("联想笔记本");
        items_1.setPrice(6000f);
        items_1.setDetail("ThinkPad T430 联想笔记本电脑！");

        Items items_2 = new Items();
        items_2.setName("苹果手机");
        items_2.setPrice(5000f);
        items_2.setDetail("iphone6苹果手机！");

        Items items_3 = new Items();
        items_3.setName("小米手机");
        items_3.setPrice(1999f);
        items_3.setDetail("小米8周年旗舰手机");

        itemsList.add(items_1);
        itemsList.add(items_2);
        itemsList.add(items_3);

        //返回ModelAndView
        ModelAndView modelAndView = new ModelAndView ();
        modelAndView.addObject ("itemsList",itemsList);
        //指定视图（实现Controller的不能写全路径，需要包加项目，不写项目后缀）
        modelAndView.setViewName ("/items/itemsList");
        return modelAndView;
    }
}
