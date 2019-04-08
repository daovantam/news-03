package mapper;

import model.RoleModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RoleMapper implements RowMapper<RoleModel> {
    @Override
    public RoleModel map(ResultSet rs) throws SQLException {
        RoleModel roleModel = new RoleModel();
        roleModel.setRoleId(rs.getLong("roleId"));
        if (rs.getString("roleName") != null) {
            roleModel.setRoleName(rs.getString("roleName"));
        }
        return roleModel;
    }
}
