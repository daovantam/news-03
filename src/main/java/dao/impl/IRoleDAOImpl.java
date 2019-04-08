package dao.impl;

import dao.IRoleDAO;
import mapper.RoleMapper;
import model.RoleModel;

import java.util.List;

public class IRoleDAOImpl extends AbstractDAO<RoleModel> implements IRoleDAO {
    @Override
    public RoleModel findRoleById(Long id) {
        String sql = "SELECT * FROM role WHERE roleid=?;";
        List<RoleModel> roleModels = findByProperties(sql, new RoleMapper(), id);
        return roleModels.isEmpty() ? null : roleModels.get(0);
    }
}
