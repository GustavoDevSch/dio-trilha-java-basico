public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        smartTv.ligar();
        System.out.println("TV ligada? " + smartTv.ligada);
        smartTv.abaixarVolume();
        smartTv.abaixarVolume();
        smartTv.abaixarVolume();
        smartTv.abaixarVolume();
        System.out.println("Volume atual : " + smartTv.volume);
        smartTv.definirCanal(13);


        
        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("Volume atual : " + smartTv.volume);
        
        smartTv.desligar();
        System.out.println("TV ligada? " + smartTv.ligada);
        }
}
