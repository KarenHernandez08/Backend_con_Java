package semana1;

public class Sorpresa {
    //Caracteristicas
    public String nombre, color, tipo;
    public double velocidad, longitud, altura, masa;

    public String getNombre(){ return nombre;}
    public String getColor(){ return color;}
    public String getTipo(){ return tipo;}
    public double getVelocidad(){ return velocidad;}
    public double getLongitud(){ return longitud;}
    public double getAltura(){ return altura;}
    public double getMasa(){ return masa;}

    public boolean setNombre(String nombre){
        if (!nombre.isEmpty()){
            this.nombre=nombre;
            return true;
        }else
            return false;
    }

    public boolean setColor(String color){
        if (!color.isEmpty()){
            this.color=color;
            return true;
        } else
            return false;
    }

    public boolean setTipo(String tipo){
        if(!tipo.isEmpty()){
            this.tipo=tipo;
            return true;
        }else
            return false;
    }

    public boolean setVelocidad(double velocidad){
        if(velocidad>=0){
            this.velocidad= velocidad;
            return true;
        } else
            return false;
    }

    public boolean setLongitud(double longitud){
        if(longitud>=0){
            this.longitud=longitud;
            return true;
        }else
            return false;
    }

    public boolean setAltura(double altura){
        if(altura>=0){
            this.altura=altura;
            return true;
        }else
            return false;
    }

    public boolean setMasa(double masa){
        if(masa>=0){
            this.masa=masa;
            return true;
        }else
            return false;
    }

    public String printState(){
        return "nombre: "+ nombre + "\n"+
                "color: "+ color + "\n"+
                "tipo: "+ tipo + "\n"+
                "velocidad: "+ velocidad + "\n"+
                "longitud: "+ longitud + "\n"+
                "altura: " + altura + "\n"+
                "masa: "+ masa;

    }



}
