import java.util.ArrayList;
import java.util.List;

public class OrdemDeServico {
    private int codigo;
    private Cliente cliente;
    private List<Servico> servicos;

    public OrdemDeServico(int codigo, Cliente cliente) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.servicos = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "OrdemDeServico{" + "codigo=" + codigo + ", cliente=" + cliente + ", servicos=" + servicos + '}';
    }
    
    public double calculaValorTotal(){
        double valorTotal = 0d;
        if(!servicos.isEmpty()){
            for(Servico s: servicos){
                valorTotal += s.getValor();
            }
        }return va
    }
    
    
}
