package Servlet;

import com.Serivce.Impl.LoginServiceImpl;
import com.Serivce.LoginService;
import com.fasterxml.jackson.databind.ObjectMapper;
import domain.Login;
import domain.ResultInfo;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/LoginSerlet/*")
public class LoginSerlet extends BaseServlet {


    public void Login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Map<String, String[]> map = request.getParameterMap();

        Login login = new Login();
        try {
            BeanUtils.populate(login,map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

       LoginService service = new LoginServiceImpl();
        Login u  = service.Login(login);

        ResultInfo info = new ResultInfo();


        if(u == null){

            info.setFlag(false);
            info.setErrorMsg("用户名密码或错误");
        }


        if(u != null){
            request.getSession().setAttribute("user",u);//登录成功标记

            info.setFlag(true);
        }


        ObjectMapper mapper = new ObjectMapper();

        response.setContentType("application/json;charset=utf-8");
        mapper.writeValue(response.getOutputStream(),info);
    }
    }

