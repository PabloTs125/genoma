    import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {

         
        int Maquina = (int)(Math.random()*3+0);
        int OpcUsuario, x=0;
        Scanner lector = new Scanner (System.in);

    

    do{     System.out.println("ESCOGE UNA DE LAS SIGUIENTES OPCIONES: ");
            System.out.println("1: EMPEZAR PARTIDA");
            System.out.println("2: INSTRUCCIONES");
            System.out.println("3: SALIR DEL JUEGUITO");
                OpcUsuario = lector.nextInt();
                    lector.nextLine();

       if (OpcUsuario == 1){
        

            System.out.println("ESCOGE UNA DE LAS SIGUIENTES OPCIONES: ");
            System.out.println("1- Piedra ");
            System.out.println("2- Papel ");
            System.out.println("3- Tijera ");
            OpcUsuario = lector.nextInt();
                    lector.nextLine();
        
            if (Maquina == 1){
                System.out.println("LA MAQUINA ESCOGIO PIEDRA");
            }else if(Maquina == 2){
                System.out.println("LA MAQUINA ESCOGIO PAPEL");
            }else if(Maquina == 1){
                System.out.println("LA MAQUINA ESCOGIO TIJERA");
            }

        Mano manoJugador1 = new Tijera();
        Mano manoJugador2 = new Piedra();

        Resultado resultadoJugador2 = manoJugador1.jugar(manoJugador2);
        switch (resultadoJugador2) {
            case GANA: System.out.println("Gana jugador 2!");
                break;
            case PIERDE: System.out.println("Gana jugador 1!");
                break;
            case EMPATA: System.out.println("Empate");
                break;
            default: throw new IllegalArgumentException("Resultado errÃ³neo.");}

        } else if(OpcUsuario == 2){
            System.out.println("ESTAS SON LAS INSTRUCCIONES DEL JUEGO");
            System.out.println("DEBES ELEGIR ENTRE PIEDRA PAPEL O TIJERAS");
            System.out.println("IGUALMENTE TU RIVAL DEBERA ESCOGER UNA ");
            System.out.println("RECUERDA QUE:");
            System.out.println("PIEDRA VENCE A TIJERA DESTROZANDOLA A GOLPE");
            System.out.println("LA TIJERA VENCE A PAPEL CORTANDOLO A PEDAZITOS");
            System.out.println("PAPEL VENCE A PIEDRA ENVOLVIENDOLO HASTA DEJARLO SIN AIRE ");
        }else if(OpcUsuario == 3){
            System.out.println("ABANDONASTE EL JUEGO ");
        }
     }while (x!= 3);        
}
}
