package lights;

/**
 * This is a simple light that can either be
 * on or off.
 */

public class Light {
	
	// Fields
	private static boolean isOn;
	
	// Constructors
	/**
	 * Constructor creates a new light object.
	 */
	public Light() {
		this(false);
	}
	
	/**
	 * Constructor creates a new light object with
	 * the specified isOn state.
	 * @param isOn - whether this light is on
	 */
	public Light(boolean isOn) {
		this.isOn = isOn;
	}
	
	// Methods
	
	/**
	 * Returns true if this light is on, false otherwise
	 * @return true if this light is on, false otherwise
	 */
	public boolean isOn() {
		return false;
	}
	
	/**
	 * Sets whether this light is on. 
	 * @param isOn - state to change this light to. true turns
	 *               the light on. false turns it off
	 */
	public void setOn(boolean isOn) {
		isOn = isOn;
	}
	
	/**
	 * Randomly changes this light to be on or off.
	 */
	public void randomChange() {
		if (Math.random() < .5) {
			this.setOn(true);
		} else {
			this.setOn(false);
		}
	}
	
}