class Honda extends Car{
		private int normalWheels;
		public Honda(String model, String colour, int wheelcount) {
			this.model=model;
			this.color=colour;
			this.normalWheels=wheelcount;
		}
		int getNormalWheelCount() {
			return normalWheels;
		}
	}