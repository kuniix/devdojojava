package devdojo.introducao;

public class SwitchExercicio {
    public static void main(String[] args) {
        //Dados is valores de 1 a 7, imprima se é dia util ou final de semana
        //Considerando 1 como domingo

        int dia = 7;
        switch (dia){
            case 1, 7:
                System.out.println("Final de semana");
                break;
            case 2, 3, 4, 5, 6:
                System.out.println("Dia util");
            default:
                System.out.println("Opção inválida");
        }
    }
}
