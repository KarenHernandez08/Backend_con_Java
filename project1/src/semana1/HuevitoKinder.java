package semana1;

public class HuevitoKinder {
    public static void main (String[] args) {
        def();
    }

    public static void def() {
        Sorpresa kindersorpresa= new Sorpresa();
        kindersorpresa.setNombre("Hipopotamo");
        kindersorpresa.setColor("Gris");
        kindersorpresa.setTipo("Mamifero");
        kindersorpresa.setVelocidad(48);
        kindersorpresa.setLongitud(3.3);
        kindersorpresa.setAltura(1.3);
        kindersorpresa.setMasa(1500);

        String msg = "El animal que salio en el huevito kinder tiene como caracteristicas : ";
        msg += "\nNombre: " + kindersorpresa.getNombre();
        msg += "\nColor: " + kindersorpresa.getColor();
        msg += "\nTipo: " + kindersorpresa.getTipo();
        msg += "\nVelocidad: " + kindersorpresa.getVelocidad() + "km/hrs";
        msg += "\nLongitud: "+ kindersorpresa.getLongitud()+ "Metros";
        msg += "\nAltura: " + kindersorpresa.getAltura()+ "Metros";
        msg += "\nMasa: "+ kindersorpresa.getMasa()+ "Kilos";


        System.out.print(msg);
    }
}
