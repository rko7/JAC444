import java.io.Serializable;

@SuppressWarnings("serial")
public class Car implements Serializable {
	
	private String model;
	private String color;
	private double mileage;
	private String plate = "Not Registered!";

	/* *
	 * Constructor
	 * */
	public Car(String model, String color, double mileage) {
		setModel(model);
		setColor(color);
		setMileage(mileage);
	}

	/* *
	 * Getters
	 * */
	public String getModel() {
		return model;
	}
	public String getColor() {
		return color;
	}
	public double getMileage() {
		return mileage;
	}
	public String getPlate() {
		return plate;
	}

	/* *
	 * Setters
	 * */
	public void setModel(String model) {
		this.model = model;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	public void setPlate(String plate) {
		this.plate = plate;
	}

	@Override
	public String toString() {
		return "Model: " + getModel() + "\nColor: " + getColor() + "\nMileage: " + getMileage() + "\nPlate: "
				+ getPlate();
	}

}
