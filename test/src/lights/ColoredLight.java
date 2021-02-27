package lights;

import java.awt.Color;

public class ColoredLight extends Light{
	
	/**
	 * Creates a new colored light.
	 * @param color - color of this light.
	 */
	public ColoredLight(Color color) {
		// TODO
		throw new RuntimeException("ColoredLight(Color) not yet implemented!");
	}
	
	/**
	 * Returns the color of this light.
	 * @return color of this light.
	 */
	public Color getColor() {
		// TODO
		throw new RuntimeException("ColoredLight.getColor() not yet implemented!");
	}
	
	/**
	 * Changes the color of this light to be c.
	 */
	public void setColor(Color c) {
		// TODO
		throw new RuntimeException("ColoredLight.setColor() not yet implemented!");
	}
	
	/**
	 * Randomly changes this light to be on or off and its color.
	 */
	@Override
	public void randomChange() {
		// TODO. 
		// Take advantage of Light.randomChange
		throw new RuntimeException("ColoredLight.randomChange() not yet implemented!");
	}
	
}