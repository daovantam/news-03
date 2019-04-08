package dao.impl;

import dao.IUserDAO;
import mapper.UserMapper;
import model.UserModel;

import java.sql.Timestamp;
import java.util.List;

public class IUserDAOImpl extends AbstractDAO<UserModel> implements IUserDAO {
    public static void main(String[] args) {
        IUserDAO userDAO = new IUserDAOImpl();
        UserModel model = new UserModel();
        model.setUserName("kien");
        model.setPassWord("123");
        model.setFirstName("nguyendac");
        model.setLastName("kien");
        model.setCreatedDate(new Timestamp(System.currentTimeMillis()));
        model.setEmail("nguyendackien@gmail.com");
        model.setSex(0);
        model.setRoleId(2);
//        userDAO.insertUser(model);
//        userDAO.updateUser((long) 2, model);
//        System.out.println(userDAO.findUserByUserNameAndPassword("kien","123"));
    }

    @Override
    public UserModel findUserByUserNameAndPassword(String userName, String password) {
        String sql = "SELECT * FROM  user WHERE username=? AND password=?;";
        List<UserModel> userModels = findByProperties(sql, new UserMapper(), userName, password);
        return userModels.isEmpty() ? null : userModels.get(0);
    }

    @Override
    public void insertUser(UserModel userModel) {
        String sql = "INSERT INTO user(username, password, firstname, lastname, createddate, email, sex, roleid) VALUES (?,?,?,?,?,?,?,?);\n";
        insert(
                sql, userModel.getUserName(), userModel.getPassWord(),
                userModel.getFirstName(), userModel.getLastName(), userModel.getCreatedDate(),
                userModel.getEmail(), userModel.getSex(), userModel.getRoleId()
        );
    }

    @Override
    public void updateUser(Long id, UserModel userModel) {
        String sql = "UPDATE user SET username=?,password=?,firstname=?,lastname=?,createddate=?,email=?,sex=?,roleid=? WHERE userid=?;";
        update(
                sql, userModel.getUserName(), userModel.getPassWord(),
                userModel.getFirstName(), userModel.getLastName(),
                userModel.getCreatedDate(), userModel.getEmail(), userModel.getSex(),
                userModel.getRoleId(), id
        );
    }
}
