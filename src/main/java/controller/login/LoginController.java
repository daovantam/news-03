package controller.login;

import model.RoleModel;
import model.UserModel;
import model.request.UserRequest;
import service.IRoleService;
import service.IUserService;
import service.impl.RoleServiceImpl;
import service.impl.UserServiceImpl;
import utils.MapClientToServerUtil;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginController extends HttpServlet {
    private IUserService userService;
    private IRoleService roleService;

    public LoginController() {
        this.userService = new UserServiceImpl();
        this.roleService = new RoleServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String message = req.getParameter("message");
        if (message != null && message.equals("loginError")) {
            req.setAttribute("message", "Tài khoản hoặc mật khẩu bị sai");
        }
        RequestDispatcher rs = req.getRequestDispatcher("/views/login/login.jsp");
        rs.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserRequest userRequest = MapClientToServerUtil.toModel(UserRequest.class, req);
        UserModel userModel = userService.findUserByUserNameAndPassword(userRequest);
        if (userModel == null) {
            resp.sendRedirect("/login?message=loginError");
        } else {
            RoleModel roleModel = roleService.findRoleById(userModel.getRoleId());
            if (roleModel.getRoleName().equals("ADMIN")) {
                resp.sendRedirect("/admin");
            } else if (roleModel.getRoleName().equals("USERS")) {
                resp.sendRedirect("/trangChu");
            }
        }
    }

}
