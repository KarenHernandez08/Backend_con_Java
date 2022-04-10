package semana1;

public class PruebaBicicleta {
    public static void main (String[] args) {
       def();
    }
    public static void def() {
        Bicicleta bicimountain = new Bicicleta();
        bicimountain.setColor("Negra");
        bicimountain.setPins(6);
        bicimountain.setRodada(26);
        bicimountain.setVelocidad(13.2);

        String msg = "Soy una bici de montaña con estas caracteristicas: ";
        msg += "\nColor: " + bicimountain.getcolor();
        msg += "\nVelocidad: " + bicimountain.getVelocidad();
        msg += "\nPins: " + bicimountain.getPins();
        msg += "\nRodada: " + bicimountain.getRodada();

        System.out.print(msg);
    }

}

