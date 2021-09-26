
public class ClientApp {

	public static void main(String[] args) {
	
		SmartPhone smrt1 = new SmartPhone();
		SmartPhone smrt2 = new SmartPhone();
		SmartPhone smrt3 = new SmartPhone();
		
		SmartEnabled smrtenbl1 = new SmartEnabled();
		SmartEnabled smrtenbl2 = new SmartEnabled();
		
		BlkWhFeaturePhone bwfp1 = new BlkWhFeaturePhone();
		BlkWhFeaturePhone bwfp2 = new BlkWhFeaturePhone();
		BlkWhFeaturePhone bwfp3 = new BlkWhFeaturePhone();
		
		System.out.println("======MOBILE PHONES======\n");
		
		Mobile[] mobilephones = {smrt1, smrt2,smrt3 ,smrtenbl1, smrtenbl2, bwfp1, bwfp2,bwfp3};
		
		for( int i = 0; i < mobilephones.length; i++) {
			mobilephones[i].startPhone();
		}
		
		System.out.println("\n\n======END OF MOBILE PHONES======\n");
		
		System.out.println("\n\n======FEATURE PHONES======\n");
		
		FeaturePhone[] featurephones = {smrtenbl1, smrtenbl2, bwfp1, bwfp2,bwfp3};
		
		for( int i = 0; i < featurephones.length; i++) {
			featurephones[i].setPolyphonicRingtone();
		}
		
		System.out.println("\n======END OF FEATURE PHONES======\n");
	}
}