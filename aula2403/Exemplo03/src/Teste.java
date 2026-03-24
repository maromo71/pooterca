public class Teste {

    static void main() {
        Mes mesCompra = Mes.julho;
        System.out.println(mesCompra);

        System.out.println("Lista dos meses: ");

        for(Mes mes : Mes.values()){
            System.out.println(mes.ordinal() + 1);
            System.out.println("Mes: " + mes);

        }

        Mes mesAtual = Mes.março;
        Mes mesPretendido = Mes.março;

        if(mesAtual == mesPretendido){
            System.out.println("Sao meses iguais");
        }else{
            if(mesAtual.ordinal() < mesPretendido.ordinal()){
                System.out.println("Mes " + mesAtual + " vem antes");
            }else{
                System.out.println("Mes " + mesPretendido + " vem antes");
            }
        }


    }
}
