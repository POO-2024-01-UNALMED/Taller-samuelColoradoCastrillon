package comunicacion;

public class Alfabeto extends Pictograma{
    //Atributos
    private String[] letras;
    private String interpretacion;

    //Constructor
    public Alfabeto(String origen, String[] letras, String interpretacion){
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }

    //Metodos
    public String[] getLetras() {
        return letras;
    }
    public void setLetras(String[] letras) {
        this.letras = letras;
    }
    public String interpretacion(){
        return interpretacion;
    }
    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
    public int cantidadLetras(){
        return letras.length;
    }
    public String toString(){
        String string = "";
        for (int i = 0; i < letras.length; i++){
            string += letras[i];
            if (i < letras.length - 1) {
                string += ", ";
            }
        }
        return string;
    }
}