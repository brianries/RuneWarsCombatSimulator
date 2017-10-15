package rwcsim.basicutils.trays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//import static org.mockito.Mockito.*;

public class TrayTest {

    @Test
    public void testIsEmpty() {
        InfantryTray infantryTray = new InfantryTray();
        assertFalse(infantryTray.isEmpty(), "InfantryTray is not empty.");
        assertFalse(infantryTray.hasEmptySlots());
        assertEquals(infantryTray.getEmptySlots().length, 0);

        assertEquals(0, infantryTray.applyDamage(1));
        assertEquals(0, infantryTray.applyDamage(4));

        infantryTray = new InfantryTray();
        assertEquals(3, infantryTray.applyDamage(7));

        assertTrue(infantryTray.isEmpty(), "InfantryTray is empty.");
    }

    @Test
    public void testFigureUpgrades() {



    }

    @Test
    public void testAccuracy() {
        InfantryTray infantryTray = new InfantryTray();
        assertFalse(infantryTray.hasAccuracy(),"Infantry tray does not have accuracies assigned.");
    }

    @Test
    public void testSmallDamage() {
        InfantryTray infantryTray = new InfantryTray();
        assertEquals(0, infantryTray.applyDamage(2));
        assertEquals(2, infantryTray.getFigureCount());
    }
}
