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
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
