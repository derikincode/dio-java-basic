public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolue() {
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Mudando o canal para: " + canal);
    }

    public void pularCanal() {
        canal++;
        System.out.println("Mudando o canal para: " + canal);
    }

    public void voltarCanal() {
        canal--;
        System.out.println("Mundando o canal para: " + canal);
    }
}
