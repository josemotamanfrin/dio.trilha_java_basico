public class SmartTv{
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }    
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentar Volume para :" + volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuir Volume para :" + volume);
    }
    public void aumentarCanal(){
        canal ++;
    }
    public void diminuirCanal(){
        canal --;
    }
}