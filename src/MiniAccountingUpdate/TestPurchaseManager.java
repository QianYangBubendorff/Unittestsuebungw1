package MiniAccountingUpdate;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestPurchaseManager {
    @Test
    public void testRemovePurchase() throws Exception {
        //given
        PurchaseManager purchaseManager = new PurchaseManager(new Scanner("1\n"));
        Map<Integer, Purchase> purchaseMap = new HashMap<>();
        purchaseMap.put(1,new Purchase(1,123, LocalDate.now(),new Supplier(),new Item(),"card", LocalDate.now(),100.0,20.0));
        purchaseMap.put(2,new Purchase(2,133, LocalDate.now(),new Supplier(),new Item(),"card", LocalDate.now(),100.0,20.0));
        //when
        purchaseManager.removePurchase(purchaseMap);
        Assert.assertFalse(purchaseMap.containsKey(1));
        Assert.assertTrue(purchaseMap.containsKey(2));
        //then

    }
}
