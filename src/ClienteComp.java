public class ClienteComp extends Cliente {
    private String tecnologia;
    private String EspecialidadeDaEmpresa;

        public String getTecnologia() {
            return this.tecnologia;
        }

        public void setTecnologia(String tecnologia) {
            this.tecnologia = tecnologia;
        }

        public String getEspecialidadeDaEmpresa() {
            return this.EspecialidadeDaEmpresa;
        }

        public void setEspecialidadeDaEmpresa(String EspecialidadeDaEmpresa) {
            this.EspecialidadeDaEmpresa = EspecialidadeDaEmpresa;
        }

    @Override
    public void RetornaTipoCliente(){
        System.out.println("Cliente de Computacao \n");
        System.out.println(getNome() + "\n" + getEndereco() + "\n" + getDataDaPostagem() + "\n" + getTelefone() + "\n" + getTecnologia() + "\n" + 
        getEspecialidadeDaEmpresa() + "\n" + getNomeDoProduto() + "\n" + getDescricaoProduto() + "\n" + getPreco() );
    }
}