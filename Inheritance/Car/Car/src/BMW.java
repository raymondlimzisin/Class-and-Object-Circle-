public class BMW extends Car{
		private int alloyWheels;
		public BMW(String model, String color, int wheelcount) {
			this.model=model;
			this.color=color;
			this.alloyWheels=wheelcount;
			
		}
		int getAlloyWheelCount() {
			return alloyWheels;
		}
	}