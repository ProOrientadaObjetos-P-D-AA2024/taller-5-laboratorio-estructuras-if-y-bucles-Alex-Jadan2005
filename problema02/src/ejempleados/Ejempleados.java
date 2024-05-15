package ejempleados;

import java.util.Scanner;

public class Ejempleados {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //crear
        String nombre;
        double salario,aumento=0;
        int edad,c=0;
        //CREAR ARREGLO
        Empleado []em=new Empleado[30];
        //CREAR UN SWITCH
        boolean op=true,validar;
        int n;
        while(op){          
            System.out.println("=========================\nGESTIONAR EMPLEADOS\n=========================");
            System.out.println("Seleccione una opcion:\nOpcion 1: Agregar un empleado\n"
                    + "Opcion 2: Mostrar informacion de empleado"
                    + "\nOpcion 3: Calcular aumento de salario"+
                    "\nOpcion 4: Salir");
            n=sc.nextInt();
            //CREAR SWITCH
            switch(n){
                case 1:
                    sc.nextLine();
                    System.out.print("Empleado:  ");
                    nombre=sc.nextLine();
                    System.out.print("Salario: ");
                    salario=sc.nextDouble();
                    System.out.print("Edad: ");
                    edad=sc.nextInt(); 
                    //CREAR OBJETO
                    Empleado e=new Empleado(nombre,salario,edad);
                    //AGREGAR INFORMACION AL OBJETO ARREGLO
                    em[c]=e;
                    //sirve para que si el usuario ingresa 2 sin antes haber ceado un empleado
                    //se dara un aviso q no puede mostrar informacion escasa
                    c++;
                    
                    break;
                case 2:
                    if(c==0){
                        System.out.println("No se ha agregado ningun empleado a la lista,"
                                + "por favor dirijase primero a la primera opcion");
                    }else{
                        System.out.println("LISTA DE EMPLEADOS");
                        for(int i=0;i<c;i++){
                            System.out.println(em[i].toString()
                                    +"\n====================================");
                        }
                    }
                    
                    break;
                case 3:
                    System.out.println("Ingrese un porcentaje de aumento salarial: ");
                    aumento=sc.nextInt();
                    aumento=aumento/100;
                    for(int i=0;i<c;i++){
                        if(em[i].getSalario()<50){
                            aumento=em[i].getSalario()+(aumento*em[i].getSalario());
                            System.out.println("Se aumentó el salario de "+
                                    em[i].getNombre()+"\nSalario Total: "+aumento);
                        }
                    }
                    
                    break;
                case 4:
                    op=false;
                default:
                    System.out.println("Ingrese una opcio valida");
                    break;
            }
            
        }
        
        
    }
    
}
