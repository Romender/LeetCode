package medium;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class P93_Resotre_IP_AddressTest {

    private P93_Resotre_IP_Address objectTest = new P93_Resotre_IP_Address();

    @Test
    public void testBaseCase1() {
        String input = "25525511131";
        Assertions.assertThat(objectTest.restoreIpAddresses(input)).contains("255.255.111.31","255.255.11.131");
    }

}