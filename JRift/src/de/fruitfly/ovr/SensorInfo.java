package de.fruitfly.ovr;

public class SensorInfo {
	public float pitch = 0;
	
	public float roll = 0;
	
	public float yaw = 0;

	public SensorInfo() {
		
	}
	
	public SensorInfo(float yaw, float pitch, float roll) {
		this.pitch = pitch;
		this.roll = roll;
		this.yaw = yaw;
	}
	
	@Override
	public String toString() {
		return "SensorInfo [Yaw=" + this.yaw + ", Pitch="
				+ this.pitch + ", Roll=" + this.roll + "]";
	}
}
