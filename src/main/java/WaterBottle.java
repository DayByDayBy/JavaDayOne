public class WaterBottle {
        private int volume;

        public WaterBottle(int volume){
            this.volume = volume;
        }
        public int drinkWater() {
            volume = this.volume - 10;
            return this.volume;
        }

        public int emptyBottle() {
            return this.volume - this.volume;
        }

        public int fillBottle() {
            this.volume = 100;
            return this.volume;
    }


}
