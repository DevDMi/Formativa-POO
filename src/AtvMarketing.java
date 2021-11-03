public  class AtvMarketing {

    public static void main(String[] args){
        ClienteComp comp = new ClienteComp();

            comp.setNome("Davi Miranda");
            comp.setEndereco("itapua");
            comp.setDataDaPostagem("21/11/2020");
            comp.setTelefone("71991364965");
            comp.setEspecialidadeDaEmpresa("Desenvolvimento de Apps");
            comp.setTecnologia("JavaScript");
            comp.setNomeDoProduto("Propaganda");
            comp.setDescricaoProduto("Propaganda do novo app do Cliente");
            comp.setPreco("3500,00");

            
        
            comp.RetornaTipoCliente();

            
        
        ClienteADM adm = new ClienteADM();
            adm.setNome("Silmara");
            adm.setEndereco("Salvador");
            adm.setDataDaPostagem("02/11/2021");
            adm.setTelefone("995494984");
            adm.setTipoConsultoria("Consultoria Financeira");
            adm.setDescricaoConsultoria("Consultoria para pequenas e medias empresas");
            adm.setNomeDoProduto("Divulgacao");
            adm.setDescricaoProduto("Divulgacao dos servicos da Empresa");
            adm.setPreco("4000,00");
        
            adm.RetornaTipoCliente();

        ClienteEng eng = new ClienteEng();
            eng.setNome("Andre");
            eng.setEndereco("Salvador");
            eng.setDataDaPostagem("19/12/2020");
            eng.setTelefone("992586345");
            eng.setTipoEngenharia("Civil");
            eng.setDescricaoDeAtividades("Construcao de Encostas");
            eng.setNomeDoProduto("Apresentacao");
            eng.setDescricaoProduto("Criacao da apresentacao do Projeto da empresa");
            eng.setPreco("2000,00");

            eng.RetornaTipoCliente();
    }
    
}
