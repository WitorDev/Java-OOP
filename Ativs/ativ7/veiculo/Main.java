package veiculo;
public class Main {
    public static void main(String[] args) {

        Veiculo v1 = new Veiculo("Ford", "Fusion", 2010);
        System.out.println(v1.exibirInformacoes());


        Veiculo v2 = new Veiculo("Fiat", "Toro");
        v2.exibirInformacoes();
        System.out.println(v2.exibirInformacoes());

        Moto moto = new Moto("Honda", "CG 160", 2022, 150);
        System.out.println(moto.exibirInformacoes());

        Caminhao caminhao = new Caminhao("Volvo", "FH", 2015, 20.5, 8);
        System.out.println(caminhao.exibirInformacoes());
    }
}
