public class Cliente extends DadosProduto {
    private String Nome;
    private String Endereco;
    private String DataDaPostagem;
    private String Telefone;
    

    // Get and Set
    public String getNome() {
        return this.Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEndereco() {
        return this.Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getDataDaPostagem() {
        return this.DataDaPostagem;
    }

    public void setDataDaPostagem(String DataDaPostagem) {
        this.DataDaPostagem = DataDaPostagem;
    }

    public String getTelefone() {
        return this.Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public void RetornaTipoCliente() {
        System.out.print(" Cliente Padrao +\n");
        System.out.println(getNome() + "\n" + getEndereco() + "\n" + getDataDaPostagem() + "\n" + getTelefone() + "\n" );
    }
    
        
    
}
