public class Principal {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();

        c.ligar();
        c.maisVolume();
        c.play();
        c.ligarMudo();
        c.desligarMudo();
        c.pause();
        c.desligar();
        c.abrirMenu();
    }
}
