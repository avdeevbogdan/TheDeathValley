import org.junit.Assert;
import org.junit.Test;
import service.AccountService;

import java.util.List;

import static java.util.Arrays.asList;

public class AccountServiceTest {

    private AccountService accountService = new AccountService();

    @Test
    public void shouldReceiveDataFromAccount() {
        //data from this list was pre-INSERTED to "banklist" database
        List<Integer> dbList = asList(100, 200, 300, 400, 500, 600, 700, 800, 900, 1000);
        List<Integer> resList = accountService.getAllAccounts();
        Assert.assertEquals(resList, dbList);
    }
}

