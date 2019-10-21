import connection.ConnectionClass;
import org.junit.Assert;
import org.junit.Test;

import java.sql.Connection;

public class ConnectionTest {

    @Test
    public void shouldGetConnection() {
        Connection connection = ConnectionClass.getConnection();
        Assert.assertNotNull(connection);
    }
}
