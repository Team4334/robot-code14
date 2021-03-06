package edu.first.module.sensors;

import edu.first.identifiers.Position;
import edu.first.module.Module;

/**
 * Basic module that takes input from a digital channel.
 *
 * @since June 10 13
 * @author Joel Gallant
 */
public class DigitalInput extends Module.StandardModule implements Position {

    private final edu.wpi.first.wpilibj.DigitalInput input;

    /**
     * Constructs the module with the digital input object underneath this class
     * to call methods from.
     *
     * @param input underlying object to get input from
     */
    protected DigitalInput(edu.wpi.first.wpilibj.DigitalInput input) {
        this.input = input;
    }

    /**
     * Constructs the module using the sensor's channel.
     *
     * @param channel channel on the digital sidecar
     */
    public DigitalInput(int channel) {
        this(new edu.wpi.first.wpilibj.DigitalInput(channel));
    }

    /**
     * Constructs the module using the sensor's channel.
     *
     * @param channel channel on the digital sidecar
     * @param slot slot on cRIO (1 = default)
     */
    public DigitalInput(int channel, int slot) {
        this(new edu.wpi.first.wpilibj.DigitalInput(slot, channel));
    }

    /**
     * {@inheritDoc}
     */
    protected void enableModule() {
    }

    /**
     * {@inheritDoc}
     */
    protected void disableModule() {
    }

    /**
     * {@inheritDoc}
     */
    public void init() {
    }

    /**
     * Returns whether the input is receiving a signal.
     *
     * @throws IllegalStateException when module is not enabled
     * @return if input has current running
     */
    public boolean getPosition() {
        ensureEnabled();
        return input.get();
    }
}
