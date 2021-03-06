package gr8pefish.openglider.api.capabilities;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;

public class CapabilityHelper {

    /** Holds the capability **/
    @CapabilityInject(IGliderCapabilityHandler.class)
    public static final Capability<IGliderCapabilityHandler> GLIDER_CAPABILITY = null;


    //===================================== Helper Methods ==================================================

    /**
     * Gets the gliding capability of a given player.
     *
     * @param player - the player to check
     * @return The capability if the player has the capability, null otherwise
     */
    public static IGliderCapabilityHandler getGliderCapability(EntityPlayer player) {
        return player.getCapability(GLIDER_CAPABILITY, null);
    }

    /**
     * Checks if the player has the glider capability.
     * Should theoretically always be true if using this API, as it injects the capability.
     *
     * @param player - the player to check
     * @return - True if the player has the capability, False otherwise
     */
    public static boolean hasGliderCapability(EntityPlayer player) {
        return player.hasCapability(GLIDER_CAPABILITY, null);
    }


}
