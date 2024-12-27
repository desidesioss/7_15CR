package dao;

import model.Entity;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EntityDAOTest {

    @Test
    public void testCreateEntity() {
        EntityDAO dao = new EntityDAO();
        Entity entity = new Entity("Test", "Test Description");
        dao.create(entity);

        assertNotNull(entity.getId(), "ID should not be null after creation");
    }

    // Добавьте другие тесты для CRUD операций
}

