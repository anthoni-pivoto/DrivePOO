
import java.util.ArrayList;
import java.util.List;

public class Oficina {
    private List<OrdemDeServico> ordensServico;

    public Oficina(){
        this.ordensServico = new ArrayList<>();
    }
    
    public void adicionaOS(OrdemDeServico ordemServico){
        ordensServico.add(ordemServico);
    }
    
    public OrdemDeServico buscaOSCodigo(int codigo){
        if(!ordensServico.isEmpty()){
            for(OrdemDeServico os: ordensServico){
                if(codigo == os.getCodigo()){
                    return os;
                }
            }
        }return null;
    }
    
    public List<OrdemDeServico> buscaOSCPF(String cpf){
        List<OrdemDeServico> OSCpflist = new ArrayList<>();
        if(!ordensServico.isEmpty()){
            for(OrdemDeServico os: ordensServico){
                if(cpf.equalsIgnoreCase(os.getCliente().getCpf())){
                    OSCpflist.add(os);
                }
            }
        }return OSCpflist;
    }
    
    public List<OrdemDeServico> buscaOSServico(int codigo){ 
        List<OrdemDeServico> OSServicolist = new ArrayList<>();
        if(!ordensServico.isEmpty()){
            for(OrdemDeServico os : ordensServico){
                if(codigo == os.getCodigo()){
                    OSServicolist.add(os);
                }
            }
        }return OSServicolist;
    }
    
    public double calculaFaturamentoTotal(){
        double vlTotal = 0;
        for(OrdemDeServico os: ordensServico){
            vlTotal += os.calculaValorTotal();
        }
        return vlTotal;
    }
}
