public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Gabriel","08701532112");
        Cliente cliente2 = new Cliente("Anthoni","04008012016");
        Cliente cliente3 = new Cliente("Pedro","62873829412");

        Servico servico1 = new Servico(1,"Limpar",200.0);
        Servico servico2 = new Servico(2,"Cozinhar",350.0);
        Servico servico3 = new Servico(3,"Consertar",100.0);

        OrdemDeServico ordemDeServico1 = new OrdemDeServico(1,cliente1);
        OrdemDeServico ordemDeServico2 = new OrdemDeServico(2,cliente1);
        OrdemDeServico ordemDeServico3 = new OrdemDeServico(3,cliente2);
        OrdemDeServico ordemDeServico4 = new OrdemDeServico(4,cliente2);
        OrdemDeServico ordemDeServico5 = new OrdemDeServico(5,cliente3);
        OrdemDeServico ordemDeServico6 = new OrdemDeServico(6,cliente3);

        ordemDeServico1.adicionarServico(servico1);
        ordemDeServico1.adicionarServico(servico3);

        ordemDeServico2.adicionarServico(servico2);
        ordemDeServico2.adicionarServico(servico3);

        ordemDeServico3.adicionarServico(servico1);
        ordemDeServico3.adicionarServico(servico1);

        ordemDeServico4.adicionarServico(servico2);
        ordemDeServico4.adicionarServico(servico3);

        ordemDeServico5.adicionarServico(servico2);
        ordemDeServico5.adicionarServico(servico1);

        ordemDeServico6.adicionarServico(servico1);

        Oficina oficina = new Oficina();
        oficina.adicionaOS(ordemDeServico1);
        oficina.adicionaOS(ordemDeServico4);

        System.out.println(oficina.buscaOSCodigo(1));
        System.out.println(oficina.buscaOSCPF("04008012016"));
        System.out.println(oficina.buscaOSServico(servico2.getCodigo()));

        System.out.println("Valor total: " + oficina.calculaFaturamentoTotal());
    }
}
