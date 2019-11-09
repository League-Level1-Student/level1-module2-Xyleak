package _06_minion;

public class Minion {

	private String name; 
	private int eyes; 
	private String color; 
	private String master;

	Minion(String name, int eyes, String color, String master){

		this.name = name;
		this.eyes = eyes;
		this.color = color;
		this.master = master;
	}

	
	
	void setName(String stuart) {
		this.name = stuart;	
		}	

	
		void setEyes(int Two) {
		this.eyes = Two;	
		}

		
		void setColor(String Gray) {
		this.color = Gray;	
		}


		void setMaster(String Guru) {
			
		this.master = Guru;	
		}


		String getName() {
			return name;
		}
			int getEyes() {
				return eyes;
			}
				String getColor() {
					return color;
				}
					String getMaster() {
						return master;
					}
}
