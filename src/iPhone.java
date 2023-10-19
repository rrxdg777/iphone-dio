public class iPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    @Override
    public void ligar(String numero) {
        System.out.println("\n\nLingando para: "+ numero + "\n\n");
        
    }

    @Override
    public void atender() {
        
        System.out.println("\n\nAtendeu!");
    }

    @Override
    public void iniciarConversaVoz() {
        
        System.out.println("\n\nConversa de voz iniciada!");
    }

    @Override
    public void exibirPagina(String url) {
        
       System.out.println("\n\nExibindo pagina!'");
    }

    @Override
    public void adicionarNovaAba() {
        
       System.out.println("\n\nNova aba adicionada!");
    }

    @Override
    public void atualizarPagina() {
        
       System.out.println("\n\nAtualizando pagina..!");
    }


    @Override
    public void tocar() {
        
       System.out.println("\n\nTocar Música!");
    }

    @Override
    public void pausar() {
        
       System.out.println("\n\nMusica Pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        
       System.out.println("\n\n Musica selecionada");
    }

    
}
