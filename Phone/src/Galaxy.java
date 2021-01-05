public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
		return this.getRingTone();
        // your code here
    }
    @Override
    public String unlock() {
		return "Galaxy is Unlocked";
        // your code here
    }
    @Override
    public void displayInfo() {
        // your code here   
    	System.out.println("Galaxy Version Number: "+this.getVersionNumber()+", With "+this.getBatteryPercentage()+"% of Battery. Carrier: "+this.getCarrier()+", and Ring Tone: "+this.getRingTone()+".");
    }
}
