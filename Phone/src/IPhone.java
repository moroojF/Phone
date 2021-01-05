public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
		return this.getRingTone();
        // your code here
    }
    @Override
    public String unlock() {
		return "IPhone is Unlocked";
        // your code here
    }
    @Override
    public void displayInfo() {
        // your code here     
    	System.out.println("IPhone Version Number: "+this.getVersionNumber()+", With "+this.getBatteryPercentage()+"% of Battery. Carrier: "+this.getCarrier()+", and Ring Tone: "+this.getRingTone()+".");
    }
}
