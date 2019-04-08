package dao;

import model.UserModel;

public interface IUserDAO extends IGenericDAO<UserModel> {
    UserModel findUserByUserNameAndPassword(String userName, String password);

    void insertUser(UserModel userModel);

    void updateUser(Long id, UserModel userModel);
}
