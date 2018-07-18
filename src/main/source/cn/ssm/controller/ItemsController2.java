package cn.ssm.controller;

import cn.ssm.pojo.Items;
import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * cn.ssm.controller
 *
 * @author jh
 * @date 2018/7/18 10:03
 * description:实现Controller接口的处理器
 */
public class ItemsController2 implements HttpRequestHandler {
    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //使用静态数据模拟。
        List<Items> itemsList = new ArrayList ();
        Items items_1 = new Items ();
        items_1.setName ("aaa");
        items_1.setPrice (6000f);
        items_1.setDetail ("ThinkPad s2 联想笔记本电脑！");

        Items items_2 = new Items ();
        items_2.setName ("bbb");
        items_2.setPrice (5000f);
        items_2.setDetail ("iphone x 苹果手机！");

        Items items_3 = new Items ();
        items_3.setName ("ccc");
        items_3.setPrice (1999f);
        items_3.setDetail ("小米7周年旗舰手机");

        itemsList.add (items_1);
        itemsList.add (items_2);
        itemsList.add (items_3);

        //返回ModelAndView
        request.setAttribute ("itemsList", itemsList);
        /*实现HttpRequestHandler，通过request转发的数据必须是全路径*/
        request.getRequestDispatcher ("WEB-INF/jsp/items/itemsList.jsp").forward (request, response);

        /*
        * 相应数据返回json数据
        * */
    }
}
