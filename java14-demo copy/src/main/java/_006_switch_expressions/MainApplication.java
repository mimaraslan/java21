package _006_switch_expressions;

public class MainApplication {

    public enum SingleUsePlastic {
        SPOON, FORK, BOTTLE, CUP
    }

    public int calculateDamageToPlanet(SingleUsePlastic plastic) {
        return switch (plastic) {
            case BOTTLE -> 100;
            case FORK, CUP -> 20;
            case SPOON -> {
                int temp = 10;
                yield 30;
            }
            default -> 0;
        };
    }

    public static void main(String[] args) {
        MainApplication obj = new MainApplication();
        System.out.println(obj.calculateDamageToPlanet(SingleUsePlastic.SPOON));
    }
}
