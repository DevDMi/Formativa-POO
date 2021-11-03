public class ClienteEng extends Cliente {
    private String TipoEngenharia;
    private String DescricaoDeAtividades;

        public String getTipoEngenharia() {
            return this.TipoEngenharia;
        }

        public void setTipoEngenharia(String TipoEngenharia) {
            this.TipoEngenharia = TipoEngenharia;
        }

        public String getDescricaoDeAtividades() {
            return this.DescricaoDeAtividades;
        }

        public void setDescricaoDeAtividades(String DescricaoDeAtividades) {
            this.DescricaoDeAtividades = DescricaoDeAtividades;
        }

    @Override
    public void RetornaTipoCliente(){
        System.out.println(" Cliente de Engenharia \n");
        System.out.println(getNome() + "\n" + getEndereco() + "\n" + getDataDaPostagem() + "\n" + getTelefone() + "\n" + getTipoEngenharia() 
        + "\n" + getDescricaoDeAtividades() + getNomeDoProduto() + "\n" + getDescricaoProduto() + "\n" + getPreco() + "\n");
    }
}