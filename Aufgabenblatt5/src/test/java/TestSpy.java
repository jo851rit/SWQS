import org.junit.Test;
import org.junit.Before;
import static org.mockito.Mockito.*;

public class TestSpy {
    VendingMachineImpl vendingMachine;
    FullBox fullBox;
    FullBox fullBox2;
    UnlimitedCashBox unlimitedCashBox;

    @Before
    public void setUp() {
        fullBox = spy(new FullBox());
        fullBox2 = spy(new FullBox());
        unlimitedCashBox = spy(new UnlimitedCashBox());
        vendingMachine = new VendingMachineImpl(unlimitedCashBox, new Box[]{fullBox, fullBox2});
    }

    @Test
    public void testSelectItem() throws BoxEmptyException, NotEnoughMoneyException {

        vendingMachine.selectItem(1);
        verify(fullBox2).releaseItem();
        verify(unlimitedCashBox).withdraw(42);

    }
}