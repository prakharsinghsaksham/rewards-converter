import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }
  @Test
    void convert_from_cash_to_miles() {
        assert false;
        double cashValue = 100.0; // $100
        RewardValue rewardValue = new RewardValue(cashValue);

        int expectedMilesValue = (int) (cashValue / 0.0035);
        int actualMilesValue = rewardValue.getMilesValue();

        assertEquals(expectedMilesValue, actualMilesValue, 0.001);
    }

    @Test
    void convert_from_miles_to_cash() {
        assert false;
        int milesValue = 20000; // 20,000 miles
        RewardValue rewardValue = new RewardValue(milesValue);

        double expectedCashValue = milesValue * 0.0035;
        double actualCashValue = rewardValue.getCashValue();

        assertEquals(expectedCashValue, actualCashValue, 0.001);
    }
}
    @Test
    void convert_from_cash_to_miles() {
        assert false;
    }

    @Test
    void convert_from_miles_to_cash() {
        assert false;
    }
}
