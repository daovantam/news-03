package service.impl;

import dao.IUserDAO;
import dao.impl.IUserDAOImpl;
import model.UserModel;
import model.request.UserRequest;
import service.IUserService;

public class UserServiceImpl implements IUserService {

    private IUserDAO userDAO;

    public UserServiceImpl() {
        this.userDAO = new IUserDAOImpl();
    }

    @Override
    public UserModel findUserByUserNameAndPassword(UserRequest userRequest) {
        return userDAO.findUserByUserNameAndPassword(userRequest.getUserName(), userRequest.getPassword());
    }
}
