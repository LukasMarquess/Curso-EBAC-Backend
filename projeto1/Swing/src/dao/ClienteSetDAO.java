package dao;

import domain.Cliente;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class ClienteSetDAO implements IClienteDAO {
    
    private Set<Cliente> set;

    public ClienteSetDAO() {
        this.set = new HashSet<>();
    }

    @Override
    public Boolean cadastrar(Cliente cliente) {
        for (Cliente c : this.set) {
            if (c.getCpf().equals(cliente.getCpf())) {
                return false; 
            }
        }
        this.set.add(cliente);
        return true;
    }

    @Override
    public void excluir(Long cpf) {
        Cliente clienteParaRemover = null;
        for (Cliente c : this.set) {
            if (c.getCpf().equals(cpf)) {
                clienteParaRemover = c;
                break;
            }
        }
        if (clienteParaRemover != null) {
            this.set.remove(clienteParaRemover);
        }
    }

    @Override
    public void alterar(Cliente cliente) {
        for (Cliente c : this.set) {
            if (c.getCpf().equals(cliente.getCpf())) {
                c.setNome(cliente.getNome());
                c.setTel(cliente.getTel());
                c.setEnd(cliente.getEnd());
                c.setNumero(cliente.getNumero());
                c.setCidade(cliente.getCidade());
                c.setEstado(cliente.getEstado());
                break;
            }
        }
    }

    @Override
    public Cliente consultar(Long cpf) {
        for (Cliente c : this.set) {
            if (c.getCpf().equals(cpf)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return this.set;
    }
}