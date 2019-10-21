import entity.User;
import org.junit.Assert;
import org.junit.Test;
import service.UserService;

import java.util.HashMap;
import java.util.Map;

public class UserServiceTest {

    private UserService userService = new UserService();
    private static int ID = 1;

    @Test
    public void shouldGetCorrectDataForUserRequest() {
        //data from this map was pre-INSERTED to "banklist" database
        Map<Integer, User> map = new HashMap<>();
        map.put(1, new User("Stefan", "Williams"));
        map.put(2, new User("Robin", "Harris"));
        map.put(3, new User("Clarence", "Thomas"));
        map.put(4, new User("Sandy", "Robinson"));
        map.put(5, new User("Ernest", "Walker"));
        map.put(6, new User("Samuel", "Scott"));
        map.put(7, new User("Benjamin", "Nelson"));
        map.put(8, new User("Luka", "Mitchell"));
        map.put(9, new User("Fred", "Morgan"));
        map.put(10, new User("Albert", "Cooper"));
        User user = userService.getUserById(ID);
        Assert.assertEquals(map.get(ID), user);
    }
}
