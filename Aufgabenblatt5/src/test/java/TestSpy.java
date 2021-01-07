import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.*;
class TestSpy {


    Box box;
    CashBox cashBox;
    VendingMachine vendingMachine;

    @BeforeEach
    void setUp() {
        box = spy(Box.class);
        cashBox = spy(CashBox.class);
        vendingMachine = new VendingMachineImpl(cashBox, new Box[] {box});
    }

    @Test
    public void test() throws BoxEmptyException, NotEnoughMoneyException{
      when(box.isEmpty()).thenReturn(false);
      when(box.getPrice()).thenReturn(1);
      when(cashBox.getCurrentAmount()).thenReturn(2);
      vendingMachine.selectItem(0);

      verify(box, times(1)).releaseItem();
      verify(cashBox, times(1)).withdraw(1);
    }
}