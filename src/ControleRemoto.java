public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private void setLigado(boolean ligado) { this.ligado = ligado; }
    private boolean getLigado() { return ligado; }

    private void setTocando(boolean tocando) { this.tocando = tocando; }
    private boolean getTocando() { return tocando; }

    private void setVolume(int volume) { this.volume = volume; }
    private int getVolume() { return volume; }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("_____MENU_____");
        System.out.println("Esta ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.println("Volume " + this.getVolume());

        /*for(int i = 0; i <= this.getVolume(); i = i + 10){
            System.out.println("|");
        }*/
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()){ this.setVolume(this.getVolume()+1); }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()){ this.setVolume(this.getVolume()-1); }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0){ this.setVolume(0); }
    }

    @Override
    public void desligarMudo() { if(this.getLigado() && this.getVolume() == 0){ this.setVolume(50); }
    }

    @Override
    public void play() {  if(this.getLigado() && !this.getTocando()){ this.setTocando(true); }
    }

    @Override
    public void pause() { if(this.getLigado() && this.getTocando()){ this.setTocando(false); }
    }
}