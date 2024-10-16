import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        int cantidadPersonas = 5;

        Persona[] personas = new Persona[cantidadPersonas];
        int[] personasInt = new int[cantidadPersonas];

        personasInt[0] = 1; 
        personas[0] = new Persona("Juan", 20);

        Scanner scanner = new Scanner(System.in);


            System.out.println("Ingrese la cantidad de personas del listado: "+ scanner);
            cantidadPersonas = scanner.nextInt();
            scanner.nextLine();
        
        
        for (int i=0;i<cantidadPersonas;i++){
            System.out.println("Ingrese el nombre de la persona: " );
            String nombre = scanner.nextLine();
            System.out.println("Ingrese la edad de la persona: ");
            int edad = scanner.nextInt();
            scanner.nextLine();
            personas[i] = new Persona(nombre, edad);
        }


        System.out.println("Valor de la persona a encontar : "+);
        cantidadPersonas=scanner.nextInt();
        scanner.nextLine();
    }

    public void SortbyEdad(Persona[] personas) {
        for (int i = 0; i < personas.length; i++) {
            for (int j = i + 1; j < personas.length; j++) {
                if (personas[i].getEdad() < personas[j].getEdad()) {
                    Persona aux = personas[i];
                    personas[i] = personas[j];
                    personas[j] = aux;

                }
            }
        }
    }

    public int findByEdad(Persona[] personas, int edad){

        int inicio=0;
        int fin=personas.length -1;
        while(inicio <= fin){
            int medio = inicio + (fin-inicio)/2;
            if(personas[medio].getEdad() == edad){
                return medio;
            }
            if(personas[medio].getEdad() < edad){
                inicio=medio+1;
            }else{
                fin=medio-1;
            }
        }
        return -1;
    }



}
