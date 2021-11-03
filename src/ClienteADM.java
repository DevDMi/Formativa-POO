public class ClienteADM extends Cliente {
    private String TipoConsultoria;
    private String DescricaoConsultoria;

        public String getTipoConsultoria() {
            return this.TipoConsultoria;
        }

        public void setTipoConsultoria(String TipoConsultoria) {
            this.TipoConsultoria = TipoConsultoria;
        }

        public String getDescricaoConsultoria() {
            return this.DescricaoConsultoria;
        }

        public void setDescricaoConsultoria(String DescricaoConsultoria) {
            this.DescricaoConsultoria = DescricaoConsultoria;
        }

    @Override
    public void RetornaTipoCliente(){
        System.out.println(" Cliente de Administracao \n");
        System.out.println(getNome() + "\n" + getEndereco() + "\n" + getDataDaPostagem() + "\n" + getTelefone() + "\n" + getTipoConsultoria() 
        + "\n" + getDescricaoConsultoria() + "\n" + getNomeDoProduto() + "\n" + getDescricaoProduto() + "\n" + getPreco() + "\n" );
    }
}
