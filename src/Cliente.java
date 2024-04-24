public class Cliente extends Pessoa {
    
    private String telefone;

    public Cliente() {

    }

    public Cliente(int id, String nome, String telefone) {
        super(id, nome);
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {

        return super.toString() + "Telefone: " + telefone;
    }

}
