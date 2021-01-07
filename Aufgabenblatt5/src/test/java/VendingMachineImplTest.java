import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import javax.security.auth.callback.CallbackHandler;

import static org.mockito.Mockito.*;

//uebung 2 mit Junint
class VendingMachineTest {

    CashBox cashBox;
    VendingMachine vendingMachine;
    @BeforeEach
    void setUp(){
        cashBox = new UnlimitedCashBox();
        vendingMachine = new VendingMachineImpl(cashBox, new FullBox[] {new FullBox()});
    }

    @org.junit.jupiter.api.Test
    void enoughtMoneyFullBoxJUnit() throws BoxEmptyException, NotEnoughMoneyException {

        vendingMachine.selectItem(0);
    }
}

//----------------------------------------------------------------
//uebung 2 mit mockito
//class VendingMachineTest {
//
//    Box box;
//    CashBox cashBox;
//    VendingMachine vendingMachine;
//
//    @BeforeEach
//    void setUp() {
//        box = mock(Box.class);
//        cashBox = mock(CashBox.class);
//        vendingMachine = new VendingMachineImpl(cashBox, new Box[] {box});
//    }
//
//    @Test
//    public void enoughtMoneyFullBoxMock() throws BoxEmptyException, NotEnoughMoneyException{
//      when(box.isEmpty()).thenReturn(false);
//      when(box.getPrice()).thenReturn(1);
//      when(cashBox.getCurrentAmount()).thenReturn(2);
//      vendingMachine.selectItem(0);
//
//      verify(box, times(1)).releaseItem();
//      verify(cashBox, times(1)).withdraw(1);
//    }
//}