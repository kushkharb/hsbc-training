
public class CityByCode {
	
	public String getCityByCode(int i) {
		if(i==1) {
			return "DELHI";
		}
		else if(i==2) {
			return "NOIDA";
		}
		else if(i==3) {
			return "GURUGRAM";
		}
		else if(i==4) {
			return "BANGLORE";
		}
		else {
			return "INVALIDCODE";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CityByCode c = new CityByCode();
		int i=3;
		System.out.println(c.getCityByCode(i));
	}

}
