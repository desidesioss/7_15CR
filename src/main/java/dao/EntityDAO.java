package dao;


import model.Entity;
import java.sql.*;

import java.util.ArrayList;
import java.util.List;

public class EntityDAO {

    public void create(Entity entity) {
        String sql = "INSERT INTO entities(name, description) VALUES(?, ?)";
        try (Connection conn = DatabaseHelper.connect(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, entity.getName());
            pstmt.setString(2, entity.getDescription());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Entity> getAll() {
        List<Entity> entities = new ArrayList<>();
        String sql = "SELECT * FROM entities";
        try (Connection conn = DatabaseHelper.connect(); Statement stmt = conn.createStatement()) {
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Entity entity = new Entity(rs.getString("name"), rs.getString("description"));
                entities.add(entity);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return entities;
    }

}

