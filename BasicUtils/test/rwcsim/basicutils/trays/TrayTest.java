package rwcsim.basicutils.trays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//import static org.mockito.Mockito.*;

public class TrayTest {

    InfantryTray infantryTray;

    @Test
    public void testIsEmpty() {
        infantryTray = new InfantryTray();
        assertFalse(infantryTray.isEmpty(), "InfantryTray is not empty.");
        assertFalse(infantryTray.hasEmptySlots());
        assertEquals(infantryTray.getEmptySlots().length, 0);

        assertFalse(infantryTray.applyDamage(1));
        assertTrue(infantryTray.applyDamage(4));
    }

    @Test
    public void testFigureUpgrades() {



    }

    @Test
    public void testAccuracy() {
        assertFalse(infantryTray.hasAccuracy(),"Infantry tray does not have accuracies assigned.");
    }
}
