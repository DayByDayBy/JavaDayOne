public class Main {
    public static void main(String[] args) {
        Calculator sum = new Calculator();
        System.out.println(sum.addTo(13, 5));
        System.out.println(sum.subtractFrom(13, 5));
        System.out.println(sum.multiplyBy(13, 5));
        System.out.println(sum.divideBy(13.0, 5.0));
    }

}


